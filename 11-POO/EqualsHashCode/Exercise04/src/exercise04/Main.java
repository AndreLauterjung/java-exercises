/* Enunciado do exercício:

Mudar o campo

- Crie a classe Pessoa com atributos String nome e int idade.

- Crie uma objeto do tipo pessoa, imprima o hashCode, use setNome("Maria") e imprima de novo. */

package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Pessoa a = new Pessoa("Ana", 23);
        
        System.out.println(a.hashCode());
        
        a.setNome("Maria");
        
        System.out.println(a.hashCode());
    }
}
