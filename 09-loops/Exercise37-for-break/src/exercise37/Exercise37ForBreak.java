package exercise37;

/**
 *
 * @author andrelauterjung
 */
public class Exercise37ForBreak
{

    public static void main(String[] args)
    {
        /* Busca em Sequência: Crie um laço for que percorra os números de 1 a 300. Caso
        o loop encontre um número que seja simultaneamente divisível por 13 e por 19,
        exiba-o e interrompa a execução usando break. */
        
        for(int i = 1; i<=300; i++)
        {
            if(i % 13 == 0 && i %19 == 0)
            {
                System.out.printf("O número %d é divisível por 13 e 19 ao mesmo tempo!\n", i);
                break;
                
            }
        }
        
    }
    
}
