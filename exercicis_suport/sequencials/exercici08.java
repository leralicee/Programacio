package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el primer valor");
        int num1 = scanner.nextInt();
        System.out.println("Introdueix el segon valor");
        int num2 = scanner.nextInt();

        System.out.println("La variable 1 = " + num1 + " i la variable 2 = " + num2);
        int var = num1;
        num1 = num2;
        num2 = var;
        System.out.println("Ara, a variable 1 = " + num1 + " i la variable 2 = " + num2);

        scanner.close();
    }
}