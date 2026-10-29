/* Enunciado do exercício:

Tabela do campeonato

- Crie um LinkedHashMap<String, Integer> na ordem do ranking: Tigres 70, Leões 68, Águias 65 e Lobos 60.
Declare como Map<String, Integer>. 
- Percorra com entrySet() e imprima 1º Tigres - 70 pts, 2º Leões - 68 pts e assim por diante. Use uma variável int
posicao que começa em 1 e sobe a cada volta. 
- Troque o LinkedHashMap por HashMap, rode de novo e compare a ordem. 

Esperado: com LinkedHashMap, o ranking sai na ordem em que foi inserido. Com HashMap, a ordem pode sair
diferente, e as posições deixam de fazer sentido. */

package exercise11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
       Map<String, Integer> ranking = new LinkedHashMap<>();
       //Map<String, Integer> ranking = new HashMap<>();
       
        ranking.put("Tigres", 70);
        ranking.put("Leões", 68);
        ranking.put("Águias", 65);
        ranking.put("Lobos", 60);
        
        int posicao = 1;
        for(Map.Entry<String, Integer> rankingAnimal : ranking.entrySet()) {
            
            
            System.out.println(posicao+"º "+rankingAnimal.getKey()+" - "+rankingAnimal.getValue()+" pts.");
            posicao++;
        }

    }
}
