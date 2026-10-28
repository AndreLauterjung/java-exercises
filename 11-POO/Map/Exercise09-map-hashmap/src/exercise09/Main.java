/* Enunciado do exercício:

O usuário preenche o mapa

- Crie um Map<String, Integer> vazio chamado idades. 
- Num loop de 3 voltas, peça com Scanner um nome e uma idade, e guarde com put. Lembre do sc.nextLine()
depois do nextInt(). 
- Percorra com entrySet() e imprima nome tem X anos. 
- Rode de novo digitando o mesmo nome duas vezes, com idades diferentes. Imprima o size() e a idade que ficou. 

Esperado: com 3 nomes diferentes, o tamanho é 3. Com um nome repetido, o tamanho é 2, e fica a idade da última
vez. */

package exercise09;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> idades = new HashMap<>();
        
        
        for(int i = 0; i < 3; i++) {
            
            System.out.println("Digite um nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Digite uma idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            
            idades.put(nome, idade);
            System.out.println("\nInformações adicionadas no Map!\n");
        }
        
        System.out.println("\nLista de pessoas");
        for(Map.Entry<String, Integer> idade : idades.entrySet()) {
            
            System.out.println(idade.getKey()+" tem "+idade.getValue()+" de idade.");
        }
        
        sc.close();
    }
}
