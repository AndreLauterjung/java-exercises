/* Enunciado do exercício:

Crie um StringBuilder com a palavra "Tecnologia". Use um loop for de 0 até length() - 1 para imprimir cada
caractere da palavra em uma linha separada usando charAt(i). */

package exercise19;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder palavra = new StringBuilder("Tecnologia");
        
        System.out.println("\n===============================================");
        for(int i = 0; i <= palavra.length() - 1; i++) {
            
            System.out.println("Letra "+(i+1)+": \t"+palavra.charAt(i));
        }
  
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
