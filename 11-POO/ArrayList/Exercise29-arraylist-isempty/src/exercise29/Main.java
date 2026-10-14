/* Enunciado do exercício:

- Crie a classe Musica (atributos: String titulo).

- Crie um player de música que avisa o usuário caso a playlist .isEmpty() esteja sem faixas. */

package exercise29;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Musica> playlist = new ArrayList<>();
        
        boolean isSemFaixa = playlist.isEmpty();
        
        if(isSemFaixa)
        {
            System.out.println("A playlist está vazia!");
        }
        else
        {
            System.out.println("A playlist tem "+playlist.size()+" músicas!");
        }
    }
}
