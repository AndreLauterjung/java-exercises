/* Enunciado do exercício:

- Crie a classe Produto (atributos: String codigo).

- Use .contains() para checar se um código de produto específico ainda está ativo no estoque. */

package exercise16;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Produto> estoque = new ArrayList<>();
        
        estoque.add(new Produto("AASD38234"));
        estoque.add(new Produto("D0UD0ASD"));
        estoque.add(new Produto("939RAAHDAS"));
        estoque.add(new Produto("AS0CJWC"));
        estoque.add(new Produto("YA0S30A"));
        
        
        
        boolean isNoEstoque = estoque.contains(new Produto("YA0S30"));
        
        if(isNoEstoque)
        {
            System.out.println("Há produto com esse código no estoque!");
            
            System.out.println("\nLista: ");
            for(Produto produto : estoque)
            {
                System.out.println(produto.getCodigoProduto());
            }
        
        }
        else
        {
            System.out.println("Não há produto com esse código no estoque!");
            
            System.out.println("\nLista: ");
            for(Produto produto : estoque)
            {
                System.out.println(produto.getCodigoProduto());
            }
        }
    }
}
