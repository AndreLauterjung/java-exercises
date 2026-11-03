/* Enunciado do exercício:

Crie uma string com uma palavra de sua escolha e use o charAt() para resgatar o último caractere sabendo o
tamanho fixo dele. */

package exercise43;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String palavra = "abacate";
        
        System.out.println("\n===============================================");
        System.out.println("Palavra: "+palavra);
        System.out.println("Tamanho: "+palavra.length());
        System.out.println("Último caractere: "+palavra.charAt(palavra.length() - 1));
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
