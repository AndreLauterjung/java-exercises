/* Enunciado do exercício:

Aluno (comparando um int)

- Crie a classe Aluno com matricula (int) e nome (String), construtor e getters. 
- Sobrescreva o equals para comparar só a matrícula. 
- Crie um ArrayList<Aluno> com 3 alunos de matrículas diferentes. 

- Teste contains com:
    (a) um aluno com a matrícula de um que já está na lista, mas com nome diferente;
    (b) um aluno com matrícula que não está na lista.  */

package exercise42;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos.add(new Aluno(1234, "André"));
        alunos.add(new Aluno(1235, "Diogo"));
        alunos.add(new Aluno(2019, "Bárbara"));
        
        boolean isMatriculaCadastrada =  alunos.contains(new Aluno(1999, "André"));
        
        if(isMatriculaCadastrada)
        {
            System.out.println("\nErro!");
            System.out.println("Essa matrícula já existe na lista!");
        }
        else
        {
            System.out.println("\nNão há essa matrícula na lista!");
        }
        
        System.out.println("\nLista de alunos no sistema: ");
        for(Aluno aluno : alunos)
        {
            System.out.println(aluno.getMatricula()+" - "+aluno.getNome());
        }
        
    }
}
