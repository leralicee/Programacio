package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix A");
        int A = scanner.nextInt();
        System.out.println("Introdueix B");
        int B = scanner.nextInt();
        System.out.println("Introdueix C");
        int C = scanner.nextInt();

        System.out.println("La variable A = " + A + ", la variable B = " + B + " i la variable C = " + C);
        int var = A;
        A = C;
        C = B;
        B = var;

        System.out.println("Ara, a variable A = " + A + ", la variable B = " + B + " i la variable C = " + C);

        scanner.close();
    }
}


//BA 
//CB
//AC