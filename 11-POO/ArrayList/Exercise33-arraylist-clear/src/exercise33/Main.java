/* Enunciado do exercício:

- Crie a classe Tarefa (atributos: String descricao).

- Ao final do dia, utilize .clear() para apagar todas as tarefas concluídas de uma vez só. */

package exercise33;

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
        ArrayList<Tarefa> tarefasConcluidas = new ArrayList<>();
        
        tarefasConcluidas.add(new Tarefa("Limpar quarto"));
        
        System.out.println("Tarefas concluídas: "+tarefasConcluidas.size());
        
        System.out.println("Limpar lista? (S/n)");
        char resposta = sc.nextLine().charAt(0);
        sc.close();
        
        if(resposta == 'S' || resposta == 's')
        {
            System.out.println("Limpando lista...");
            tarefasConcluidas.clear();
            System.out.println("Lista limpa!");
        }
        else
        {
            System.out.println("A lista não foi limpa!");
        }
    }
}
