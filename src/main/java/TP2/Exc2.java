package TP2;
import java.util.Scanner;

public class Exc2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas para ver se você foi aprovado: ");

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Nota 4: ");
        double nota4 = scanner.nextDouble();

        double mediaDasNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        String message = "";

        if(mediaDasNotas >= 7){
            message = "Aprovado";
        } else if (mediaDasNotas >= 5) {
            message = "Recuperação";
        } else  {
            message = "Reprovado";
        }

        System.out.println("\n===== RESULTADO =====");
        System.out.printf("Média: %.2f%n", mediaDasNotas);
        System.out.println("Seu status é: " + message);

        scanner.close();
    }
}
