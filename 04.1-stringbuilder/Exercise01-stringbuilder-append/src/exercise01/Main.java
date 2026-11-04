/* Enunciado do exercício:

Lista sem vírgula sobrando. Monte 1, 2, 3, ..., 10 com um loop e append. Depois do loop, tire o , do final (setLength
ou delete). Esperado: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 */

package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder sequenciaNum = new StringBuilder();
        
        
        for(int i = 1; i<= 10; i++) {
            
            sequenciaNum.append(i + ", ");
        }
        
        System.out.println("\n===============================================");
        System.out.println(sequenciaNum);
        
        System.out.println("\nRemovendo caracteres...");
        sequenciaNum.delete(29, 31);
        
        System.out.println(sequenciaNum);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
