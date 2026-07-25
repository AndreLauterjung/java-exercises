package exercise38;

/**
 *
 * @author andrelauterjung
 */
public class Exercise38ForContinue
{

    public static void main(String[] args)
    {
        /* Imprimir Apenas Números Ímpares: Percorra com o for os números de 1 a 30.
        Se o número atual for par, utilize o comando continue para ignorar a impressão e ir
        direto para o próximo número. */
    
        System.out.println("===== VERIFICADOR DE ÍMPARES =====\n");
    
        for(int i = 1; i <= 30; i++)
        {
            if(i % 2 ==0)
            {
                continue;
            }
            else
            {
                System.out.printf("O número %d é ímpar.\n", i);
            }
        }
    
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
   
    }
    
}
