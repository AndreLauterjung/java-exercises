/* Enunciado do exercício:

- Crie a classe Pet (atributos: String nome).

- Verifique com .contains() se um pet específico (objeto criado na Main) consta na lista de adoção ativa. */

package exercise15;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Pet> listaAdocao = new ArrayList<>();
        
        listaAdocao.add(new Pet("Papagaio"));
        listaAdocao.add(new Pet("Gato"));
        listaAdocao.add(new Pet("Hamster"));
        
        
        boolean isNaLista = listaAdocao.contains(new Pet("Gato"));
        
        if(isNaLista)
        {
            System.out.println("O pet está na lista de adoção!");
        }
        else
        {
            System.out.println("O pet não está na lista de adoção!");
        }
    }
}
