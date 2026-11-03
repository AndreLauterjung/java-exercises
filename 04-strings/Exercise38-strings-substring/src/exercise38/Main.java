/* Enunciado do exercício:

- Crie uma string com um número de telefone fixo no formato "11988887777" e use o substring(0, 2) para isolar
apenas o DDD. */

package exercise38;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String numero = "11999999999";
        
        String ddd = numero.substring(0, 2);
        
        System.out.println("\n===============================================");
        System.out.println("Número completo: "+numero);
        System.out.println("DDD: "+ddd);

        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
