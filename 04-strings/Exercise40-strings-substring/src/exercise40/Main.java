/* Enunciado do exercício:

Crie uma palavra "Desenvolvedor" e use o substring(5, 10) para pegar um trecho específico do meio dela. */

package exercise40;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        String palavra = "Desenvolvedor";
        
        String trecho = palavra.substring(5, 10);
        
        System.out.println("\n===============================================");
        System.out.println("Palavra: "+palavra);
        System.out.println("Trecho da palavra: "+trecho);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
