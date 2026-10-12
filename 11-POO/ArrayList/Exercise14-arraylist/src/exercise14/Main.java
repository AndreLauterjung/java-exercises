/* Enunciado do exercício:

- Crie a classe Musica (atributos: String titulo).

= Peça o nome de uma música via Scanner e utilize .contains() para responder ao usuário se ela está ou não
presente na playlist. */


package exercise14;

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
        ArrayList<Musica> playlist = new ArrayList<>();
        
        playlist.add(new Musica("Smells Like Teen Spirit"));
        playlist.add(new Musica("Come as you Are"));
        playlist.add(new Musica("On A Plain"));
        playlist.add(new Musica("Marigold"));
        
        System.out.println("\nLista de músicas: ");
        for(Musica musica : playlist)
        {
            System.out.println(musica.getNomeMusica());
        }
        
        System.out.println("\nDigite o nome de uma música: ");
        String novaMusica = sc.nextLine();
        sc.close();
        
        boolean isNaPlaylist = playlist.contains(new Musica(novaMusica));
        
        if(isNaPlaylist)
        {
            System.out.println("\nA música já está na playlist!");
        }
        else
        {
            playlist.add(new Musica(novaMusica));
            System.out.println("Música adicionada!");
            
            System.out.println("\nLista de músicas atualizada: ");
            for(Musica musica : playlist)
            {
                System.out.println(musica.getNomeMusica());
            }
        }

    }
}
