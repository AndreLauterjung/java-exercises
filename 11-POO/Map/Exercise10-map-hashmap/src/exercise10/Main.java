/* Enunciado do exercício:

Mini banco de pacientes

No banco                           | No Map

INSERT                               |  put com uma chave nova
SELECT *                            |  percorrer o entrySet()
SELECT ... WHERE id = x    | get(id)
UPDATE                              | put com uma chave que já existe
DELETE                               | remove(id)


- Crie a classe Paciente com nome (String) e idade (int), construtor e getters. 
- Crie um Map<Integer, Paciente> e faça o INSERT de: 101 Ana, 34; 102 Bruno, 52; 103 Carla, 28. 
- SELECT *: percorra com entrySet() e imprima 101 - Ana (34 anos). 
- SELECT WHERE: busque o id 102 com get. Busque também o id 999. Para o que não existe, imprima Paciente não
encontrado (use containsKey ou confira o null). 
- UPDATE: troque o paciente 102 por um novo Paciente("Bruno", 53), usando put. Imprima o id 102 de novo. 
- DELETE: remova o id 103 com remove, imprima o size() e faça o SELECT * de novo.  */

package exercise10;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        Map<Integer, Paciente> pacientes = new HashMap<>();
        
        pacientes.put(101, new Paciente("Ana", 34));
        pacientes.put(102, new Paciente("Bruno", 52));
        pacientes.put(103, new Paciente("Carla", 28));
        
        System.out.println("\nLista de pacientes: ");
        for(Map.Entry<Integer, Paciente> paciente : pacientes.entrySet() ) {
            
            System.out.println(paciente.getKey()+" - "+paciente.getValue().getNome()+" ("+paciente.getValue().getIdade()+" anos)");
        }
        
        System.out.println(pacientes.get(102).getNome()+" | Idade: "+pacientes.get(102).getIdade());
        
        System.out.println(pacientes.containsKey(999) ? pacientes.get(999).getNome() : "Não encontrado");
        
        pacientes.put(102, new Paciente("Bruno", 53));
        System.out.println(pacientes.get(102).getNome()+" | Idade: "+pacientes.get(102).getIdade());
        
        
        pacientes.remove(103);
        System.out.println("\nQuantidade de pacientes: "+pacientes.size());
        
        System.out.println("\nLista de pacientes: ");
        for(Map.Entry<Integer, Paciente> paciente : pacientes.entrySet() ) {
            
            System.out.println(paciente.getKey()+" - "+paciente.getValue().getNome()+" ("+paciente.getValue().getIdade()+" anos)");
        }
    }
}
