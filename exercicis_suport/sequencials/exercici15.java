package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demanar el número d'euros
        System.out.print("Introdueix una quantitat d'euros: ");
        int euros = scanner.nextInt();
        
        int quantitatRestant = euros;
        
        System.out.println(euros + " són:");
        
        // Bitllets de 100
        int bitllets100 = quantitatRestant / 100;
        quantitatRestant = quantitatRestant % 100;
        System.out.println(bitllets100 + " bitllets de 100");
        
        // Bitllets de 50
        int bitllets50 = quantitatRestant / 50;
        quantitatRestant = quantitatRestant % 50;
        System.out.println(bitllets50 + " bitllets de 50");
        
        // Bitllets de 20
        int bitllets20 = quantitatRestant / 20;
        quantitatRestant = quantitatRestant % 20;
        System.out.println(bitllets20 + " bitllets de 20");
        
        // Bitllets de 10
        int bitllets10 = quantitatRestant / 10;
        quantitatRestant = quantitatRestant % 10;
        System.out.println(bitllets10 + " bitllets de 10");
        
        // Bitllets de 5
        int bitllets5 = quantitatRestant / 5;
        quantitatRestant = quantitatRestant % 5;
        System.out.println(bitllets5 + " bitllets de 5");
        
        // Mostrar el que sobra
        System.out.println("Sobren " + quantitatRestant + " euros");
        
        scanner.close();
    }
}
