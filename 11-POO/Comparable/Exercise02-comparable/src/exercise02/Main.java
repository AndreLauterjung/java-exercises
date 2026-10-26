/* Enunciado do exercício:

Passageiros do mais velho ao mais novo (int, decrescente)

- Crie a classe Passageiro com nome (String) e idade (int), construtor e getters. 
- Implemente Comparable<Passageiro>, com o compareTo fazendo a ordem decrescente por idade. Dica: troque
this e outro de lugar no Integer.compare. 
- Crie um ArrayList<Passageiro> com Ana 34, Bruno 19, Carla 52, Diego 27 e Eva 41. 
- Ordene e imprima. 

Esperado: Carla, Eva, Ana, Diego e Bruno. */

package exercise02;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Passageiro> passageiros = new ArrayList<>();
        
        passageiros.add(new Passageiro("Ana", 34));
        passageiros.add(new Passageiro("Bruno", 19));
        passageiros.add(new Passageiro("Carla", 52));
        passageiros.add(new Passageiro("Diego", 27));
        passageiros.add(new Passageiro("Eva", 41));

        Collections.sort(passageiros);
        
        for(Passageiro passageiro : passageiros){
            System.out.println(passageiro.getNome()+" | "+passageiro.getIdade());
        }
        
    }
}
