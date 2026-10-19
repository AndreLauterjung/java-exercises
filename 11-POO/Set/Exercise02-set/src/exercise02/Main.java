/* Enunciado do exercício:

Lista de convidados

- Você está organizando uma festa e anotando os convidados. Crie um Set<String> chamado convidados e adicione
os nomes “Ana”, “Bruno”, “Carla” e “Bruno” (sim, o Bruno é adicionado duas vezes por engano).

Depois:

Imprima todos os convidados.
Imprima quantos convidados o Set tem.
Imprima o retorno de cada chamada de add, para descobrir qual delas foi rejeitada.

 */
package exercise02;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args) {
        
        Set<String> listaConvidados = new HashSet<>();
        
        System.out.println(listaConvidados.add("Ana"));
        System.out.println(listaConvidados.add("Bruno"));
        System.out.println(listaConvidados.add("Carla"));
        System.out.println(listaConvidados.add("Bruno"));
        
        for(String convidado : listaConvidados)
        {
            System.out.println(convidado);
        }
        
        System.out.println(listaConvidados.size());
        
        
    }
}
