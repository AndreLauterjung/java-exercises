/* Enunciado do exercício:

- Crie a classe Musica (atributos: String titulo).

- Limpe a seleção atual de músicas com .clear() para permitir a criação de uma nova playlist do zero. */

package exercise35;

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
        
        playlist.add(new Musica("Hino do Brasil"));
        
        System.out.println("Lista de músicas: ");
        for(int i = 0; i < playlist.size(); i++)
        {
            System.out.println(playlist.get(i).getTitulo());
        }
        
        System.out.println("Começar uma nova playlist? (S/n)");
        char resposta = sc.nextLine().charAt(0);
        sc.close();
        
        if(resposta == 'S' || resposta == 's')
        {
            System.out.println("Limpando playlist...");
            playlist.clear();
            System.out.println("Playlist limpa!"+playlist.size());
        }
        else
        {
            System.out.println("A playlist não foi limpa!");
        }
    }
}
