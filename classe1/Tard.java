package classe1;
import java.util.Scanner;
public class Tard {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hi ha vaga?");
     char resposta = scanner.next().charAt(0);
     boolean vaga = Character.toLowerCase(resposta) == 's';
         
    System.out.println("Plou?");
     resposta = scanner.next().charAt(0);
     boolean pluja = Character.toLowerCase(resposta) == 's';

     System.out.println("Agafes el tren?");
     resposta = scanner.next().charAt(0);
     boolean tren = Character.toLowerCase(resposta) == 's';

    System.out.println("Arribaràs tard: " + ((vaga==true || pluja==true) && tren==true));
    scanner.close();
}
    
}