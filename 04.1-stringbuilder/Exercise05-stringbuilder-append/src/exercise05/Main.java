/* Enunciado do exercício:

- Crie um loop for de 1 a 5 e, a cada repetição, use append para adicionar o número seguido de um hífen
(ex: 1-2-3-4-5-). Imprima o resultado. */

package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder numeros = new StringBuilder();
        
        for(int i = 1; i <= 5; i++) {
            
            numeros.append(i).append("-");
        }
        
        System.out.println("\n===============================================");
        System.out.println("Resultado: ");
        System.out.println("\n"+numeros);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
