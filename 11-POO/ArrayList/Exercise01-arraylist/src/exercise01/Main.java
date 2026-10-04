/* Enunciado do exercício:

Crie um programa em Java que utilize um ArrayList do tipo String para armazenar três nomes. Em seguida, utilize 
um laço de repetição (for) em conjunto com os métodos .size() e .get() para percorrer a lista e exibir cada um dos
nomes no console.

*/

package exercise01;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        // ArrayList < Tipo > nome = new ArrayList <Tipo> ()
        ArrayList<String> nome = new ArrayList<String>();
        
        nome.add("André");
        nome.add("Ronaldo");
        nome.add("Messi");
       
        for(int i = 0; i < nome.size(); i++)
        {
            System.out.println("Nome: "+nome.get(i));
        }
       
    }
}
