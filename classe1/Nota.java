package classe1;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la primera nota");
         double nota1 = scanner.nextDouble();
         
        System.out.println("Introdueix la segona nota");
         double nota2 = scanner.nextDouble();

        System.out.println("La nota final és " + ((nota1+nota2)/2));

        scanner.close();
    }
    
}
