/* Enunciado do exercício:

Funcionários por id (objetos no mapa)

- Crie a classe Funcionario com nome (String), cargo (String) e salario (double), construtor e getters. 
- Crie um Map<Integer, Funcionario> e guarde: 1 Ana, Dev, 6000.0; 2 Bruno, Analista, 4500.0; 3 Carla, Gerente, 9000.0. 
- Percorra com entrySet() e imprima ID 1: Ana - Dev - R$ 6000.0. A chave vem de getKey(), e os dados vêm de
getValue().getNome() e dos outros getters. 
- Imprima o salário do funcionário de id 2 usando get. 
- Descubra o funcionário com o maior salário percorrendo o entrySet(), e imprima o id e o nome. 

Esperado: o salário 4500.0, e a maior é a Carla, com id 3. */

package exercise07;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<Integer, Funcionario> funcionarios = new HashMap<>();
        
        funcionarios.put(1, new Funcionario("Ana", "Dev", 6000.0));
        funcionarios.put(2, new Funcionario("Bruno", "Analista", 4500.0));
        funcionarios.put(3, new Funcionario("Carla", "Gerente", 9000.0));
        
        System.out.println("\nLista de funcionários: \n");
        for(Map.Entry<Integer, Funcionario> funcionario: funcionarios.entrySet()) {
            
            System.out.println("ID:"+funcionario.getKey()+" "+funcionario.getValue().getNome()+
                    "- "+funcionario.getValue().getCargo()+"- R$ "+funcionario.getValue().getSalario());
        }
        
        System.out.println("\nSalário do funcionário de id 2: "+funcionarios.get(2).getSalario());
        
        double maiorSalario = 0.0;
        int idMaiorSalario = -1;
        
        
        for(Map.Entry<Integer, Funcionario> funcionario: funcionarios.entrySet()) {
            
            if(funcionario.getValue().getSalario() > maiorSalario) {
                maiorSalario = funcionario.getValue().getSalario();
                idMaiorSalario = funcionario.getKey();
            }
        }
        System.out.println("\nFuncionário com maior salário: "+idMaiorSalario);
        
    }
}
