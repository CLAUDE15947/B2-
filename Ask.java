import java.util.Scanner;

public class Ask {
    public static void main (String[] args){
        Scanner scannner = new Scanner(System.in);
        System.out.print("Entrez votre nom :");
        String nom = scanner.nextLine();

        System.out.println("Bonjour,"+nom+"!");

        scanner.close();
    }
    
}
