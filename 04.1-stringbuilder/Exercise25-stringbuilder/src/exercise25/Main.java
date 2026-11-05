/* Enunciado do exercício:

Palíndromo de frase

- Peça uma frase com Scanner (nextLine()). 
- Crie um StringBuilder chamado limpo. Percorra a frase (já em minúsculas, com toLowerCase()) com charAt(i) e
adicione com append apenas os caracteres que não forem espaço (!= ' '). 
- Crie uma String com o conteúdo do limpo (toString()), depois use reverse() no próprio limpo e converta de novo. 
- Compare as duas String com equals e imprima É palíndromo ou Não é palíndromo. 

Testes: A sacada da casa, Java e legal e Socorram me subi no onibus em Marrocos. Todos sem acento.
Esperado: É palíndromo, Não é palíndromo e É palíndromo.

Cuidado: o reverse() altera o próprio StringBuilder. Por isso a cópia do texto original precisa ser guardada antes de
inverter. */

package exercise25;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        StringBuilder limpo = new StringBuilder();
        String fraseLimpa = "";
        String fraseReverse = "";
        
        System.out.println("\n=========================================");
        System.out.println("Digite uma frase: ");
        String fraseUsuario = sc.nextLine().toLowerCase();
        sc.close();
        
        for(int i = 0; i < fraseUsuario.length(); i++) {
            
            if(fraseUsuario.charAt(i) != ' ') {
                
                limpo.append(fraseUsuario.charAt(i));
            }
        }
        
        fraseLimpa = limpo.toString();
        fraseReverse = limpo.reverse().toString();
        
        if(fraseLimpa.equals(fraseReverse)) {
            System.out.println("\nÉ palíndromo!"); 
            
            System.out.println("Frase sem espaços: "+fraseLimpa);
            System.out.println("Frase após o método reverse(): "+fraseReverse);
        }
        else {
            System.out.println("\nNÃO é palíndromo!"); 
            
            System.out.println("Frase sem espaços: "+fraseLimpa);
            System.out.println("Frase após o método reverse(): "+fraseReverse);
        }
        
        System.out.println("\n=========================================");
        System.out.println("PROGRAMA ENCERRADO!");
        System.out.println("=========================================");
    }
}
