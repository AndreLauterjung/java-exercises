/* Enunciado do exercício:

- Usando uma string com o nome de um arquivo (ex: "foto_ferias.png"), utilize o método endsWith(".png") para
verificar se ela termina com essa extensão exata. */

package exercise33;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nomeArquivo = "foto_ferias.png";
        
        System.out.println("\n===============================================");
        
        System.out.println("O arquivo termina com .png? "+nomeArquivo.endsWith(".png"));
        System.out.println("O arquivo termina com .pdf? "+nomeArquivo.endsWith(".pdf"));
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
