import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> banco = new ArrayList<>();
        List<Pessoa> cache = new ArrayList<>();

        banco.add(new Pessoa(1, "Luisa Guimarães", 20));
        banco.add(new Pessoa(2, "Vitoria Santana", 23));
        banco.add(new Pessoa(3, "Emanuel Santiago", 46));
        banco.add(new Pessoa(4, "Sandra Oliveira", 59));
        banco.add(new Pessoa(5, "Gustavo Santos", 19));

        cache.add(new Pessoa());
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID: ");
        int id = sc.nextInt();
        boolean encontrada = false;


        while (true) {
            for (Pessoa pessoa : cache) {
                if (id == pessoa.getId()) {
                    System.out.println("Pessoa encontrada no cache: " + pessoa);
                    encontrada = true;
                }
            }

            if (!encontrada) {
                for (Pessoa pessoa : banco) {
                    if (id == pessoa.getId()) {
                        System.out.println("Pessoa buscada no banco e adicionada ao cache" + pessoa);
                        cache.add(pessoa);
                    }
                }
            }
            System.out.println("Digite outro ID");
            id = sc.nextInt();
        }
    }
}