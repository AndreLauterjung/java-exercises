/* Enunciado do exercício:

Comparador de Tamanho

- Objetivo: Comparar duas palavras para ver qual é a maior.
- O que fazer: Peça ao usuário duas palavras diferentes. Utilize o length() em ambas para compará-las e informe
qual delas é mais longa, ou se ambas possuem o mesmo tamanho.

Exemplo de saída:

- Entrada: "Café" e "Computador"
- Saída: "A segunda palavra é maior." */

package exercise04;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------------------------");
        System.out.println("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();
        
        System.out.println("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();
        sc.close();
        
        if(palavra1.length() > palavra2.length()) {
            
            System.out.println("\nA primeira palavra é maior!");
            System.out.println(palavra1+" > "+palavra2);
        }
        
        else if(palavra1.length() < palavra2.length()) {
            
            System.out.println("\nA segunda palavra é maior!");
            System.out.println(palavra1+" < "+palavra2);
        }
        
        else {
            System.out.println("\nAs duas palavras tem a mesma quantidade de caracteres!");
            System.out.println(palavra1+" | "+palavra2);
        }
        
        
        System.out.println("\n------------------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("------------------------------------------------");
    }
}
