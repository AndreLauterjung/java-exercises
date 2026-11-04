/* Enunciado do exercício:

Crie um StringBuilder com "Hoje está sol". Use replace para trocar "sol" por "chovendo". */

package exercise14;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        StringBuilder frase = new StringBuilder("Hoje está sol");
        
        System.out.println("\n===============================================");
        System.out.println("Frase antes do replace(): "+frase);
        
        frase.replace(frase.length() -3, frase.length(), "chovendo");
        
        System.out.println("Frase após o replace(): "+frase);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
