package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix l'altura del triangle");
        double h = scanner.nextDouble();
        System.out.println("Introdueix l'amplada del triangle");
        double w = scanner.nextDouble();

        System.out.println("L'àrea del triangle és " + ((h*w)/2) + "unitats");

        scanner.close();
    }
}