/* Enunciado do exercícío:

Juntando duas listas.

- Crie dois ArrayList<String>: nomesTurmaA com 3 nomes, e nomesTurmaB com 3 nomes diferentes.

- Use .addAll() para juntar todos os nomes da nomesTurmaB dentro de nomesTurmaA. Percorra nomesTurmaA
depois, confirmando que agora tem 6 nomes. */

package exercise11;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> nomesTurmaA = new ArrayList<>();
        ArrayList<String> nomesTurmaB = new ArrayList<>();
        
        nomesTurmaA.add("João");
        nomesTurmaA.add("Maria");
        nomesTurmaA.add("Gabriel");
        nomesTurmaB.add("Luis");
        nomesTurmaB.add("Fernando");
        nomesTurmaB.add("Letícia");
        
        nomesTurmaA.addAll(nomesTurmaB);
        
        for(int i = 0; i < nomesTurmaA.size(); i++)
        {
            System.out.println(nomesTurmaA.get(i));
        }
        
    }
}
