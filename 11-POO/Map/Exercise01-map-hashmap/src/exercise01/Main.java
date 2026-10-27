/* Enunciado do exercício:

Crie um Map<String, Integer> chamado notas. 

- Guarde 3 alunos com as notas: Ana 8, Bruno 6, Carla 9. 
- Imprima a nota do Bruno com get. 
- Troque a nota do Bruno para 7, usando put de novo, e imprima. 
- Imprima a nota de um aluno que você não guardou e veja o que aparece. 
- Imprima o size(). 

Esperado: 6, depois 7, depois null, e o tamanho 3. */

package exercise01;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, Integer> notas = new HashMap<>();
        
        notas.put("Ana", 8);
        notas.put("Bruno", 6);
        notas.put("Carla", 9);

        System.out.println(notas.get("Bruno"));
        notas.put("Bruno", 7);
        System.out.println(notas.get("Bruno"));
        
        System.out.println(notas.get("Matheus"));
        System.out.println(notas.size());
    }
}
