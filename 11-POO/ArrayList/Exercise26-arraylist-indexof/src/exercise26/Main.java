/* Enunciado do exercício:

- Crie a classe Aluno (atributos: String nome).

- Descubra o índice de um aluno com .indexOf() e use esse valor junto com .get() para mostrar os dados dele. */

package exercise26;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        
        listaAlunos.add(new Aluno("André"));
        listaAlunos.add(new Aluno("João"));
        listaAlunos.add(new Aluno("Maria"));
        
        int resultado = listaAlunos.indexOf(new Aluno("João"));
        
        if(resultado <= -1)
        {
            System.out.println("O aluno não está na lista!");
        }
        else
        {
            System.out.println("O aluno está na lista!");
            System.out.println("Nome aluno: "+listaAlunos.get(resultado).getNome());
        }
        
    }
}
