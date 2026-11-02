/* Enunciado do exercício:

- Peça para o usuário digitar uma palavra usando o Scanner e aplique o isEmpty() diretamente na string recebida
para verificar se ela veio totalmente vazia. */

package exercise31;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        sc.close();
        
        System.out.println("O usuário não digitou nada? "+palavra.isEmpty());
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
