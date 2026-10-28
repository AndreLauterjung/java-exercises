/* Enunciado do exercício:

Filtrando para outro mapa

- Crie um Map<String, Integer> chamado idades com Ana 17, Bruno 25, Carla 18, Diego 15 e Eva 30. 
- Crie um segundo mapa vazio, maioresDeIdade, do mesmo tipo. 
- Percorra idades com entrySet(). Se a idade for 18 ou mais, adicione a entrada no segundo mapa com
put(entrada.getKey(), entrada.getValue()). 
- Imprima o tamanho dos dois mapas e percorra o segundo com entrySet(). 

Esperado: tamanho 5 e 3, e no segundo mapa Bruno, Carla e Eva. */

package exercise06;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, Integer> maioresIdade = new HashMap<>();
        Map<String, Integer> idades = new HashMap<>();
        
        idades.put("Ana", 17);
        idades.put("Bruno", 25);
        idades.put("Carla", 18);
        idades.put("Diego", 15);
        idades.put("Eva", 30);
        
        for(Map.Entry<String, Integer> pessoa : idades.entrySet()) {
            
            if(pessoa.getValue() >= 18) {
                
                maioresIdade.put(pessoa.getKey(), pessoa.getValue());
            }
        }
        
        System.out.println("\nPessoas: "+idades.size());
        for(Map.Entry<String, Integer> pessoa : idades.entrySet()) {
            System.out.println("Nome: "+pessoa.getKey()+"\t| Idade: "+pessoa.getValue());
        }
        
        System.out.println("\nPessoas maiores de idade: "+maioresIdade.size());
        for(Map.Entry<String, Integer> pessoa : maioresIdade.entrySet()) {
            System.out.println("Nome: "+pessoa.getKey()+"\t| Idade: "+pessoa.getValue());
        }
    }
}
