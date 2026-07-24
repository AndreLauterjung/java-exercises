package exercise21;

/**
 *
 * @author andrelauterjung
 */
public class Exercise21For
{

    public static void main(String[] args)
    {
        /* Contador com Passo Customizado: Crie um laço for que faça uma contagem
        regressiva de 100 até 0, diminuindo de 5 em 5 a cada passo. */
        
        
        int contador = 100;
        
        System.out.println("=========== CONTAGEM REGRESSIVA =============\n");
        
        for(int i = contador ; i >= 0 ; i--) 
        {
            if(i % 5 == 0)
            {
                System.out.println("SEGUNDS RESTANTES: "+i);
            }
        }
        
        
        System.out.println("\n==============================================");
        System.out.println("============= PROGRAMA ENCERRADO =============");
        System.out.println("==============================================");

    }
    
}
