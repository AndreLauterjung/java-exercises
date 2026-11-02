/* Enunciado do exercício:

- Crie uma string com a palavra "banana" e use o replaceFirst("a", "o") para trocar apenas a primeira letra 'a' por 'o',
exibindo o resultado ("bonana"). */

package exercise34;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String fruta = "banana";
        
        System.out.println("\n===============================================");
        System.out.println("Palavra (antes): "+fruta);
        
        fruta = fruta.replaceFirst("a", "o");
        
        System.out.println("Palavra (depois): "+fruta);
                
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
