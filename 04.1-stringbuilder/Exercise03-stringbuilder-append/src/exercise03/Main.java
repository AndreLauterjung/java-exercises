/* Enunciado do exercício:

Monte com append encadeado: Olá, Ana! Você tem 120 pontos. (nome e pontos em variáveis). Depois use
insert(0, "[AVISO] ") e imprima o resultado e o length(). */
package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder aviso = new StringBuilder();
        
        String nome = "Ana";
        int pontos = 120;
        
        System.out.println("\n===============================================");
        aviso.append("Olá, ").append(nome).append("!").append(" Você tem ").append(pontos).append(" pontos.");
        aviso.insert(0,"[AVISO] ");
        
        System.out.println(aviso);
        System.out.println("Length: "+aviso.length());
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
