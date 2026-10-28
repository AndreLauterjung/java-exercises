/* Enunciado do exercício:

- Crie um Map<String, Integer> com Ana 12, Bia 18, Carla 9 e Dani 15 (jogadora e gols). 
- Percorra com entrySet() e descubra quem fez mais gols. Use duas variáveis: String artilheira e int maiorGols,
começando com "" e -1. 
- No mesmo loop, some todos os gols numa variável int total. 
- Imprima Artilheira: Bia (18 gols) e Total de gols: 54. 

Esperado: as duas linhas acima. */

package exercise04;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, Integer> time = new HashMap<>();
        
        time.put("Ana", 12);
        time.put("Bia", 18);
        time.put("Carla", 9);
        time.put("Dani", 15);
        
        int total = 0;
        int maisGols = -1;
        String artilheira = "";
        
        for(Map.Entry<String, Integer> jogadora : time.entrySet()) {
            
            total += jogadora.getValue();
            
            if(jogadora.getValue() > maisGols) {
                maisGols = jogadora.getValue();
                artilheira = jogadora.getKey();
            }
            
        }
        
        System.out.println("Artilheira: "+artilheira+"("+maisGols+" gols)");
        System.out.println("Total de gols: "+total);
    }
}
