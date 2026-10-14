/* Enunciado do exercício:

- Crie a classe Aluno (atributos: String nome).

- Simule o encerramento do semestre resetando a lista de presença da turma inteira com .clear(). */

package exercise34;

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
        ArrayList<Aluno> listaPresenca = new ArrayList<>();
        
        listaPresenca.add(new Aluno("André"));
        listaPresenca.add(new Aluno("Maria"));
        listaPresenca.add(new Aluno("José"));
        listaPresenca.add(new Aluno("Carlos"));
        listaPresenca.add(new Aluno("Ildo"));
       
        System.out.println("\nLista de presença: ");
        for(int i = 0; i < listaPresenca.size(); i++)
        {
            System.out.printf("%d - %s\n", i+1, listaPresenca.get(i).getNome());
        }
        
        System.out.println("\nLimpar a lista? (S/n)");
        char resposta = sc.nextLine().charAt(0);
        sc.close();
        
        if(resposta == 'S' || resposta == 's')
        {
            System.out.println("Limpando lista...");
            listaPresenca.clear();
            System.out.println("Lista limpa!");
        }
        else
        {
            System.out.println("A lista não foi limpa!");
        }
            
    }
}
