package exercicis_suport.sequencials;

import java.util.Scanner;

public class exercici14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demanar el número d'euros
        System.out.print("Introdueix una quantitat d'euros: ");
        int euros = scanner.nextInt();
        
        // Guardar el valor original per als càlculs
        int quantitatRestant = euros;
        
        System.out.println(euros + " són:");
        
        // Bitllets de 5
        int bitllets5 = quantitatRestant / 5;
        int resta5 = quantitatRestant % 5;
        System.out.println(bitllets5 + " bitllets de 5 i me'n sobren " + resta5);
        
        // Bitllets de 10
        quantitatRestant = euros; // Reiniciem per a cada càlcul
        int bitllets10 = quantitatRestant / 10;
        int resta10 = quantitatRestant % 10;
        System.out.println(bitllets10 + " bitllets de 10 i me'n sobren " + resta10);
        
        // Bitllets de 20
        quantitatRestant = euros; // Reiniciem per a cada càlcul
        int bitllets20 = quantitatRestant / 20;
        int resta20 = quantitatRestant % 20;
        System.out.println(bitllets20 + " bitllets de 20 i me'n sobren " + resta20);
        
        // Bitllets de 50
        quantitatRestant = euros; // Reiniciem per a cada càlcul
        int bitllets50 = quantitatRestant / 50;
        int resta50 = quantitatRestant % 50;
        System.out.println(bitllets50 + " bitllets de 50 i me'n sobren " + resta50);
        
        // Bitllets de 100
        quantitatRestant = euros; // Reiniciem per a cada càlcul
        int bitllets100 = quantitatRestant / 100;
        int resta100 = quantitatRestant % 100;
        System.out.println(bitllets100 + " bitllets de 100 i me'n sobren " + resta100);
        
        scanner.close();
    }
}