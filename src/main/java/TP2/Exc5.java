package TP2;
import java.util.Scanner;

public class Exc5 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        double valorDoDesconto;
        String mensagemDesconto;

        if (valor > 1000) {
            mensagemDesconto = "10% de desconto";
            valorDoDesconto = valor * 0.10;
        } else if (valor >= 500) {
            mensagemDesconto = "5% de desconto";
            valorDoDesconto = valor * 0.05;
        } else {
            mensagemDesconto = "0% de desconto";
            valorDoDesconto = 0.0;
        }

        double valorComDesconto = valor - valorDoDesconto;

        System.out.println("\nResumo da compra:");
        System.out.println("Valor inicial: R$ " + String.format("%.2f", valor));
        System.out.println("Desconto aplicado: " + mensagemDesconto + " (R$ " + String.format("%.2f", valorDoDesconto) + ")");
        System.out.println("Valor final: R$ " + String.format("%.2f", valorComDesconto));

        scanner.close();

    }
}
