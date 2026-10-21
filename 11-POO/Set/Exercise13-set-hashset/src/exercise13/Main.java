/* Enunciado do exercício:

Disciplinas (ignorando maiúsculas)

- Crie a classe Disciplina com codigo (String), nome (String) e cargaHoraria (int), construtor e getters. 
- Sobrescreva equals comparando só o código, ignorando maiúsculas. 
- No hashCode, o código precisa gerar o mesmo valor para MAT101 e mat101. Pense em qual método de String
você usa antes de passar o código para o Objects.hash. 
- Adicione MAT101, mat101 (com outro nome e outra carga) e FIS200. Imprima o tamanho e o resultado de
contains(new Disciplina("Mat101", "x", 0)). 
- Para ver o erro acontecendo, tire o tratamento de maiúsculas só do hashCode, mantendo o equals igual. Rode de
novo e compare o tamanho. 

Esperado: com tudo certo, o tamanho é 2 e o contains dá true. Sem o tratamento no hashCode, o tamanho
provavelmente sai 3.  */

package exercise13;

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
        Set<Disciplina> disciplinas = new HashSet<>();
        
        disciplinas.add(new Disciplina("MAT101", "Matematica", 50));
        disciplinas.add(new Disciplina("mat101", "Matematica Aplicada", 70));
        disciplinas.add(new Disciplina("FIZ200", "Física", 70));
        
        System.out.println(disciplinas.size());
        System.out.println(disciplinas.contains(new Disciplina("Mat101", "x", 0)));
        
    }
}
