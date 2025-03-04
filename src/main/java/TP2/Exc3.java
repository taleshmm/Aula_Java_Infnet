package TP2;
import java.util.Scanner;

public class Exc3 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual valor deseja converter R$ ");
        double valor = scanner.nextDouble();

        System.out.println("Para qual moeda deseja fazer a conversão:\n1 - Euro\n2 - Dólar\n3 - Libra");
        scanner.nextLine();
        System.out.print("Digite a moeda desejada: ");

        String opcao = scanner.nextLine();

        double valorConvertido;
        double cambioEscolhido;
        String moedaEscolhida;

        switch (opcao) {
            case "1":
                cambioEscolhido = 6.02;
                moedaEscolhida = "euros";
                break;
            case "2":
                cambioEscolhido = 5.89;
                moedaEscolhida = "dólares";
                break;
            case "3":
              cambioEscolhido = 6.43;
              moedaEscolhida = "libras";
                break;
            default:
                System.out.println("\nOpção inserida inválida.");
               return;

        }

        valorConvertido = valor / cambioEscolhido;
        System.out.println("A conversão foi feita no câmbio de " +
                 cambioEscolhido +
                " e você terá " + String.format("%.2f", valorConvertido) +
                " " + moedaEscolhida);
        scanner.close();
    }
}
