package TP2;
import java.util.Scanner;


public class Exc8 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os lados do triângulo: ");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os valores formam um triângulo!");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os valores NÃO formam um triângulo válido.");
        }

        scanner.close();


    }
}
