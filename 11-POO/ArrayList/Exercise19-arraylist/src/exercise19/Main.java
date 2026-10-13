/* Enunciado do exercício:

- Crie a classe Tarefa (atributos: String descricao, boolean concluida).

- Use .set() para modificar uma tarefa pendente na posição informada pelo usuário, marcando-a como concluída.*/

package exercise19;

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
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        
        
        listaTarefas.add(new Tarefa("Limpar quarto", true));
        listaTarefas.add(new Tarefa("Limpar quintal", false));
        
        System.out.println("\nLista de tarefas antes da alteração: ");
        for(int i = 0; i < listaTarefas.size(); i++)
        {
            System.out.printf("\nTarefa %d: %s\n", i+1, listaTarefas.get(i).mensagemTarefa());
        }
        
        System.out.println("Tamanho da lista: "+listaTarefas.size());

        System.out.println("\nDeseja alterar o status da tarefa de qual posição?");
        int opcao = sc.nextInt();
        sc.close();
        
        if(opcao <= 0 || opcao > listaTarefas.size())
        {
            System.out.println("\nNúmero inválido!");
        }

        else if(opcao > 0 && opcao <= listaTarefas.size())
        {
            opcao -= 1;
            
            boolean isTarefaConcluida = listaTarefas.get(opcao).getStatusTarefa();
        

            if(isTarefaConcluida)
            {
                System.out.println("\nA tarefa já está concluída!");
            }
            else
            {
                listaTarefas.set(opcao, new Tarefa(listaTarefas.get(opcao).getDescricaoTarefa(), true));

                System.out.println("\nLista de tarefas depois da alteração: ");
                for(int i = 0; i < listaTarefas.size(); i++)
                {
                    System.out.printf("\nTarefa %d: %s\n", i+1, listaTarefas.get(i).mensagemTarefa());
                }

            }
        }
        
    }
}
