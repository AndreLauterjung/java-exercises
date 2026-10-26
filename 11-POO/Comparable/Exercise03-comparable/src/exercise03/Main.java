/* Enunciado do exercício:

Frutas por preço (double)

- Crie a classe Fruta com nome (String) e preco (double), construtor e getters. 
- Implemente Comparable<Fruta>, com o compareTo usando Double.compare(this.preco, outro.preco). 
- Crie um ArrayList<Fruta> com Maçã 4.5, Banana 3.2, Uva 8.9, Manga 5.0 e Limão 2.1. 
- Ordene e imprima nome e preço. Imprima também a mais barata e a mais cara, usando o primeiro e o último da
lista ordenada. 

Esperado: Limão, Banana, Maçã, Manga e Uva, com a mais barata Limão (2.1) e a mais cara Uva (8.9). */

package exercise03;

import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Fruta> frutas = new ArrayList<>();
        
        frutas.add(new Fruta("Maçã", 4.5));
        frutas.add(new Fruta("Banana", 3.2));
        frutas.add(new Fruta("Uva", 8.9));
        frutas.add(new Fruta("Manga", 5.0));
        frutas.add(new Fruta("Limão", 2.1));
        
        Collections.sort(frutas);
        
        System.out.println("Fruta mais barata: "+frutas.getFirst().getNome()+" Preço: R$ "+frutas.getFirst().getPreco());
        System.out.println("Fruta mais cara: "+frutas.getLast().getNome()+" Preço: R$ "+frutas.getLast().getPreco());
        
        System.out.println("\nLista de frutas: ");
        for(Fruta fruta : frutas)
        {
            System.out.println("Fruta: "+fruta.getNome()+" \t| Preço: "+fruta.getPreco());
        }
            
        
    }
}
