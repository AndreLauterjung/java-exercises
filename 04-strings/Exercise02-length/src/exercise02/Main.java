/* Enunciado do exercício:

O Contador Básico

- Objetivo: Criar um programa que recebe uma palavra digitada pelo usuário e exibe quantos caracteres ela possui.
- O que fazer: Peça para o usuário inserir uma frase ou palavra e utilize o length() para retornar o número total de
caracteres (incluindo espaços, se houver).

Exemplo de saída:

- Entrada: "Programação"
- Saída: "A palavra possui 10 caracteres." */

package exercise02;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Digite uma palavra e descubra quantos caracteres ela possui: ");
        String texto = sc.nextLine();
        sc.close();
        
        System.out.println("\nTexto/palavra digitado(a): "+texto);
        System.out.println("Quantidade de caracteres no(a) texto/palavra: "+texto.length());
        
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("------------------------------------------------------------");
    }
}
