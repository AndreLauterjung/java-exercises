package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Exercise05
{

    public static void main(String[] args)
    {
        /* Teste de Promoção Numérica: Desenvolva uma expressão que compare um número
        inteiro com um valor decimal idêntico (ex: 10 e 10.0) para provar na tela se o compilador
        realiza a promoção de tipos e os considera iguais. */
        
        int num = 2019;
        double numD = 2019.0;
        
        boolean isIgual;
        isIgual = num == numD;
        
        System.out.println("******************************");
        System.out.println("Os números são iguais? ");
        System.out.println("Resposta do programa: "+isIgual);
        System.out.println("******************************");
    }
    
}
