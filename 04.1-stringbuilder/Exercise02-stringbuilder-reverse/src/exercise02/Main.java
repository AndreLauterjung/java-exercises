/* Enunciado do exercício:

Peça uma palavra com Scanner, crie um StringBuilder com ela e use reverse(). Compare o texto invertido com o
original e imprima se é palíndromo. Esperado: arara dá true, java dá false. */

package exercise02;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder palavraBuilder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        sc.close();
        
        palavraBuilder.append(palavra);
        String palavraNova = palavraBuilder.reverse().toString();
        
        if(palavra.equalsIgnoreCase(palavraNova)) {
            System.out.println("\nÉ palíndromo!");
            System.out.println("Palavra normal: "+palavra);
            System.out.println("Palavra inversa: "+palavraNova);
        }
        else
        {
            System.out.println("\nNão é palíndromo!");
            System.out.println("Palavra normal: "+palavra);
            System.out.println("Palavra inversa: "+palavraNova);
        }
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
