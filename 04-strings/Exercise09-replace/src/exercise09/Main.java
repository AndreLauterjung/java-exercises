/* Enunciado do exercício:

O Censurador de Palavras

- Objetivo: Simular um filtro de conteúdo que censura uma palavra imprópria.
- O que fazer: Crie um texto padrão que contenha uma palavra específica (por exemplo, a palavra "droga" ou
"chatice"). Peça para o programa substituir essa palavra indesejada por asteriscos ("***") utilizando o replace().

Exemplo de saída:

- Entrada: "Hoje o dia está uma chatice"
- Saída: "Hoje o dia está uma ***" */

package exercise09;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavrasProibidas = new ArrayList<>();
        
        palavrasProibidas.add("horripilante");
        palavrasProibidas.add("malvado");
        palavrasProibidas.add("feio");
        
        System.out.println("----------------------------------------------");
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();
        sc.close();
        
        for(int i = 0; i < palavrasProibidas.size(); i++) {
            
            
            if(frase.contains(palavrasProibidas.get(i))) {
                
                frase = frase.replace(palavrasProibidas.get(i), "********");
            }
        }
        
        System.out.println("\n----------------------------------------------");
        System.out.println("Frase nova: "+frase);
        
        
        System.out.println("\n----------------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("----------------------------------------------");
        
    }
}
