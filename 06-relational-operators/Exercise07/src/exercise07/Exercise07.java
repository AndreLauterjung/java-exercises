package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Exercise07
{

    public static void main(String[] args)
    {
        /* Divisão Inteira Estrita: Escreva um trecho de código que calcule a divisão inteira de 15
        por 2 e, na mesma linha, avalie se o resultado obtido é estritamente maior que 7. */ 
        
        int num1 = 15;
        int num2 = 2;
             
        boolean isMaiorQueSete;
        
        isMaiorQueSete = (15/2) > 7;
        int resultado = 15/2;
        
        System.out.println("*****************************");
        System.out.println("15/2 é maior do que sete? ");
        System.out.println("Resposta do programa: "+isMaiorQueSete);
        System.out.println("Resultado: "+resultado);
        System.out.println("******************************");
    }
    
}
