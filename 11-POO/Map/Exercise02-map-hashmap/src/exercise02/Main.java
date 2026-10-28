/* Enunciado do exercício:

Estoque de frutas

- Crie um Map<String, Integer> com Maçã 15, Banana 8, Uva 22 e Manga 5 (fruta e quantidade). 
- Percorra com entrySet() e imprima Maçã: 15 unidades para cada uma. 
- Percorra de novo e imprima Repor estoque: só das frutas com menos de 10 unidades. 

Esperado: as 4 linhas de estoque e depois Banana e Manga como frutas a repor. */

package exercise02;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, Integer> frutas = new HashMap<>();
        
        frutas.put("Maçã", 15);
        frutas.put("Banana", 8);
        frutas.put("Uva", 22);
        frutas.put("Manga", 5);
        
        for(Map.Entry<String, Integer> fruta: frutas.entrySet()) {
            System.out.println("Fruta: "+fruta.getKey()+" | Quantidade: "+fruta.getValue());
        }
        
        for(Map.Entry<String, Integer> fruta: frutas.entrySet()) {
            if(fruta.getValue() < 10) {
                System.out.println("Repor estoque de "+fruta.getKey());
            }
        }
        
    }
}
