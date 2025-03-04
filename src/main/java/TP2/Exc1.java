package TP2;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite nome do seu pai: ");
        String nomePai = scanner.nextLine();

        String message = "";

        if (nome.length() > nomeMae.length() || nome.length() > nomePai.length()) {
            message = "Seu nome é maior que o de pelo menos um dos seus pais.";
        } else {
            message = "Seu nome não é maior que o de seus pais.";
        }

        System.out.println("\n===== DADOS CADASTRADOS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da sua mãe: " + nomeMae);
        System.out.println("Nome do seu pai: " + nomePai);
        System.out.println(message);

        scanner.close();
    }
}
