/* Enunciado do exercício:


O Extractor de Palavras (Básico)

- Objetivo: Separar uma frase inteira em palavras individuais usando o espaço como divisor.
- O que fazer: Peça para o usuário digitar uma frase. Utilize o split(" ") para transformá-la em um array de strings e
exiba cada palavra em uma linha diferente usando um loop (como o for-each).

Exemplo de saída:

- Entrada: "Java é uma linguagem poderosa"

- Saída:
    Plaintext
    Java
    é
    uma
    linguagem
    poderosa  */
package exercise12;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] palavraSplit;
        
        System.out.println("=========================");
        System.out.println("Digite uma frase: ");
        String texto = sc.nextLine();
        sc.close();
        
        palavraSplit = texto.split(" ");
        
        System.out.println("\nResultado: ");
        for(int i = 0; i< palavraSplit.length; i++) {
            System.out.println(palavraSplit[i]);
        }
        
        System.out.println("=========================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================");
    }
}
