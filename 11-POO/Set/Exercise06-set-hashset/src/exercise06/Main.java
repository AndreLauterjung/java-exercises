/* Enunciado do exercício:

Conjunto de nomes

- Crie um HashSet<String> chamado nomes.

- Adicione 6 nomes, sendo 2 deles repetidos (por exemplo Ana duas vezes e Carlos duas vezes).
Imprima o .size() e percorra com for-each imprimindo cada nome.

Esperado: o tamanho conta só os nomes diferentes. A ordem de impressão pode não ser a da inserção. */

package exercise06;

import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Set<String> nomes = new HashSet<>();
        
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("André");
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Letícia");
        
        System.out.println("Tamanho: "+nomes.size());
        
        for(String nome : nomes)
        {
            System.out.println(nome);
        }
        
    }
}
