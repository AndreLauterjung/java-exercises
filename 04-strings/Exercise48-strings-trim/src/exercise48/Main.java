/* Enunciado do exercício:

Crie uma string com espaços extras apenas no início (ex: " Java"), aplique o método trim() e mostre que o espaço
inicial foi removido. */

package exercise48;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String palavra = "  Java";
        
        System.out.println("\n===============================================");
        System.out.println("Palavra: "+palavra);
        
        palavra = palavra.trim();
        
        System.out.println("Palavra sem espaços no início e final: "+palavra);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
