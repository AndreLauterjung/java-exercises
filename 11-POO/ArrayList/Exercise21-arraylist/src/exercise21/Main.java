/* Enunciado do exercício:

- Crie a classe Aluno (atributos: String nome).

- Corrija o nome de um aluno que foi cadastrado com erro de digitação na posição 3 usando .set(). */

package exercise21;

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
        
        alunos.add(new Aluno("André"));
        alunos.add(new Aluno("Ana"));
        alunos.add(new Aluno("Maria"));
        alunos.add(new Aluno("Juãon"));
        
        System.out.println("\nLista de alunos antes da alteração: ");
        for(Aluno aluno : alunos)
        {
            System.out.println(aluno.getNomeAluno());
        }
        
        alunos.set(3, new Aluno("João"));
        
        System.out.println("\nLista de alunos depois da alteração: ");
        for(Aluno aluno : alunos)
        {
            System.out.println(aluno.getNomeAluno());
        }
    }
}
