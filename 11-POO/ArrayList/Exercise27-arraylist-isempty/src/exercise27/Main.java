/* Enunciado do exercício:

- Crie a classe Tarefa (atributos: String descricao).

- Antes de tentar listar as tarefas, use .isEmpty() para exibir a mensagem: "Sua lista de tarefas está vazia!". */

package exercise27;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        
        
        
        boolean isListaVazia = listaTarefas.isEmpty();
        
        if(isListaVazia)
        {
            System.out.println("Sua lista de tarefas está vazia!");
        }
        else
        {
            System.out.println("\nLista de Tarefas: ");
            for(Tarefa tarefa: listaTarefas)
            {
                System.out.println(tarefa.getDescricao());
            }
        }
    }
}
