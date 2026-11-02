/* Enunciado do exercício:

- Crie uma String contendo apenas um espaço em branco (" ") e use o isEmpty() para verificar que, diferentemente
do isBlank(), ela retorna false (pois o espaço ocupa espaço físico na string). */

package exercise30;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        String texto = " ";
        String vazio = "";
        
        System.out.println("\n===============================================");
        System.out.println(texto.isEmpty());
        System.out.println(vazio.isEmpty());
        
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
