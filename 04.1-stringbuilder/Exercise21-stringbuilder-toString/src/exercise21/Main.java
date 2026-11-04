/* Enunciado do exercício:

Crie um StringBuilder com um texto, converta-o para uma String comum usando toString(), guarde em uma
variável do tipo String e imprima essa variável. */

package exercise21;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder palavra = new StringBuilder("Manga");
        
        String fruta = palavra.toString();
        
        System.out.println("\n===============================================");
        System.out.println("Palavra convertida para String: "+fruta);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
