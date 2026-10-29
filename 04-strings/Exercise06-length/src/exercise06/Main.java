/* Enunciado do exercício:

Validador de Campo Vazio

- Objetivo: Garantir que um campo obrigatório não foi enviado em branco.
- O que fazer: Crie uma lógica que verifica se o tamanho da string é igual a 0 (ou se o texto está vazio). Caso o
length() seja 0, exiba um alerta de erro informando que o campo é obrigatório. */

package exercise06;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------------");
        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();
        sc.close();
        
        if(senha.length() == 0) {
            
            System.out.println("\nERRO!");
            System.out.println("O campo obrigatório!");
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("--------------------------------------");
        
    }
}
