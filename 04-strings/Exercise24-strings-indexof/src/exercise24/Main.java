/* Enunciado do exercício:

Verificando se a Palavra Existe

- Objetivo: Utilizar o valor -1 retornado pelo indexOf() para validações.
- O que fazer: Peça uma frase ao usuário e solicite que ele digite uma palavra para buscar. Use o
indexOf(palavraBusca). Se o resultado for igual a -1, informe que a palavra não foi encontrada; caso contrário,
mostre a partir de qual índice ela começa.

Exemplo de saída:

- Entrada: Frase: "A linguagem Java é muito versátil" / Busca: "Java"
- Saída: "Palavra encontrada a partir do índice: 11" */

package exercise24;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String texto = "A linguagem Java é muito versátil.";
        
        System.out.println("\n===============================================");
        System.out.println("Digite uma palavra para buscar no texto: \n"+texto);
        String palavra = sc.nextLine();
        
        int posicaoPalavra = texto.indexOf(palavra);
        
        if(posicaoPalavra == -1) {
            System.out.println("Palavra não encontrada!");
        }
        else {
            System.out.println("Palavra encontrada a partir do índice: "+posicaoPalavra);
        }
        
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
