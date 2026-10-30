/* Enunciado do exercício:

Removendo Espaços Indesejados

- Objetivo: Limpar uma frase eliminando todos os seus espaços em branco.
- O que fazer: Peça ao usuário uma frase e utilize o replace() para substituir todos os espaços (" ") por uma string
vazia ("").

Exemplo de saída:

- Entrada: "Java é muito legal"
- Saída: "Javaémuitolegal" */

package exercise08;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------------------");
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        sc.close();
        
        System.out.println("\nFrase digitada: "+frase);
        
        frase = frase.replace(" ", "");
        
        System.out.println("\nFrase sem espaços: "+frase);
        
        
        System.out.println("\n------------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("------------------------------------------");
    }
}
