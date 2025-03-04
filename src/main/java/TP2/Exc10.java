package TP2;
import java.util.Random;
import java.util.Scanner;

public class Exc10 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        boolean controlador = true;

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        while (controlador) {
            System.out.print("Digite um numero entre 1 e 100: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numeroAleatorio) {
             System.out.println("Parabéns você acertou o número era " + numeroAleatorio);
             controlador = false;
            } else if (numeroDigitado > numeroAleatorio) {
                System.out.println("O numero é menor.");
            } else {
                System.out.println("O número é maior");
            }

        }

        scanner.close();
    }
}
