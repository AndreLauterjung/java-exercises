/* Enunciado do exercício:

- Crie um StringBuilder com o texto "Java". Use insert(0, ...) para adicionar o prefixo "Linguagem " bem no início da
string. */

package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder texto = new StringBuilder("Java");
        
        System.out.println("\n===============================================");
        System.out.println("Texto antes do insert(): "+texto);
        
        texto.insert(0, "Linguagem ");
        
        System.out.println("Texto após o insert(): "+texto);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
