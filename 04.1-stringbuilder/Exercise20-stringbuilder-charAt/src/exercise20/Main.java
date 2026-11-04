/* Enunciado do exercício:

- Crie um StringBuilder com uma frase e use charAt() combinado com length() para acessar e imprimir exatamente
o último caractere da frase (length() - 1). */

package exercise20;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder palavra = new StringBuilder("Macarrão");
        
        System.out.println("\n===============================================");
        System.out.println("Último caractere da palavra "+palavra);
        System.out.println("Resultado: "+palavra.charAt(palavra.length() - 1));
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
