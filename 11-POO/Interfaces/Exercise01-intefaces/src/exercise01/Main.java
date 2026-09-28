/* Enunciado do exercício:

Exercício de Interface: Aparelhos que ligam e desligam.

Crie uma interface Ligavel com duas assinaturas de método:

-void ligar();

-void desligar();

Crie duas classes que implementam Ligavel:

- Lampada: ligar() imprime "Lâmpada acesa" e desligar() imprime "Lâmpada apagada".

- Televisao: ligar() imprime "TV ligada" e desligar() imprime "TV desligada".

No main, crie um array do tipo Ligavel com um objeto de cada classe. Depois, 
com um for-each, chame ligar() e desligar() de cada um.
*/

package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Ligavel[] ligavel = {new Lampada(), new Televisao()};
        
        for(Ligavel objeto: ligavel)
        {
            objeto.ligar();
            objeto.desligar();
        }
    }
}
