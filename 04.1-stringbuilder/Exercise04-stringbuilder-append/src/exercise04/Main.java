/* Enunciado do exercício:

- Crie um StringBuilder vazio, faça o append do seu primeiro nome, depois de um espaço (" ") e do seu sobrenome.
Imprima o resultado final. */
package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder texto = new StringBuilder();
        
        System.out.println("\n===============================================");
        
        texto.append("André");
        texto.append(" ");
        texto.append("Lauterjung");
        
        System.out.println(texto);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
