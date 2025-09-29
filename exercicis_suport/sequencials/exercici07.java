package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu la teva edat");
        int edat = scanner.nextInt();

        System.out.println("Tens " + (edat*365) + " dies d'edat");
        System.out.println("Tens " + (edat*365*24*60*60) + " segons d'edat");

        scanner.close();
    }
}
