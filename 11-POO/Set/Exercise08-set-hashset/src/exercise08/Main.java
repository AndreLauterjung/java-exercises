/* Enunciado do exercício:

Tirando repetidos de uma lista

Crie um ArrayList<String> com 8 cidades, com várias repetidas.
Crie um HashSet<String> passando a lista no construtor: new HashSet<>(lista).
Imprima o tamanho da lista, o tamanho do conjunto e o conteúdo do conjunto. */

package exercise08;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> cidades = new ArrayList<>();
        
        cidades.add("Curitiba");
        cidades.add("Salvador");
        cidades.add("Curitiba");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Florianópolis");
        cidades.add("Recife");
        cidades.add("Curitiba");
        
        Set<String> listaCidades = new HashSet<>(cidades);
        
        System.out.println("\nTamanho da lista de cidades: "+cidades.size());
        System.out.println("\nTamanho do conjunto: "+listaCidades.size());
        
        System.out.println("\nConteúdo do conjunto: ");
        for(String cidade : listaCidades)
        {
            System.out.println(cidade);
        }
        
        
    }
}
