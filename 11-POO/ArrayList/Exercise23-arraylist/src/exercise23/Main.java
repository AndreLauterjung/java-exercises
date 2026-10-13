/* Enunciado do exercício:

- Crie a classe Musica (atributos: String titulo).

- Busque o índice de uma música usando .indexOf() para saber se ela está na primeira metade da playlist. */

package exercise23;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Musica> musicas = new ArrayList<>();
        
        musicas.add(new Musica("Hino do Brasil"));
        musicas.add(new Musica("Evidências"));
        musicas.add(new Musica("Paz e Amor"));
        
        int resultado = musicas.indexOf(new Musica("Paz e Amor"));
        
        
        
        if(resultado < 0)
        {
            System.out.println("Música não encontada");
        }
        else if(resultado < (musicas.size() / 2.0))
        {
            System.out.println("Música encontrada na posição: "+resultado);
            System.out.println("Está na primeira metade da lista");
        }
        else
        {
            System.out.println("Música encontrada na posição: "+resultado);
            System.out.println("Está na segunda metade da lista");
        }
    }
}
