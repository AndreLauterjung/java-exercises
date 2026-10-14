/* Enunciado do exercício:

- Crie a classe Produto (atributos: String nome).

- Adicione alguns produtos ao carrinho e simule o botão "Cancelar Compra", limpando tudo com .clear() */

package exercise32;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> carrinho = new ArrayList<>();
        
        carrinho.add(new Produto("Arroz"));
        carrinho.add(new Produto("Feijão"));
        carrinho.add(new Produto("Manteiga"));
        carrinho.add(new Produto("Pão"));
        carrinho.add(new Produto("Biscoito"));
        
        System.out.println("Cancelar compra? (S/n)");
        String resposta = sc.nextLine().toLowerCase();
        sc.close();
        
        if(resposta.equals("s") && !carrinho.isEmpty())
        {
            System.out.println("Compra cancelada!");
            carrinho.clear();
            
            System.out.println("Itens no carrinho: "+carrinho.size());
        }
        else
        {
            System.out.println("A compra não foi cancelada!");
        }

    }

}
