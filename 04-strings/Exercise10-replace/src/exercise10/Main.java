/* Enunciado do exercício:

Exercício 4: Padronização de Valores Decimais (Vírgula para Ponto)

- Objetivo: Ajustar o formato de um número decimal inserido pelo usuário.
- O que fazer: Em alguns países (ou sistemas), usa-se ponto, e no Brasil usamos vírgula. Peça ao usuário para
digitar um valor financeiro usando vírgula (ex: 1500,50) e utilize o replace() para converter a vírgula em ponto (.).

Exemplo de saída:

- Entrada: 1250,99
- Saída: 1250.99 */

package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("Digite um valor: ");
        String valor = sc.nextLine();
        sc.close();
       
        System.out.println("\nValor digitado: "+valor);
        valor = valor.replace(".", ",");
        
        System.out.println("\nValor editado: "+valor);
        
        System.out.println("----------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("----------------------------------------");
    }
}
