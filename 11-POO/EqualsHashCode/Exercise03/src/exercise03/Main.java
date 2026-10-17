/* Enunciado do exercício:

Nomes diferentes.

- Crie ("Ana", 20) e ("Bia", 20) e imprima os hashCodes.
- Observe: são diferentes, porque o número depende do nome. */

package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Pessoa a = new Pessoa("Ana", 20);
        Pessoa b = new Pessoa("Bia", 20);
        
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
