/* Enunciado do exercício:

- Simule um sistema de logs: adicione uma mensagem de erro ao StringBuilder, salve-a convertendo para String,
limpe o StringBuilder com setLength(0) e adicione uma mensagem de sucesso em seguida. */

package exercise23;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder mensagem = new StringBuilder("Erro no sistema");
        
        System.out.println("\n=================================================");
        String mensagemErro = mensagem.toString();
        mensagem.setLength(0);
        
        if(mensagem.length() == 0) {
            System.out.println("Mensagem apagada com sucesso!");
        }
        
        System.out.println("\nMensagem convertida para String: "+mensagemErro);
        
        System.out.println("\n=================================================");
        System.out.println("Programa encerrado!");
        System.out.println("=================================================");
    }
}
