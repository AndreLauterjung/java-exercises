/* Enunciado do exercício:

Crie uma string com a palavra "Java " (com um espaço no final) e aplique o método repeat(5) diretamente para
imprimi-la repetida 5 vezes na mesma linha. */

package exercise47;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String palavra = "Java ";
        
        System.out.println("\n===============================================");
        
        System.out.println("\nResultado: "+palavra.repeat(5));

        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
