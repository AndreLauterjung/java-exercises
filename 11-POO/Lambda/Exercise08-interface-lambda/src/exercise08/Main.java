/* Enunciado do exercício:

Conversor de Celsius para Fahrenheit.

- Crie uma interface Conversor com um único método: 
double converter(double celsius).

- No main, crie uma variável do tipo Conversor, usando lambda, que converte 
Celsius para Fahrenheit. A fórmula é: fahrenheit = celsius * 9/5 + 32. 

- Teste com 2 temperaturas diferentes (ex: 0.0 e 100.0), imprimindo o resultado. */
package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Conversor converterTemp = (celsius) -> 
                celsius * (9.0/5.0) + 32;
        
        
        double fahrenheit1 = converterTemp.converter(30);
        double fahrenheit2 = converterTemp.converter(50);
        
        System.out.println("Conversão 1: "+fahrenheit1+"ºF");
        System.out.println("Conversão 2: "+fahrenheit2+"ºF");
    }
}
