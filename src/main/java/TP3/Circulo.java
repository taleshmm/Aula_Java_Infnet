package TP3;

public class Circulo {
    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);  // Fórmula: A = π * r²
    }
}
