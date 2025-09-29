package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix l'import");
        double preu = scanner.nextDouble();
        System.out.println("Ha de pagar "+ ((preu/10)*8));

        scanner.close();
    }
}
