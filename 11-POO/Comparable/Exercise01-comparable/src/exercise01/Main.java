/* Enunciado do exercício:

Planetas por tamanho (int, crescente)

- Crie a classe Planeta com nome (String) e diametroKm (int), construtor e getters. 
- Implemente Comparable<Planeta>, com o compareTo comparando diametroKm por Integer.compare. 
- Crie um ArrayList<Planeta> com Terra 12742, Marte 6779, Júpiter 139820, Mercúrio 4879 e Vênus 12104. 
- Ordene com Collections.sort e imprima nome e diâmetro. 

Esperado: Mercúrio, Marte, Vênus, Terra e Júpiter. */

package exercise01;

import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Planeta> planetas = new ArrayList<>();
        
        planetas.add(new Planeta("Terra", 12742));
        planetas.add(new Planeta("Marte", 6779));
        planetas.add(new Planeta("Júpiter", 139820));
        planetas.add(new Planeta("Mercúrio", 4879));
        planetas.add(new Planeta("Vênus", 12104));
        
        Collections.sort(planetas);
        
        System.out.println("\nLista de planetas: ");
        for(Planeta planeta: planetas)
        {
            System.out.println("Nome: "+planeta.getNome()+"\t| Km diâmetro: "+planeta.getDiametro());
        }
        
    }
}
