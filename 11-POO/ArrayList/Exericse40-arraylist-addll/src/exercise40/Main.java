/* Enunciado do exercício:

- Crie a classe Tarefa (atributos: String descricao).

- Crie uma lista padrão de tarefas semanais e insira-a dentro da lista de afazeres diários utilizando .addAll(). */

package exercise40;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Tarefa> tarefasSemanais = new ArrayList<>();
        ArrayList<Tarefa> tarefasDiarias = new ArrayList<>();
        
        tarefasSemanais.add(new Tarefa("Limpar quintal"));
        tarefasSemanais.add(new Tarefa("Limpar carro"));
        
        tarefasDiarias.addAll(tarefasSemanais);
        
        System.out.println("Lista de tarefas diária: ");
        for(Tarefa tarefa: tarefasSemanais)
        {
            System.out.println(tarefa.getDescricao());
        }
    }
}
