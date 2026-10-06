/* Enunciado do exercícío:

Lista de tarefas com remoção.

Crie um programa que utilize um ArrayList do tipo String para armazenar 4 tarefas (ex: "Estudar Java", 
"Fazer exercícios", "Revisar commits", "Descansar"). Primeiro, percorra e imprima todas as tarefas com for + .size() 
+ .get(). Depois, remova a tarefa da posição 1 usando .remove(1). 

Por fim, percorra a lista de novo, pra confirmar que ela tem 3 tarefas agora, e que a tarefa certa foi removida.

*/

package exercise04;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> tarefas = new ArrayList<>();
        
        
        tarefas.add("Estudar Java");
        tarefas.add("Estudar SQL");
        tarefas.add("Anotar estudos");
        tarefas.add("Realizar exercícios");
        
        System.out.println("Primeiro loop");
        for(int i = 0; i < tarefas.size(); i++)
        {
            System.out.println(tarefas.get(i));
        }
        
        System.out.printf("\n");
        
        tarefas.remove(1);
        
        System.out.println("Segundo loop: ");
        for(int i = 0; i < tarefas.size(); i++)
        {
            System.out.println(tarefas.get(i));
        }
    }
}
