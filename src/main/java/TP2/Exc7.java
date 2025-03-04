package TP2;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual R$ ");
        double salarioAnual = scanner.nextDouble();
        double imposto = 0;
        double salarioBase = salarioAnual;

        if (salarioBase > 56000) {
            imposto += (salarioBase - 56000) * 0.275;
            salarioBase = 56000;
        }
        if (salarioBase > 45000) {
            imposto += (salarioBase - 45000) * 0.225;
            salarioBase = 45000;
        }
        if (salarioBase > 34000) {
            imposto += (salarioBase - 34000) * 0.15;
            salarioBase = 34000;
        }
        if (salarioBase > 24500) {
            imposto += (salarioBase - 24500) * 0.075;
        }

        double salarioLiquido = salarioAnual - imposto;

        System.out.println("O imposto a ser pago é de R$ " + String.format("%.2f", imposto));
        System.out.println("O salário líquido é de R$ " + String.format("%.2f", salarioLiquido));

        scanner.close();
    }
}
