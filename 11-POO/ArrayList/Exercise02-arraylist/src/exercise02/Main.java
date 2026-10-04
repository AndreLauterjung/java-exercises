/* Enunciado do exercício:

Lista de preços
Crie um programa que utilize um ArrayList do tipo Double para armazenar 4 preços de produtos. Utilize um laço 
for em conjunto com .size() e .get() para percorrer a lista e exibir cada preço no console, formatado como 
"Preço: R$ " + valor. */

package exercise02;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> valores = new ArrayList();
        
        valores.add(100.0);
        valores.add(299.0);
        valores.add(300.0);
        valores.add(790.0);
        
        for(int i = 0; i < valores.size(); i++)
        {
            System.out.println("Preço: R$ "+valores.get(i));
        }
    }
}
