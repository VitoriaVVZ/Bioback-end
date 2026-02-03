package aula3;

import java.util.Scanner;

public class IfElse {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int idade = 18;

        if (idade < 18){
            IO.println("Foi barrado na porta");
        } else {
            IO.println("Liberado");
        }

        IO.print("Digite sua nota");
        int nota1 = sc.nextInt();

        IO.print("Digite sua nota");
        int nota2 = sc.nextInt();

        IO.print("Digite sua nota");
        int nota3 = sc.nextInt();

        double media =(nota1 + nota2 + nota3) / 3;
                System.out.println("A média aritmética é:" +media);
                if (media < 4){
                    IO.println("Reprovado");
                }
                else if (media <= 6) {
                    IO.println("Recuperação");
                } else {
                    IO.println("Aprovado");
                }
    }
}
