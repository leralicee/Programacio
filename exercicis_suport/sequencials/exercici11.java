package exercicis_suport.sequencials;

import java.util.Scanner;
import java.util.Random;

public class exercici11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        System.out.println("Indica el resultat de la suma dels numeros " + num1 + " i " + num2);
        int resultat = scanner.nextInt();
        System.out.println(resultat == num1 + num2);
        
        scanner.close();

    }
}