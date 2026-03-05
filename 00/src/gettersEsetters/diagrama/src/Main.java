import gettersEsetters.Aluno;
import gettersEsetters.Pagamento;
import gettersEsetters.Produto;
import gettersEsetters.Responsavel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Vitor");
        System.out.println("Nome: " + aluno.getNome());

        aluno.setNasc(LocalDate.of(2005, 9, 12));
        System.out.println("Data de Nascimento: " + aluno.getNasc());

        aluno.setEmail("vi1@gmail.com");
        System.out.println("Email: " + aluno.getEmail());

        aluno.setTurma("B");
        System.out.println("Turma: " + aluno.getTurma());

        aluno.setSerie(3);
        System.out.println("Serie: " + aluno.getSerie());

        System.out.println();

        Responsavel responsavel = new Responsavel();

        responsavel.setNome("Paula Santana");
        System.out.println("Nome: " + responsavel.getNome());

        responsavel.setCpf("123.456.789-00");
        System.out.println("CPF: " + responsavel.getCpf());

        responsavel.setFone("(11) 98765-4321");
        System.out.println("Fone: " + responsavel.getFone());

        responsavel.setEmail("santpaula@gmail.com");
        System.out.println("Email: " + responsavel.getEmail());

        responsavel.setEndereco("Rua das Palmeiras, 452");
        System.out.println("Endereço: " + responsavel.getEndereco());

        responsavel.setParentesco("Mãe");
        System.out.println("Parentesco: " + responsavel.getParentesco());

        System.out.println();

        Produto produto = new Produto();

        produto.setNome("Camiseta");
        System.out.println("Produto: " + produto.getNome());

        produto.setPreço(34);
        System.out.println("Preço: R$" + produto.getPreço());

        produto.setTamanho("M");
        System.out.println("Tamanho: " + produto.getTamanho());

        produto.setQtd(50);
        System.out.println("Quantidade: " + produto.getQtd());

        produto.setFornecedor("Secretaria");
        System.out.println("Fornecedor: " + produto.getFornecedor());

        System.out.println();

        Pagamento pagamento = new Pagamento();

        pagamento.setDataPag(LocalDate.of(2026, 5, 26));
        System.out.println("Dia do Pagamento" + pagamento.getDataPag());

        pagamento.setValor(new BigDecimal("34"));
        System.out.println("Valor a pagar: " + pagamento.getValor());

        pagamento.setFormaPag("Cartão");
        System.out.println("Forma de Pagamento: " + pagamento.getFormaPag());
    }
}