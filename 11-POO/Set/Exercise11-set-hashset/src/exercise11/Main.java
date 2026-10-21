/* Enunciado do exercício:

Medicamentos (String + double)

- Crie a classe Medicamento com nome (String) e dosagemMg (double), construtor e getters. 
- Sobrescreva equals e hashCode comparando o nome e a dosagem. Para o double,
use Double.compare(a, b) == 0 no equals. 
- Adicione: Dipirona 500.0, Dipirona 1000.0, Paracetamol 750.0 e Dipirona 500.0 de novo. 
- Imprima o resultado de cada .add() e o tamanho.

Esperado: só a última é recusada, e o tamanho é 3. A mesma droga com dosagens diferentes conta como
medicamentos diferentes. */

package exercise11;

import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Set<Medicamento> medicamentos = new HashSet<>();
        
        System.out.println("\nMedicamento 1 adicionado? "+medicamentos.add(new Medicamento("Dipirona", 500.0)));
        System.out.println("Quantidade de medicamentos adicionados: "+medicamentos.size());
        
        System.out.println("\nMedicamento 2 adicionado? "+medicamentos.add(new Medicamento("Dipirona", 1000.0)));
        System.out.println("Quantidade de medicamentos adicionados: "+medicamentos.size());
        
        System.out.println("\nMedicamento 3 adicionado? "+medicamentos.add(new Medicamento("Paracetamol", 750.0)));
        System.out.println("Quantidade de medicamentos adicionados: "+medicamentos.size());
        
        System.out.println("\nMedicamento 4 adicionado? "+medicamentos.add(new Medicamento("Dipirona", 500.0)));
        System.out.println("Quantidade de medicamentos adicionados: "+medicamentos.size());
        
    }
}
