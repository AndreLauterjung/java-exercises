/* Enunciado do exercício:

- Crie a classe Filme (atributos: String titulo).

- Junte uma lista de clássicos e uma lista de lançamentos em um único catálogo geral utilizando .addAll(). */

package exercise41;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Filme> filmesClassicos = new ArrayList<>();
        ArrayList<Filme> filmesNovos = new ArrayList<>();
        ArrayList<Filme> catalogoGeral = new ArrayList<>();
        
        filmesClassicos.add(new Filme("Exterminador do Futuro"));
        filmesClassicos.add(new Filme("Rocky"));
        
        filmesNovos.add(new Filme("Vingadores"));
        filmesNovos.add(new Filme("Homem-Aranha"));
        
        catalogoGeral.addAll(filmesClassicos);
        catalogoGeral.addAll(filmesNovos);
        
        System.out.println("\nFilmes clássicos: ");
        for(Filme filme: filmesClassicos)
        {
            System.out.println(filme.getTitulo());
        }
        
        System.out.println("\nFilmes novos: ");
        for(Filme filme: filmesNovos)
        {
            System.out.println(filme.getTitulo());
        }
        
        System.out.println("\nTodos os filmes: ");
        for(Filme filme: catalogoGeral)
        {
            System.out.println(filme.getTitulo());
        }
    }
}
