/* Enunciado do exercício:

- Crie a classe Pessoa com atributos String nome e int idade.

- Sobrescreva o hashCode para Objects.hash(nome, idade).

- Teste ("Ana", 20) e ("Ana", 30). */

package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Pessoa a = new Pessoa("Ana", 20);
        Pessoa b = new Pessoa("Ana", 30);
        
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
