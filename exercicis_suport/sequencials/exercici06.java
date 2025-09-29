package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu la nota 1");
        double nota1 = scanner.nextDouble();
        System.out.println("Escriu la nota 2");
        double nota2 = scanner.nextDouble();
        System.out.println("Escriu la nota 3");
        double nota3 = scanner.nextDouble();

        System.out.println("La mitjana és " + (nota1+nota2+nota3)/3);

        scanner.close();
    }
}
