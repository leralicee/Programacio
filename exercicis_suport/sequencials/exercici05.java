package exercicis_suport.sequencials;
import java.util.Scanner;

public class exercici05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el teu nom");
        String nom = scanner.nextLine();
        System.out.println("Hola, " + nom);
        scanner.close();
    }
    
}
