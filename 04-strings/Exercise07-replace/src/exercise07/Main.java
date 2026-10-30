/* Enunciado do exercício:

O Formatador de Datas

- Objetivo: Converter o formato de uma data digitada pelo usuário.
- O que fazer: Peça para o usuário digitar uma data no formato tradicional com barras (ex: 15/10/2026). Utilize o
método replace() para trocar todas as barras (/) por hífens (-), gerando o formato 15-10-2026.

Exemplo de saída:

- Entrada: 25/12/2026
- Saída: 25-12-2026  */

package exercise07;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Digite uma data no formato tadicional (com /) exemplo: 31/12/1999");
        String data = sc.nextLine();
        sc.close();
        
        data = data.replace("/", "-");
        
        System.out.println("\nData formatada: "+data);
        
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("--------------------------------------------------------------------");
        
        
        
        
    }
}
