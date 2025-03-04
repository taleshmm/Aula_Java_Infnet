import java.util.Scanner;


class HelloWorld
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Nome: " + nome + ", Idade: " + idade);

        input.close();
    }
}

