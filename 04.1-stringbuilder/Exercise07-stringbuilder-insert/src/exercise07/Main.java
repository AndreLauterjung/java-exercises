/* Enunciado do exercício:

- Crie um StringBuilder com o texto "Programar é legal!". Use insert para colocar a palavra "muito " bem antes da
palavra "legal". */

package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder texto = new StringBuilder("Programar é legal!");
        
        System.out.println("\n===============================================");
        System.out.println(texto);
        
        texto.insert(12, "muito ");
        System.out.println(texto);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
