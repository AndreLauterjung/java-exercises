/* Enunciado do exercício:

- Monte uma frase motivacional usando três comandos append encadeados em uma única linha
(ex: sb.append("Foco ").append("no ").append("código!");). */

package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder texto = new StringBuilder();
        
        texto.append("Foco ").append("no ").append("código!");
        
        System.out.println("\n===============================================");
        System.out.println("Resultado:");
        System.out.println("\n"+texto);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
