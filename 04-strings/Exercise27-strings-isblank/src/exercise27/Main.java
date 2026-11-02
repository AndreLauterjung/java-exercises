/* Enunciado do exercício:

- Crie uma string contendo caracteres de tabulação ou quebra de linha ("\t \n") e teste o isBlank() para observar o
comportamento dela com caracteres invisíveis. */

package exercise27;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String texto = "Olá, Mundo!";
        String tabulacao = "\t";
        
        System.out.println("\n===============================================");
        System.out.println(texto.isBlank());
        System.out.println(tabulacao.isBlank());

        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
