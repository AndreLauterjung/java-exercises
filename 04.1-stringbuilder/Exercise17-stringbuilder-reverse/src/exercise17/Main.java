/* Enunciado do exercício:

Crie um StringBuilder com uma frase qualquer e use .reverse() para ver como ela fica de trás para frente. */

package exercise17;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        StringBuilder frase = new StringBuilder("Eu gosto de suco de limão");
        
        System.out.println("\n===============================================");
        System.out.println("Palavra antes do reverse(): "+frase);
        
        frase.reverse();
        
        System.out.println("Palavra após o reverse(): "+frase);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
