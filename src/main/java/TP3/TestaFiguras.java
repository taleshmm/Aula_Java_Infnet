package TP3;

public class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);

        Esfera esfera = new Esfera(5.0);

        double areaCirculo = circulo.calcularArea();
        System.out.println("Área do círculo (raio 3.0): " + String.format("%.2f", areaCirculo));

        double volumeEsfera = esfera.calcularVolume();
        System.out.println("Volume da esfera (raio 5.0): " + String.format("%.2f", volumeEsfera));
    }
}


