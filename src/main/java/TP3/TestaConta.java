package TP3;

public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta("Maria Oliveira", 67890, "Agência 002", 3000.00, "15/03/2022");
        conta.exibirInformacoes();
        System.out.println();

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.deposita(500.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.saca(1000.00);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        double rendimento = conta.calculaRendimento();
        System.out.println("Rendimento de 10%: R$ " + rendimento);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
