/* Enunciado do exercício:

- Crie um StringBuilder com um texto inicial, imprima seu tamanho, execute setLength(0) para limpá-lo, imprima o
tamanho novamente (deve ser 0) e adicione um novo texto. */

package exercise22;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder palavra = new StringBuilder("Garrafa");
        
        System.out.println("\n===============================================");
        System.out.println("Tamanho da palavra: "+palavra.length());
        
        palavra.setLength(0);
        
        System.out.println("Tamanho da palavra após o setLenght(0): "+palavra.length());
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
