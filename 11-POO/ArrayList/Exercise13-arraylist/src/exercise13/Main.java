/* Enunciado do exercício:

- Crie a classe Filme (atributos: String titulo). 

- Antes de adicionar um novo filme digitado pelo usuário, use .contains() para barrar cadastros duplicados. */
package exercise13;

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
        ArrayList<Filme> filmes = new ArrayList<>(); 
        
        boolean isTemNaLista = false;
        
        filmes.add(new Filme("Star Wars"));
        filmes.add(new Filme("Laranja Mecânica"));
        filmes.add(new Filme("Avião Voador"));
        filmes.add(new Filme("Carro de Marte"));
        filmes.add(new Filme("Os Bebedores de Água"));
        
        
        System.out.println("\nLista de filmes: ");
        for(Filme discos : filmes)
        {
            System.out.println(discos.getTituloFilme());
        }
        
        System.out.println("Digite o filme que quer adicionar na lista: ");
        String nomeFilme = sc.nextLine();
        sc.close();
       
        
          
        for(int i = 0; i < filmes.size(); i++)
        {
            if(filmes.get(i).getTituloFilme().contains(nomeFilme))
            {
                isTemNaLista = true;
            }
        }
        
        if(isTemNaLista == false)
        {
            System.out.println("Filme adicinado!");
            filmes.add(new Filme(nomeFilme));
        }
        else
        {
            System.out.println("Já tem um filme com o mesmo nome na lista!");
        }
        
        System.out.println("\nLista de filmes: ");
        for(Filme discos : filmes)
        {
            System.out.println(discos.getTituloFilme());
        }
    }
}
