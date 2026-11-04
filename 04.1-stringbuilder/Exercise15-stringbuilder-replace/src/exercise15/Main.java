/* Enunciado do exercício:

Crie um StringBuilder com o texto "Linguagem C". Substitua o "C" por "C++" usando o método replace.  */

package exercise15;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        StringBuilder texto = new StringBuilder("Linguagem C");
        
        System.out.println("\n===============================================");
        System.out.println("Frase antes do replace(): "+texto);
        
        texto.replace(texto.length() - 1, texto.length(), "C++");
        
        System.out.println("Frase após o replace(): "+texto);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
