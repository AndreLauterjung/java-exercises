/* Enunciado do eercício: 

- Crie a classe Aluno (atributos: String nome).

- Adicione alguns alunos e use .contains() para verificar se um aluno com um nome específico já faz parte da lista
antes de exibir uma mensagem. */

package exercise12;

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
        alunos.add(new Aluno("Luísa"));
        alunos.add(new Aluno("Carlos"));
        
        boolean resultado = alunos.contains(new Aluno("André"));
        
        if(resultado)
        {
            System.out.println("Já existe um aluno na lista!");
        }
        else
        {
            alunos.add(new Aluno("André"));
            System.out.println("Nome adicionado!");
        }
        
    }
}
