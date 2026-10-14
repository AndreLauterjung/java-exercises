/* Enunciado do exercício:

- Crie a classe Produto (atributos: String codigo).

- Simule a reinicialização de um sistema de estoque utilizando .clear(). */

package exercise36;

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
        
        estoque.add(new Produto("ASDF1"));
        estoque.add(new Produto("QWERT1"));
        estoque.add(new Produto("ZXCVB1"));
        
        System.out.println("\nLista de códigos dos produtos no estoque: ");
        for(int i = 0; i< estoque.size(); i++)
        {
            System.out.println("Código do produto: "+estoque.get(i).getCodigo());
        }
        
        System.out.println("\nReinicializando sistema...");
        System.out.println("Lista de produtos no estoque limpa!");
        estoque.clear();
        System.out.println("Quantidade de itens no estoque: "+estoque.size());
    }
}
