/* Enunciado do exercício:

Animais que fazem som.

Crie a interface Falante com String emitirSom();. Crie Cachorro, Gato e Vaca, 
cada uma retornando o seu som ("Au au", "Miau", "Muuu"). 

No main, monte um Falante[] com um de cada e imprima o retorno de emitirSom() 
num for-each.

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
        Falante[] somAnimais = {new Cachorro(), new Gato(), new Vaca()};
        
        for(Falante animal : somAnimais)
        {
            System.out.println(animal.emitirSom());
        }
    }
}
