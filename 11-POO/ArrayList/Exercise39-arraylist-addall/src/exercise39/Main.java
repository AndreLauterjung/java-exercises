/* Enunciado do exercício:

- Crie a classe Aluno (atributos: String nome).

- Una a lista da turma da manhã com a lista da turma da tarde em uma única lista geral usando .addAll(). */

package exercise39;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Aluno> turmaManha = new ArrayList<>();
        ArrayList<Aluno> turmaTarde = new ArrayList<>();
        ArrayList<Aluno> alunosGeral = new ArrayList<>();
        
        turmaManha.add(new Aluno("João"));
        turmaTarde.add(new Aluno("Maria"));
       
        alunosGeral.addAll(turmaManha);
        alunosGeral.addAll(turmaTarde);
        
        System.out.println("\nLista de todos os alunos da manhã: ");
        for(Aluno aluno: turmaManha)
        {
            System.out.println(aluno.getNome());
        }
        
        System.out.println("\nLista de todos os alunos da tarde: ");
        for(Aluno aluno: turmaTarde)
        {
            System.out.println(aluno.getNome());
        }
        
        System.out.println("\nLista de todos os alunos: ");
        for(Aluno aluno: alunosGeral)
        {
            System.out.println(aluno.getNome());
        }
    }
}
