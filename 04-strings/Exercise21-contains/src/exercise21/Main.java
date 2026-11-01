/* Enunciado do exercício:

O Buscador Inteligente (Desafio Case-Insensitive)

- Objetivo: Fazer uma busca por palavra-chave ignorando se o usuário digitou maiúsculas ou minúsculas.
- O que fazer: Como o contains() diferencia maiúsculas de minúsculas, se você buscar por "Java" em "eu amo java",
ele vai retornar false. Para resolver isso, converta o texto do usuário para letras minúsculas usando o método
.toLowerCase() antes de aplicar o contains(). Peça uma frase, busque por uma palavra-chave (ex: "java") e confirme
se ela está presente, não importa como o usuário digitou.

Exemplo de saída:

- Entrada: "Estou estudando jAvA hoje!"
- Saída: "A palavra-chave foi encontrada no texto!" */

package exercise21;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();
        sc.close();
        
        boolean isNaFrase = frase.contains("java");
        
        if(isNaFrase) {
            System.out.println("\nA palavra-chave foi encontrada no texto!");
            System.out.println("Texto digitado: "+frase);
        }
        else {
            System.out.println("\nA palavra-chave NÃO foi encontrada no texto!");
        }
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
        
    }
}
