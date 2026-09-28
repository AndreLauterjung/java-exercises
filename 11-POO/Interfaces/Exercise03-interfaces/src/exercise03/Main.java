/* Enunciado do exercício:

Operações matemáticas
Crie a interface Operacao com double calcular(double a, double b);. 

Crie as classes Soma, Subtracao, Multiplicacao e Divisao. 

No main, monte um Operacao[] com uma de cada e imprima o resultado de 
calcular(20, 4) para todas.

*/
package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args) {
        
        Operacao[] operacoes = {new Soma(), new Subtracao(), new Multiplicacao(), new Divisao()};
    
        for(Operacao operador : operacoes)
        {
            System.out.println(operador.calcular(20.0, 4.0));
            
        }
    
    }
}
