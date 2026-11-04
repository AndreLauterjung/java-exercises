/* Enunciado do exercício:

Crie um StringBuilder com a frase "Programando em Java". Use delete para apagar a palavra "Java" do final. */

package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        StringBuilder frase = new StringBuilder("Programando em Java");
        
        System.out.println("\n===============================================");
        System.out.println("Frase antes do delete(): "+frase);
        
        frase.delete(frase.length() - 4, frase.length());
        
        System.out.println("Frase após o delete(): "+frase);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
