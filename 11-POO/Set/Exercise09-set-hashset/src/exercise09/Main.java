/* Enunciado do exercício:

Set com objetos e o hashCode

- Crie uma classe Aluno com atributo: String nome.
- Crie um HashSet<Aluno> e adicione new Aluno("Ana") duas vezes. Imprima o .size() e anote o resultado.
- Agora acrescente o hashCode na classe.  */

package exercise09;

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
        Set<Aluno> alunos = new HashSet<>();
        
        alunos.add(new Aluno("Ana"));
        alunos.add(new Aluno("Bárbara"));
        alunos.add(new Aluno("Ana"));
        alunos.add(new Aluno("João"));
        alunos.add(new Aluno("Bruno"));
        
        System.out.println(alunos.size());
        
    }
}
