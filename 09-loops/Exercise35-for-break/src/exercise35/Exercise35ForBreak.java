package exercise35;

/**
 *
 * @author andrelauterjung
 */
public class Exercise35ForBreak
{

    public static void main(String[] args)
    {
        /* Teto de Soma Atingido: Percorra uma sequência de números de 1 a 100 com um
        laço. Vá somando os valores e utilize o break para interromper o laço no exato
        momento em que o somatório ultrapassar o valor 100. */
        
        int numSoma = 0;
        
        for(int i = 0; i <= 100; i++)
        {
            if(numSoma > 100)
            {
                System.out.println("VALOR SOMADO: "+numSoma);
                break;
            }
            else
            {
                numSoma += i;
            }
            
        }
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
