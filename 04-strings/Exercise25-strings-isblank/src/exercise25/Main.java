/* Enunciado do exercício:

Crie uma String com apenas espaços em branco (" ") e use o método isBlank() para exibir o resultado booleano
(true ou false). */

package exercise25;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String textoVazio = "";
        String textoEspaco = " ";
        String texto = "Olá, Mundo!";
        
        System.out.println("\n===============================================");
        System.out.println(textoVazio.isBlank());
        System.out.println(textoEspaco.isBlank());
        System.out.println(texto.isBlank());
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
