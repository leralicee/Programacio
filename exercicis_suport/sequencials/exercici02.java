package exercicis_suport.sequencials;
import java.util.Scanner;

public class exercici02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriu el primer número");
        int num1 = scanner.nextInt();
        System.out.println("Escriu el segon número");
        int num2 = scanner.nextInt();

        System.out.println("La suma és " + (num1+num2));
        
        scanner.close();
    }
}
