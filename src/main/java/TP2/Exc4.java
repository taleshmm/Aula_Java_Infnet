package TP2;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Exc4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite sua dada de nascimento DD/MM/AAAA: ");
        String dataNascimento = scanner.nextLine();

        LocalDate dataNascimentoConvertida = LocalDate.parse(dataNascimento, formatter);
        LocalDate hoje = LocalDate.now();

        long diasTotais = ChronoUnit.DAYS.between(dataNascimentoConvertida, hoje);

        System.out.println("Você já viveu " + diasTotais + " dias.");

        scanner.close();
    }
}
