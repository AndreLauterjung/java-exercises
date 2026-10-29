/* Enunciado do exercício:

O Último Caractere

- Objetivo: Combinar o length() com índices para acessar o último caractere de uma string.
- O que fazer: Como as strings começam a contagem do índice em 0, o último caractere sempre está na posição
length() - 1. Peça uma palavra e exiba apenas a última letra dela utilizando essa lógica.

Exemplo de saída:

- Entrada: "Desenvolvedor"
- Saída: "O último caractere é: r" */

package exercise05;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------------------------------");
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        sc.close();
        
        System.out.println("\n-------------------------------------");
        System.out.println("Última caractere da palavra: "+palavra.charAt(palavra.length() - 1));
        
        System.out.println("\n-------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("-------------------------------------");
        
    }
}
