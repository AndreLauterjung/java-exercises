/* Enunciado do exercício:

Calculadora de desconto.

- Crie uma interface CalculadoraDesconto com um único método: 
double aplicarDesconto(double valor); 

- No main, crie uma variável do tipo CalculadoraDesconto, usando lambda, que 
recebe um valor e devolve esse valor com 10% de desconto (ou seja, multiplicado 
por 0.9). 

- Teste com 2 valores diferentes (ex: 100.0 e 250.0), imprimindo o resultado de
cada um. */
package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        CalculadoraDesconto calcular = (valor) -> 
                valor * (90.0/100.0);
        
        
        double resultado1 = calcular.aplicarDesconto(290);
        double resultado2 = calcular.aplicarDesconto(100);
        
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
