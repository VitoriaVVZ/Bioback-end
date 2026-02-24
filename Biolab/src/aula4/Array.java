package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    static void main() {

        List<String> nomes = new ArrayList();
        nomes.add("Vitoria");
        nomes.add("Lulu");
        nomes.add("Dumbo");

        IO.println(nomes);
        IO.println(nomes.get(0));

        // crie outra classe e solicite a entrada de um número qualquer e depois mostrar

        Scanner sc = new Scanner(System.in);
        List<Integer> numero = new ArrayList<>();
        IO.println("digite um numero");
        int abc = sc.nextInt();
        numero.add(abc);
        IO.println(numero);

        List<Integer> numeros = new ArrayList();
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);

        for (int num: numeros){
            IO.println(num);
        }


        // solicite 2 números ao usuario, adicione em uma lista e sempre mostre a soma dos números

        Scanner lu = new Scanner(System.in);
        List<Integer> sa = new ArrayList<>();
        IO.println("digite um numero");
        int num = lu.nextInt();
        int num2 = lu.nextInt();
        numeros.add(num);
        numeros.add(num2);
        IO.println(num + num2);



    }

}
