/* Enunciado do exercício:

- Crie a classe Funcionario (atributos: String nome, double salario).

- Localize o funcionário na posição 0 e use .set() para alterar o salário dele para um valor atualizado. */

package exercise18;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario("André", 2000.00));
        funcionarios.add(new Funcionario("João", 1000.00));
        funcionarios.add(new Funcionario("Maria", 2500.00));
        
        System.out.println("\nLista de funcionários antes da atualização: ");
        for(Funcionario funcionario: funcionarios)
        {
            System.out.println("Nome: "+funcionario.getNomeFuncionario()+"\nSalário: "+funcionario.getSalarioFuncionario());
        }
        
        
        funcionarios.get(0).setSalarioFuncionario(1999.0);
        
        System.out.println("\nLista de funcionários após atualização: ");
        for(Funcionario funcionario: funcionarios)
        {
            System.out.println("Nome: "+funcionario.getNomeFuncionario()+"\nSalário: "+funcionario.getSalarioFuncionario());
        }
    }
}
