/* Enunciado do exercício:

Crie um StringBuilder com a palavra "radar". Inverta o texto com .reverse() e imprima. */

package exercise16;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder palavra = new StringBuilder("radar");
        
        System.out.println("\n===============================================");
        System.out.println("Palavra antes do reverse(): "+palavra);
        
        palavra.reverse();
        
        System.out.println("Palavra após o reverse(): "+palavra);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
