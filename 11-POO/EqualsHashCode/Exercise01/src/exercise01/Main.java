/* Enunciado do exercício:

hashCode padrão.

- Crie duas pessoas ("Ana", 20) e imprima o hashCode() de cada uma.
- Observe: os números são diferentes, mesmo com os mesmos dados. */

package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Pessoa a = new Pessoa("Ana", 20);
        Pessoa b = new Pessoa("Ana", 20);
        
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        
    }
}
