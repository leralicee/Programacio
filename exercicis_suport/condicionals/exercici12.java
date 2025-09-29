package exercicis_suport.condicionals;
import java.util.Scanner;

public class exercici12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdueix el valor de la primera carta");
        int c1 = scanner.nextInt();
        System.out.println("Introdueix el valor de la segona carta");
        int c2 = scanner.nextInt();

        if (c1 < 1 || c1 > 10 || c2 < 1 || c2 > 10) {
            System.out.println(-1);
        }

        else if (c1 == c2) {
            System.out.println(0);
        }

        else if (Math.abs(c1 - c2) == 1) {
            System.out.println(1);
        }

        else {
            System.out.println(2);
        }

        scanner.close();
    }
    
}
