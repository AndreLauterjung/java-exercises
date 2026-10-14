/* Enunciado do exercício:

- Crie a classe Carro (atributos: String modelo).

- Condicione a impressão da lista de veículos à verificação de que a garagem não está vazia (!lista.isEmpty()). */
package exercise30;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Carro> garagem = new ArrayList<>();
        
        garagem.add(new Carro("Porsche"));
        
        boolean isGaragemVazia = garagem.isEmpty();
        
        if(!isGaragemVazia)
        {
            for(Carro carro: garagem)
            {
                System.out.println("Modelo do carro: "+carro.getModelo());
            }
        }
        else
        {
            System.out.println("Não há carros!");
        }
    }
}
