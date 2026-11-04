/* Enunciado do exercício:

Crie um StringBuilder com "Eu gosto de Java". Use replace para trocar a palavra "Java" por "Python". */

package exercise13;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        StringBuilder frase = new StringBuilder("Eu gosto de Java");
        
        System.out.println("\n===============================================");
        System.out.println("Frase antes do replace(): "+frase);
        
        frase.replace(frase.length() - 4, frase.length(), "Python");
        
        System.out.println("Frase após o replace(): "+frase);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
