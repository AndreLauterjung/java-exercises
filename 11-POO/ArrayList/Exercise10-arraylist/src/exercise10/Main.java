/* Enunciado do exercício:

Substituindo um item com .set().

- Crie um ArrayList<String> chamado diasDaSemana, e adicione: "Segunda", "Terca", "Quarta", "Kinta" (sim, com 
erro de digitação proposital). 

- Use .set() para corrigir o item da posição 3 (que está escrito errado, "Kinta"), substituindo por "Quinta" (escrito 
certo). 

- Percorra a lista com for + .size() + .get(i), para confirmar que a correção funcionou e os outros itens continuam
iguais.  */
package exercise10;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> diasDaSemana = new ArrayList<>();
        
        diasDaSemana.add("Domingo");
        diasDaSemana.add("Segunda");
        diasDaSemana.add("Terça");
        diasDaSemana.add("Quarta");
        diasDaSemana.add("Kinta");
        
        System.out.println("ArrayList antes da alteração: ");
        for(int i = 0; i < diasDaSemana.size(); i++)
        {
            System.out.println(diasDaSemana.get(i));
        }
        
        diasDaSemana.set(4, "Quinta");
        
        System.out.println("\nArrayList depois da alteração: ");
        for(int i = 0; i < diasDaSemana.size(); i++)
        {
            System.out.println(diasDaSemana.get(i));
        }
    }
}
