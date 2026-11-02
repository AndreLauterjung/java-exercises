/* Enunciado do exercício:

Crie uma string com texto real (ex: " Java ") e imprima o resultado do isBlank().  */

package exercise28;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String textoVazio = "";
        String texto = " Java ";
        
        System.out.println("\n===============================================");
        System.out.println(textoVazio.isBlank());
        System.out.println(texto.isBlank());
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
