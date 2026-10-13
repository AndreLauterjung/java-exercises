/* Enunciado do exercício:

- Crie a classe Produto (atributos: String nome).

- Adicione 3 produtos e use .indexOf() para encontrar e imprimir em qual posição exata (índice) um produto
específico está salvo. */

package exercise22;

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
        
        estoque.add(new Produto("Arroz"));
        estoque.add(new Produto("Feijão"));
        estoque.add(new Produto("Macarrão"));
        
        int resultado = estoque.indexOf(new Produto("Feijão"));
        
        if(resultado < 0)
        {
            System.out.println("O produto não está no estoque.");
        }
        else
        {
            System.out.println("O produto está na posição: "+resultado);
        }
    }
}
