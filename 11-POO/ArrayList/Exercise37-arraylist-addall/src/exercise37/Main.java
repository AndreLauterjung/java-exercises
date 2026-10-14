/* Enunciado do exercício:

- Crie a classe Musica (atributos: String titulo).

Crie duas listas separadas (nacionais e internacionais) e junte ambas em uma terceira lista chamada playlistGeral
usando .addAll(). */

package exercise37;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Musica> musicasNacionais = new ArrayList<>();
        ArrayList<Musica> musicasInternacionais = new ArrayList<>();
        ArrayList<Musica> playlistGeral = new ArrayList<>();
        
        musicasNacionais.add(new Musica("Águas de Março"));
        musicasNacionais.add(new Musica("Garota de Ipanema"));
        
        musicasInternacionais.add(new Musica("Just Dance"));
        musicasInternacionais.add(new Musica("Mirrors"));
        
        System.out.println("\nMúsicas nacionais: ");
        for(int i = 0; i < musicasNacionais.size(); i++)
        {
            System.out.println(musicasNacionais.get(i).getTitulo());
        }
        
        System.out.println("\nMúsicas internacionais: ");
        for(int i = 0; i<musicasInternacionais.size(); i++)
        {
            System.out.println(musicasInternacionais.get(i).getTitulo());
        }
        
        System.out.println("\nTodas as músicas");
        playlistGeral.addAll(musicasInternacionais);
        playlistGeral.addAll(musicasNacionais);
        
        for(int i = 0; i<playlistGeral.size(); i++)
        {
            System.out.println(playlistGeral.get(i).getTitulo());
        }
    }
}
