/* Enunciado do exercício:

Reajuste de preços (o setValue)

Cada Entry tem um método a mais: entrada.setValue(novoValor) troca o valor daquela entrada dentro do mapa,
sem precisar de put.

- Crie um Map<String, Double> com Caderno 20.0, Caneta 3.5 e Mochila 80.0. 
- Imprima os preços com entrySet(). 
- Percorra de novo e some R$ 5,00 em cada preço: entrada.setValue(entrada.getValue() + 5.0);. 
- Imprima os preços de novo, com entrySet(). 
- Confira com get("Caneta"). 

Esperado: depois do reajuste, Caderno 25.0, Caneta 8.5 e Mochila 85.0, e o get confirma 8.5. */

package exercise05;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, Double> itens = new HashMap<>();
        
        itens.put("Caderno", 20.0);
        itens.put("Caneta", 3.5);
        itens.put("Mochila", 80.0);
        
        System.out.println("\nPreço dos itens: ");
        for(Map.Entry<String, Double> item: itens.entrySet()) {
            
            item.setValue(item.getValue() + 5);
            
            System.out.println("Item: "+item.getKey()+" | Preço: R$ "+item.getValue());
        }
        
        System.out.println("(Get) Caneta: R$ "+itens.get("Caneta"));
        
        
        
    }
}
