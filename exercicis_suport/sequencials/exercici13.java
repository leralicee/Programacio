package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introdueix el valor de X: ");
        double x = scanner.nextDouble();
        
        double resultat = x * (x * (x + 3) + 7) + 7;
        
        System.out.println("x³ + 3x² + 7x + 7 = " + resultat);
        
        scanner.close();
    }
    
}

//ACABAR