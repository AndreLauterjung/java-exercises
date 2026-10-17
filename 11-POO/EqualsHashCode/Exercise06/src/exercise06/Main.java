/* Enunciado do exercício:

- Crie a classe Pessoa com atributos String nome e int idade.

- Sobrescreva o equals comparando nome e idade e teste assim:

if (a.equals(b)) {
    System.out.println("equals: true");
    System.out.println("hashCodes iguais? " + (a.hashCode() == b.hashCode()));
} 

*/
package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Pessoa a = new Pessoa("André", 20);
        Pessoa b = a;
        
        boolean resultado = a.equals(b);
        
        if(resultado)
        {
            System.out.println("Equals: "+resultado);
            System.out.println("hashCodes iguais? "+ (a.hashCode()== b.hashCode()));
        }
    }
}
