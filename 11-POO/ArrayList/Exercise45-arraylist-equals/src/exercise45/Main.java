/* Enunciado do exercício:

Funcionário com cadastro e posição

- Crie a classe Funcionario com cpf e nome (ambos String), construtor e getters. 
- Sobrescreva o equals para comparar só o CPF, com .equals() (aqui maiúsculas não importam, porque CPF são
números). 
- Crie um ArrayList<Funcionario> com 3 funcionários. 
- Peça ao usuário, com Scanner, um nome e um CPF e crie um Funcionario com eles. 
- Use .contains(). Se já existir, use .indexOf() com o mesmo objeto e imprima CPF já cadastrado na posição X. Se
não existir, adicione e imprima Funcionário adicionado!. 
- Percorra e imprima a lista no final. */

package exercise45;

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
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario("André", "00000000000"));
        funcionarios.add(new Funcionario("João", "12345678900"));
        funcionarios.add(new Funcionario("Maria", "98765432100"));
        
        System.out.println("Digite o nome do funcionário: ");
        String nomeDigitado = sc.nextLine();
        
        System.out.println("Digite o CPF do funcionário: ");
        String cpfDigitado = sc.nextLine();
        sc.close();
        
        boolean isRegistrado = funcionarios.contains(new Funcionario(cpfDigitado));
        
        if(isRegistrado)
        {
            System.out.println("CPF já cadastrado na posição: "+funcionarios.indexOf(new Funcionario(cpfDigitado)));
        }
        else
        {
            funcionarios.add(new Funcionario(nomeDigitado, cpfDigitado));
            System.out.println("Funcionário adicionado!");
        }
        
        System.out.println("\nLista de funcionários: ");
        for(Funcionario funcionario : funcionarios)
        {
            System.out.println(funcionario.getNome()+" - "+funcionario.getCPF());
        }
        
    }
}
