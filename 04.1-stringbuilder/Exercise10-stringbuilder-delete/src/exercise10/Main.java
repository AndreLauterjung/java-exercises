/* Enunciado do exercício:

Crie um StringBuilder com o texto "Café com leite". Use delete para remover exatamente a palavra "com "
(atenção aos índices e espaços). */

package exercise10;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder texto = new StringBuilder("Café com leite");
        
        System.out.println("\n===============================================");
        System.out.println("Texto antes do delete(): "+texto);
        
        texto.delete(5, 9);
        
        System.out.println("Texto após o delete(): "+texto);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
