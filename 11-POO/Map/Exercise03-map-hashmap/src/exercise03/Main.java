/* Enunciado do exercício:

Agenda e a busca que não precisava de loop

- Crie um Map<String, String> com Marina 9999-1111, Pedro 8888-2222 e Luiza 7777-3333 (nome e telefone). 
- Percorra com entrySet() e imprima Marina: 9999-1111 para cada contato. 
- Descubra o telefone do Pedro percorrendo o entrySet(): dentro do loop, compare
entrada.getKey().equals("Pedro") e guarde o telefone numa variável String. 
- Descubra o mesmo telefone com get("Pedro") e imprima os dois resultados. 

Esperado: 8888-2222 nas duas buscas. */

package exercise03;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, String> telefones = new HashMap<>();
        
        telefones.put("Marina", "9999-1111");
        telefones.put("Pedro", "8888-2222");
        telefones.put("Luiza", "7777-3333");
        
        String numeroTel = "";
        for(Map.Entry<String, String> telefone : telefones.entrySet()) {
            
            if(telefone.getKey().equals("Pedro")) {
                numeroTel = telefone.getValue();
            }
        }
        
        System.out.println("Telefone Pedro: "+numeroTel);
        
        System.out.println("(Get) Telefone Pedro: "+telefones.get("Pedro"));
    }
}
