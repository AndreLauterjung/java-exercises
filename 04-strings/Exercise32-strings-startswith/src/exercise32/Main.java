/* Enunciado do exercício:

- Crie uma string com o nome de um arquivo (ex: "relatorio_2026.pdf") e use o método startsWith("relatorio") para
verificar se ela começa com esse prefixo exato. */

package exercise32;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String arquivo = "relatorio_2026.pdf";
        
        System.out.println("\n===============================================");
        System.out.println("O nome do arquivo começa com relatorio? "+arquivo.startsWith("relatorio"));
        System.out.println("O nome do arquivo começa com Relatorio? "+arquivo.startsWith("Relatorio"));
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
