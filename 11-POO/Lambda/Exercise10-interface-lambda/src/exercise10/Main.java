/* Enunciado do exercício:

Array de interfaces funcionais.

- Crie uma interface Operacao com um único método: int calcular(int a, int b); 

- No main, crie um array do tipo Operacao
    Posição 0: uma lambda que soma os dois números. 
    Posição 1: uma lambda que subtrai os dois números. 
    Posição 2: uma lambda que multiplica os dois números. 

- Use um for-each para percorrer esse array, chamando calcular(10, 5) em cada 
posição, e imprimindo o resultado de cada uma. */

package exercise10;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        
        Operacao[] operacao = new Operacao[3];
        
        operacao[0] = (a, b) -> a + b;
        operacao[1] = (a, b) -> a - b;
        operacao[2] = (a, b) -> a * b;
        
        
        for(Operacao calculo : operacao)
        {
            System.out.println("Resultado: "+calculo.calcular(20, 5));
        }
        
    }
}
