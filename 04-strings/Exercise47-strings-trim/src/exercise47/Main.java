/* Enunciado do exercício:

Crie uma string contendo espaços extras tanto no começo quanto no final (ex: " Olá Mundo ") e utilize o método
trim() para exibi-la limpa. */

package exercise47;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String mensagem = "             Olá, Mundo!";
        
        System.out.println("Mensagem original: "+mensagem);
        
        mensagem = mensagem.trim();
        
        System.out.println("Mensagem atualizada (trim()): "+mensagem);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
