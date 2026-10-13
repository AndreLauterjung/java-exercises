/* Enunciado do exercício:

- Crie a classe Filme (atributos: String titulo).

- Use o retorno de .indexOf() para checar se um filme existe: se retornar -1, imprima "Não encontrado", senão
exiba a posição. */

package exercise24;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Filme> filmes = new ArrayList<>();
        
        filmes.add(new Filme("Os Incríveis"));
        filmes.add(new Filme("Homem de Ferro"));
        filmes.add(new Filme("Quarteto Fantástico"));
        filmes.add(new Filme("Alvin e os Esquilos"));
        filmes.add(new Filme("Carros"));
        
        int resultado = filmes.indexOf(new Filme("Carros"));
        
        if(resultado == -1)
        {
            System.out.println("Não encontrado");
        }
        else
        {
            System.out.println("Posição do filme na lista: "+resultado);
        }

    }
}
