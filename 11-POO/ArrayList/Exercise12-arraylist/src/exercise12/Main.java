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
        
        boolean encontrado = false;
        
        for(int i = 0; i < alunos.size(); i++)
        {
            if(alunos.get(i).getNome().equals("André"))
            {
                encontrado = true;
                break; 
            }
        }
        
        if(encontrado)
        {
            System.out.println("Há um André na lista!");
        } 
        else 
        {
            System.out.println("Não há um André na lista!");
        }
    }
}
