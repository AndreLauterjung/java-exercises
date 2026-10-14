/* Enunciado do exercício:

- Crie a classe Produto (atributos: String nome).

- Simule um carrinho de compras: bloqueie a finalização do pedido caso .isEmpty() retorne true. */

package exercise28;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Produto> carrinhoCompras = new ArrayList<>();
        
        
        boolean isCarrinhoVazio = carrinhoCompras.isEmpty();
        
        if(isCarrinhoVazio)
        {
            System.out.println("Não é possível finalizar o pedido. ");
        }
        else
        {
            System.out.println("Pedido finalizado!");
            System.out.println("\nItens no carrinho: ");
            for(Produto produto: carrinhoCompras)
            {
                System.out.println(produto.getNomeProduto());
            }
        }
    }
}
