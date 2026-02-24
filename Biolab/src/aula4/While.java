package aula4;

public class While {
    static void main() {

       int i = 10;
       while (i < 11){
           IO.println("O que vai acontecer? ");
            i++;
        }
       // mostrar todos os numeros pares de 1 a 10
       int a = 0;
       while (a < 11){
           a++;
           if (a % 2 == 0){
               IO.println("Numero par: " + a);
           }
       }

        // mostrar todos numeros ímpres de 1 a 10
        int b = 0;
       while (b < 10){
           b++;
           if (b % 2 == 1){
               IO.println("Número ímpar: " + b);
           }
       }
    }
}
