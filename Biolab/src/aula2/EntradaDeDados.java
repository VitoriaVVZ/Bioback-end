package aula2;

import java.util.Scanner;

public class EntradaDeDados {
    static void main() {


        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu nome");
        String nome = sc.next();

        IO.print("Digite sua idade");
        int idade = sc.nextInt();

        IO.print("Digite seu peso");
        double peso = sc.nextDouble();

        IO.print("Digite saua altura");
        double altura = sc.nextDouble();


        IO.println(nome);
        IO.println(idade);
        IO.println(peso);
        IO.println(altura);

        IO.println("Seu IMC é");
        double imc = peso / (altura * altura);


        System.out.println(imc);


    }
}
