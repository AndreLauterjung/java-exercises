/* Enunciado do exercício:

- Crie uma classe Pessoa com atributos: String nome, int indade. 

- Crie um Set<Pessoa> chamado clientes

Adicione:

new Pessoa("Ana", 20)
new Pessoa("Bia", 25)
new Pessoa("Ana", 20) (a mesma cliente se cadastrou duas vezes)

- Imprima o tamanho do Set. O esperado é 2.

Agora faça três testes e anote o size() de cada um:

Com equals e hashCode sobrescritos.
Só com o equals (comente o hashCode).
Sem nenhum dos dois. */

package exercise05;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author andrelauterjung
 */
public class Main 
{
    public static void main(String[] args)
    {
        Set<Pessoa> pessoas = new HashSet<>();
        
        pessoas.add(new Pessoa("Ana", 20));
        pessoas.add(new Pessoa("Bia", 25));
        pessoas.add(new Pessoa("Ana", 20));
        
        System.out.println("Tamanho Set: "+pessoas.size());
    }
}
