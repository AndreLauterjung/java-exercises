/* Enunciado do exercício:

- Crie a classe Carro (atributos: String modelo).

- Substitua um carro que estava na posição 2 por um modelo novo utilizando o método .set(). */

package exercise20;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Carro> carros = new ArrayList<>();
        
        carros.add(new Carro("Porsche"));
        carros.add(new Carro("Ferrari"));
        carros.add(new Carro("Fusca"));
        carros.add(new Carro("Corsa"));
        
        System.out.println("\nLista de modelos de carro antes da alteração: ");
        for(int i = 0; i < carros.size(); i++)
        {
            System.out.printf("Modelo: %s\n", carros.get(i).getModelo());
        }
        
        carros.set(2, new Carro("Palio"));
        
        System.out.println("\nLista de modelos de carro após a alteração: ");
        for(int i = 0; i < carros.size(); i++)
        {
            System.out.printf("Modelo: %s\n", carros.get(i).getModelo());
        }
    }
}
