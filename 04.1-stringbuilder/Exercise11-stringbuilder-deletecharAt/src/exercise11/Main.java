/* Enunciado do exercício:

Crie um StringBuilder com a palavra "Banana". Use deleteCharAt(0) para remover a primeira letra e imprima o
resultado ("anana"). */

package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder palavra = new StringBuilder("Banana");
        
        System.out.println("\n===============================================");
        System.out.println("Palavra antes do deleteCharAt(0): "+palavra);
        
        palavra.deleteCharAt(0);
        
        System.out.println("Palavra após o deleteCharAt(0): "+palavra);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
