package exercicis_suport.sequencials;
import java.util.Scanner;

public class exercici01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Com es defineix una constant ---> SEMPRE EL NOM EN MAJÚSCULES
        //Sempre posarem la paraula "final" a l'inici
        final double PI=3.1416;
        //No podem canviar-li el valor durant l'execució del programa

        /*NOM DE LES VARIABLES
         * no podem començar amb un número o caracter
         * no podem repetir el nom de variables en el mateix programa
         * no podem fer servir paraules pròpies del sistema
         * no podem fer nom.alumne
         */
        System.out.println("Introdueix el radi del cercle");
        double r = scanner.nextDouble();

         double areaCercle = PI * r * 2;
         System.out.println("L'àrea és " + areaCercle);

         scanner.close();
    }
}
