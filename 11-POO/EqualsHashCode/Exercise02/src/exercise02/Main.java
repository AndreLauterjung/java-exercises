/*
Enunciado do exercício:

- Sobrescreva o método hashCode()

@Override
public int hashCode()
{
    return Objects.hash(nome);
}

- Crie duas pessoas ("Ana", 20) e imprima o hashCode() de cada uma.

*/
package exercise02;

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
