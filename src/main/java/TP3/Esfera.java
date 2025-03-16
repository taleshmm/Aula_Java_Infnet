package TP3;

public class Esfera {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);  // Fórmula: V = 4/3 * π * r³
    }
}
