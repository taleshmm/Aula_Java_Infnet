package TP2;
import java.util.Scanner;

public class Exc9 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre uma senha: ");
        String senhaCadastrada = scanner.nextLine();

        boolean controlador = true;

        while (controlador) {
            System.out.print("Digite a senha para entrar: ");
            String senhaDigitada = scanner.nextLine();

            if  (senhaCadastrada.equals(senhaDigitada)) {
                System.out.println("Logado com sucesso");
                controlador = false;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        }

        scanner.close();

    }
}
