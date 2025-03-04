package TP2;
import java.util.Scanner;


public class Exc12 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("A frase não contém palavras.");
        } else {
            String[] palavras = frase.split(" ");
            int quantidadePalavras = palavras.length;

            System.out.println("A frase contém " + quantidadePalavras + " palavra(s).");
        }

        scanner.close();

    }
}
