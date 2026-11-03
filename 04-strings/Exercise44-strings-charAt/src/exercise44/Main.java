/* Enunciado do exercício:

Crie uma palavra de 4 letras e exiba cada letra separadamente chamando charAt(0), charAt(1), charAt(2) e
charAt(3) em linhas diferentes, sem loops. */

package exercise44;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String palavra = "Caju";
        
        System.out.println("\n===============================================");

        System.out.println("Caractere 0: "+palavra.charAt(0));
        System.out.println("Caractere 1: "+palavra.charAt(1));
        System.out.println("Caractere 2: "+palavra.charAt(2));
        System.out.println("Caractere 3: "+palavra.charAt(3));
        
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
