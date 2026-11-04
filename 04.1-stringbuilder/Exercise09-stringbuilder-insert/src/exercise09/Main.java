/* Enunciado do exercício:

- Crie um StringBuilder com a frase "O gato mia". Insira a palavra "cinza " logo após a palavra "gato", descobrindo
a posição correta. */

package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder frase = new StringBuilder("O gato mia");
        
        System.out.println("\n===============================================");
        System.out.println("Frase antes do insert(): "+frase);
        
        frase.insert(7, "cinza ");
        
        System.out.println("Frase após o insert(): "+frase);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
