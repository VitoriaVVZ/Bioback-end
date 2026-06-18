package com.exemple.controledemateriais.controllers;
import com.exemple.controledemateriais.entities.Categoria;
import com.exemple.controledemateriais.entities.Material;
import com.exemple.controledemateriais.entities.Movimentacao;
import com.exemple.controledemateriais.repositories.CategoriaRepository;
import com.exemple.controledemateriais.repositories.MaterialRepository;
import com.exemple.controledemateriais.repositories.MovimentacaoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MaterialController {

    private final MaterialRepository materialRepository;
    private final MovimentacaoRepository movimentacaoRepository;
    private final CategoriaRepository categoriaRepository;

    // Construtor unificado recebendo os 3 repositórios (sem usar @Autowired)
    public MaterialController(MaterialRepository materialRepository,
                              MovimentacaoRepository movimentacaoRepository,
                              CategoriaRepository categoriaRepository) {
        this.materialRepository = materialRepository;
        this.movimentacaoRepository = movimentacaoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/categorias/valor-total")
    public List<Map<String, Object>> listarValorPorCategoria() {
        System.out.println("LOG EXECUÇÃO: Calculando valor total por categoria.");
        List<Categoria> categorias = categoriaRepository.findAll();
        List<Material> materiais = materialRepository.findAll();
        List<Map<String, Object>> resultado = new ArrayList<>();

        for (Categoria cat : categorias) {
            double totalFinanceiro = 0.0;
            for (Material mat : materiais) {
                if (mat.getCategoriaId() == cat.getId()) {
                    totalFinanceiro += (mat.getQuantidade() * mat.getValorUnitario());
                }
            }
            Map<String, Object> linha = new HashMap<>();
            linha.put("categoria", cat.getNome());
            linha.put("valorTotal", totalFinanceiro);
            resultado.add(linha);
        }
        return resultado;
    }

    @GetMapping("/materiais")
    public List<Material> listarTodosMateriais() {
        System.out.println("LOG EXECUÇÃO: Listando todos os materiais.");
        return materialRepository.findAll();
    }

    @PostMapping("/materiais")
    public ResponseEntity<String> cadastrarMaterial(@RequestBody Material novoMaterial) {
        System.out.println("LOG EXECUÇÃO: Cadastrando novo material.");

        if (novoMaterial.getValorUnitario() <= 0) {
            return ResponseEntity.badRequest().body("Erro: O valor unitario deve ser maior que zero.");
        }
        if (novoMaterial.getQuantidade() < 0) {
            return ResponseEntity.badRequest().body("Erro: A quantidade nao pode ser negativa.");
        }
        if (novoMaterial.getCategoriaId() <= 0) {
            return ResponseEntity.badRequest().body("Erro: Categoria invalida.");
        }

        materialRepository.save(novoMaterial);
        return ResponseEntity.ok("Material cadastrado com sucesso!");
    }

    @GetMapping("/movimentacoes/saidas")
    public List<Movimentacao> listarSaidas() {
        System.out.println("LOG EXECUÇÃO: Filtrando movimentacoes de SAIDA.");
        List<Movimentacao> todas = movimentacaoRepository.findAll();
        List<Movimentacao> apenasSaidas = new ArrayList<>();

        for (Movimentacao mov : todas) {
            if ("SAIDA".equalsIgnoreCase(mov.getTipo())) {
                apenasSaidas.add(mov);
            }
        }
        return apenasSaidas;
    }

    @PostMapping("/movimentacoes/entrada")
    public ResponseEntity<String> registrarEntrada(@RequestParam long materialId, @RequestParam int quantidade) {
        System.out.println("LOG EXECUÇÃO: Registrando entrada para o Material ID: " + materialId);

        Material material = materialRepository.findById(materialId).orElse(null);
        if (material == null) {
            return ResponseEntity.badRequest().body("Erro: Material nao encontrado.");
        }

        Movimentacao mov = new Movimentacao(
                materialId,
                materialId,
                material.getNome(),
                "ENTRADA",
                quantidade,
                (quantidade * material.getValorUnitario()),
                LocalDate.now()
        );

        movimentacaoRepository.save(mov);
        mov.setMaterialId(materialId);
        mov.setTipo("ENTRADA");
        mov.setQuantidade(quantidade);
        mov.setValorTotal(quantidade * material.getValorUnitario());
        mov.setData(LocalDate.now());
        movimentacaoRepository.save(mov);

        material.setQuantidade(material.getQuantidade() + quantidade);
        materialRepository.save(material);

        return ResponseEntity.ok("Entrada registrada e estoque somado!");
    }

    @GetMapping("/movimentacoes/periodo")
    public List<Map<String, Object>> listarPorPeriodo(@RequestParam String inicio, @RequestParam String fim) {
        System.out.println("LOG EXECUÇÃO: Filtrando relatorio por periodo.");
        LocalDate dataInicio = LocalDate.parse(inicio);
        LocalDate dataFim = LocalDate.parse(fim);

        List<Material> materiais = materialRepository.findAll();
        List<Movimentacao> movimentacoes = movimentacaoRepository.findAll();
        List<Map<String, Object>> resultado = new ArrayList<>();

        for (Material mat : materiais) {
            int totalEntradas = 0;
            int totalSaidas = 0;
            double valorEntradas = 0.0;
            double valorSaidas = 0.0;

            for (Movimentacao mov : movimentacoes) {
                if (mov.getMaterialId() == mat.getId() && !mov.getData().isBefore(dataInicio) && !mov.getData().isAfter(dataFim)) {
                    if ("ENTRADA".equalsIgnoreCase(mov.getTipo())) {
                        totalEntradas += mov.getQuantidade();
                        valorEntradas += (mov.getQuantidade() * mat.getValorUnitario());
                    } else if ("SAIDA".equalsIgnoreCase(mov.getTipo())) {
                        totalSaidas += mov.getQuantidade();
                        valorSaidas += (mov.getQuantidade() * mat.getValorUnitario());
                    }
                }
            }

            Map<String, Object> linha = new HashMap<>();
            linha.put("nome_material", mat.getNome());
            linha.put("unidade_medida", mat.getUnidadeMedida());
            linha.put("total_entradas", totalEntradas);
            linha.put("total_saidas", totalSaidas);
            linha.put("saldo_no_periodo", (totalEntradas - totalSaidas));
            linha.put("valor_total_financeiro_das_entradas", valorEntradas);
            linha.put("valor_total_financeiro_das_saidas", valorSaidas);
            resultado.add(linha);
        }
        return resultado;
    }

    @GetMapping("/movimentacoes/maior-saida")
    public List<Map<String, Object>> listarMaiorSaidaNoPeriodo(@RequestParam String inicio, @RequestParam String fim) {
        System.out.println("LOG EXECUÇÃO: Calculando maiores volumes de saida.");
        LocalDate dataInicio = LocalDate.parse(inicio);
        LocalDate dataFim = LocalDate.parse(fim);

        List<Material> materiais = materialRepository.findAll();
        List<Movimentacao> movimentacoes = movimentacaoRepository.findAll();
        List<Map<String, Object>> resultado = new ArrayList<>();

        for (Material mat : materiais) {
            int qtdTotalSaida = 0;
            for (Movimentacao mov : movimentacoes) {
                if (mov.getMaterialId() == mat.getId() && "SAIDA".equalsIgnoreCase(mov.getTipo()) && !mov.getData().isBefore(dataInicio) && !mov.getData().isAfter(dataFim)) {
                    qtdTotalSaida += mov.getQuantidade();
                }
            }

            if (qtdTotalSaida > 0) {
                Map<String, Object> linha = new HashMap<>();
                linha.put("nome_material", mat.getNome());
                linha.put("quantidade_total_saida", qtdTotalSaida);
                linha.put("valor_total_financeiro_das_saidas", (qtdTotalSaida * mat.getValorUnitario()));
                resultado.add(linha);
            }
        }
        return resultado;
    }

    @GetMapping("/materiais/limites")
    public List<Map<String, Object>> identificarLimites() {
        System.out.println("LOG EXECUÇÃO: Verificando limites minimos e maximos.");
        List<Material> materiais = materialRepository.findAll();
        List<Map<String, Object>> resultado = new ArrayList<>();

        for (Material mat : materiais) {
            if (mat.getQuantidade() <= 0 || mat.getQuantidade() >= 100) {
                double percentual = (mat.getQuantidade() / 100.0) * 100.0;

                Map<String, Object> linha = new HashMap<>();
                linha.put("nome_material", mat.getNome());
                linha.put("quantidade", mat.getQuantidade());
                linha.put("percentual_nivel_atingido", percentual + "%");
                resultado.add(linha);
            }
        }
        return resultado;
    }
}