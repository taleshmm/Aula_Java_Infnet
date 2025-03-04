package TP2;
import java.util.Scanner;

public class Exc6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano e descubra se é bissexto: ");
        int ano = scanner.nextInt();

        String mensagem = "O ano não é bissexto";

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            mensagem = "O ano é bissexto";
        }

        System.out.println(mensagem);

        scanner.close();

    }
}
