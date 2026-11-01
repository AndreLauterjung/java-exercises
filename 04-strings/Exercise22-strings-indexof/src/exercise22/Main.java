/* Enunciado do exercício:

A Posição do Arroba (Básico)

- Objetivo: Encontrar o índice exato onde o caractere @ aparece em um e-mail.
- O que fazer: Peça para o usuário digitar um endereço de e-mail. Utilize o método indexOf("@") para descobrir em
qual posição o @ está localizado e exiba esse número na tela.

Exemplo de saída:

- Entrada: maria.silva@email.com
- Saída: "O caractere '@' foi encontrado na posição: 11" */

package exercise22;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===============================================");
        System.out.println("Digite um e-mail: ");
        String email = sc.nextLine().toLowerCase();
        sc.close();
        
        int posicaoChar = email.indexOf("@");
        
        System.out.println("O caractere '@' foi encontrado na posição: "+posicaoChar);
        
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");

    }
}
