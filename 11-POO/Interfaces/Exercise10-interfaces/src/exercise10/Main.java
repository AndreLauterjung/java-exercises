/* Enunciado do exercício:

Interface que estende outra interface.

Uma interface pode herdar de outra com extends. Crie Ligavel (ligar() e 
desligar()) e depois Recarregavel extends Ligavel, adicionando void 
recarregar();. 

Crie Celular e Notebook, que implementam Recarregavel. 

Repare que cada uma precisa implementar os 3 métodos, já que Recarregavel traz
os de Ligavel junto. No main, use um Ligavel[] com os dois e chame ligar().


*/

package exercise10;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Ligavel[] dispositivo = {new Celular(), new Notebook()};
        
        for(Ligavel aparelho : dispositivo)
        {
            aparelho.ligar();
        }
    }
}
