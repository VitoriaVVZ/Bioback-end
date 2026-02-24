package aula4;

public class For {
    static void main() {
        // 1 inicia a variavel
        // 2 condição
        // 3 alteração da variavel
        for (int i = 0; i < 5; i++) {
            IO.println("O valor de I é: " + i++);
        }

        // mostrar todos os numeros pares 1 a 10
        for (int a = 0; a <= 10; a++) {
            IO.println("Os números pares: " + a++);

        }
        // mostrar todos os numeros ímpares de 1 a 10
        for (int b = 1; b <= 10; b++) {
            if (b % 2 != 0) {
                IO.println("Os números ímpares: " + b++);
            }
        }
    }
}
