/* Enunciado do exercício:

- Crie uma string "Computador" e use a versão com dois parâmetros substring(0, 4) para extrair apenas os
primeiros 4 caracteres. */

package exercise37;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String palavra = "Computador";
        
        System.out.println("\n===============================================");
        System.out.println("Palavra: "+palavra);
        
        palavra = palavra.substring(0, 4);
        
        System.out.println("Palavra após o método substring: "+palavra);

        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
