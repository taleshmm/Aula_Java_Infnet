package TP3;

//Exercício 1
public class Carro {
    String modelo;
    double velocidade;

    void acelerar(double incremento) {
        velocidade += incremento;
        System.out.println("O carro acelerou para " + velocidade + " km/h.");
    }

    void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Sedan";
        meuCarro.velocidade = 0;
        meuCarro.exibirInfo();
        meuCarro.acelerar(50);
    }
}