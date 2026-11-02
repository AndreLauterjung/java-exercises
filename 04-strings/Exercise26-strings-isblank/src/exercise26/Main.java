/* Enunciado do exercício:

Peça para o usuário digitar um texto via Scanner e use diretamente o isBlank() para verificar se o que ele digitou
é considerado em branco. */

package exercise26;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        sc.close();
        
        if(texto.isBlank()) {
            System.out.println("O texto está vazio ou apenas com espaços!");
        }
        else {
            System.out.println("\nTexto digitado: \n"+texto);
        }
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
