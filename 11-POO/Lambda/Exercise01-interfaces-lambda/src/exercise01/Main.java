package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Multiplicador calcMultiplicacao = (a, b) -> a * b;
        Subtrador calcSubtracao = (a, b) -> a - b;
        Somador calcSoma = (a, b) -> a + b;
        Divisor calcDivisor = (a, b) -> a / b;
        
        int resultadoMult = calcMultiplicacao.multiplicar(5, 5);
        int resultadoSub = calcSubtracao.subtracao(10, 5);
        int resultadoSoma = calcSoma.soma(10, 10);
        int resultadoDiv = calcDivisor.divisao(9, 9);
        
        
        System.out.println(resultadoMult);
        System.out.println(resultadoSub);
        System.out.println(resultadoSoma);
        System.out.println(resultadoDiv);
    }
}
