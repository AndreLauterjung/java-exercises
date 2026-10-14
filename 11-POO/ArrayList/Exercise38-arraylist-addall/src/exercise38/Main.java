/* Enunciado do exercício:

- Crie a classe Produto (atributos: String nome).

- Crie o estoque da "Filial A" e o estoque da "Filial B", e junte os dois em uma lista de "Estoque Central" com
.addAll(). */

package exercise38;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Produto> estoqueFilialA = new ArrayList<>();
        ArrayList<Produto> estoqueFilialB = new ArrayList<>();
        ArrayList<Produto> estoqueCentral = new ArrayList<>();
        
        estoqueFilialA.add(new Produto("Arroz"));
        estoqueFilialA.add(new Produto("Cereal"));
        estoqueFilialA.add(new Produto("Feijão"));
        
        estoqueFilialB.add(new Produto("Frango"));
        estoqueFilialB.add(new Produto("Carne Moída"));
        estoqueFilialB.add(new Produto("Salmão"));
        
        System.out.println("\nProdutos no estoque da filial A");
        for(Produto produto: estoqueFilialA)
        {
            System.out.println("Produto: "+produto.getNome());
        }
        
        System.out.println("\nProdutos no estoque da filial B");
        for(Produto produto: estoqueFilialB)
        {
            System.out.println("Produto: "+produto.getNome());
        }
        
        estoqueCentral.addAll(estoqueFilialA);
        estoqueCentral.addAll(estoqueFilialB);
        System.out.println("\nProdutos estoque Central: ");
        for(Produto produto: estoqueCentral)
        {
            System.out.println("Produto: "+produto.getNome());
        }
        
    }
}
