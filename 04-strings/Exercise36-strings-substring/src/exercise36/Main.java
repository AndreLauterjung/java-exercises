/* Enunciado do exercício:

Crie uma string "Programação" e use o substring(3) para extrair o texto a partir do índice 3 até o final. */

package exercise36;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String palavra = "Programacao";
        
        System.out.println("\n======================================================");
        System.out.println("Palavra: "+palavra);
        
        palavra = palavra.substring(3);
        
        System.out.println("Palavra após a utilização do método substring: "+palavra);

        System.out.println("\n======================================================");
        System.out.println("Programa encerrado!");
        System.out.println("======================================================");
    }
}
