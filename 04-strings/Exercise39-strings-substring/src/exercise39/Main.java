/* Enunciado do exercício:

Crie uma string com um link e use o substring(8) para fatiar e remover o protocolo inicial. */

package exercise39;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String link = "https://site.com";
        
        String protocolo = link.substring(8);
        
        System.out.println("\n===============================================");
        System.out.println(protocolo);

        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
