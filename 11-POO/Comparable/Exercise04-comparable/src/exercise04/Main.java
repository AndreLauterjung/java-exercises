/* Enunciado do exercício:

Países por nome (String)

- Crie a classe Pais com nome (String) e populacao (int), construtor e getters. 
- Implemente Comparable<Pais>, com o compareTo usando this.nome.compareTo(outro.nome). 
- Crie um ArrayList<Pais> com Brasil, argentina, Chile, uruguai e Peru, com populações à sua escolha. 
- Ordene e imprima só os nomes.
- Troque a linha do compareTo por this.nome.compareToIgnoreCase(outro.nome), rode de novo e compare. 

Esperado: primeiro Brasil, Chile, Peru, argentina, uruguai, e depois argentina, Brasil, Chile, Peru, uruguai. */

package exercise04;

import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Pais> paises = new ArrayList<>();
        
        paises.add(new Pais("Brasil", 212000000));
        paises.add(new Pais("argentina", 46000000));
        paises.add(new Pais("Chile", 19000000));
        paises.add(new Pais("uruguai", 3000000));
        paises.add(new Pais("Peru", 34000000));
        
        Collections.sort(paises);
        
        for(Pais pais: paises){
            System.out.println(pais.getNome());
        }
        
        
    }
}
