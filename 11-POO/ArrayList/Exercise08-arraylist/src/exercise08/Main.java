/* Enunciado do exercício:

Lista de compras com remoção por valor.

- Crie um ArrayList<String> chamado listaCompras.

- Adicione 5 itens (ex: "Arroz", "Feijão", "Leite", "Ovos", "Açúcar"). 

- Imprima a lista inteira, usando um for com .size() e .get(i). 

- Use .remove("Leite") (passando o texto diretamente, não um índice) para remover esse item específico da lista.

- Imprima a lista de novo, para confirmar que "Leite" foi removido e os outros itens continuam lá. 

*/

package exercise08;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> listaCompras = new ArrayList<>();
        
        listaCompras.add("Arroz");
        listaCompras.add("Carne");
        listaCompras.add("Feijão");
        listaCompras.add("Café");
        listaCompras.add("Açúcar");
        listaCompras.add("Leite");
        
        System.out.println("\n********* Lista de compras ************");
        for(int i = 0; i < listaCompras.size(); i++)
        {
            int posicaoItem = i+1;

            System.out.println(posicaoItem+" - "+listaCompras.get(i));
        }
        
        listaCompras.remove("Leite");
        
        System.out.println("\n********* Lista de compras ************");
        for(int i = 0; i < listaCompras.size(); i++)
        {
            int posicaoItem = i+1;
            
            System.out.println(posicaoItem+" - "+listaCompras.get(i));
        }
    }
}
