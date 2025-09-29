package exercicis_suport.sequencials;
import java.util.Scanner;

public class exercici04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix l'import");
        double preu = scanner.nextDouble();
        System.out.println("Introdueix el valor del descompte en tant per cent");
        double descompte = scanner.nextDouble();
        System.out.println("L'import net és " + ((preu/(100-descompte))*100));
        scanner.close();
    }
}
