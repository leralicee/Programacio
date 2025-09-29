package classe1;

import java.util.Scanner;

public class Nom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el teu nom");
         String nom = scanner.next();
         
        System.out.println("Introdueix el teu primer cognom");
         String cognom1 = scanner.next();
          
        System.out.println("Introdueix el teu segon cognom");
         String cognom2 = scanner.next();

         //.next() serveix per guardar una paraula
         //.nextLine() serveix per guardar una frase

        System.out.println("El teu nom complet és "+ nom +" "+ cognom1+ " "+cognom2);

        scanner.close();
    }
}
