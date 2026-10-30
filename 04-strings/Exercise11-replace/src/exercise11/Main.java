/* Enunciado do exercício:

O Tradutor de Leetspeak (Encadeamento)

- Objetivo: Praticar o encadeamento de múltiplos métodos replace() (Method Chaining).
- O que fazer: O leetspeak é uma forma de escrita da internet que troca letras por números parecidos. Crie um
programa que receba uma palavra e substitua:

    'a' por '4'
    'e' por '3'
    'i' por '1'
    'o' por '0'

Dica: Em Java, você pode encadear as chamadas assim: texto.replace("a", "4").replace("e", "3")...

Exemplo de saída:

- Entrada: "internet"
- Saída: "1nt3rn3t" */

package exercise11;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();
        sc.close();
        
        texto = texto.replace("i", "1").replace("a", "4").replace("e", "3").replace("o", "0");
        
        System.out.println("\nTexto editado: "+texto);
        
        System.out.println("\n----------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("----------------------------------------");
    }
}
