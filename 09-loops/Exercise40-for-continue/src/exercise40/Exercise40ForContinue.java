package exercise40;

/**
 *
 * @author andrelauterjung
 */
public class Exercise40ForContinue
{

    public static void main(String[] args)
    {
        /* Filtro de Múltiplos: Escreva um programa que liste todos os números de 1 a 50,
        mas utilize a instrução continue para não imprimir nenhum número que seja
        múltiplo de 5. */
        
        for(int i = 1; i <= 50; i++)
        {
            if(i % 5 == 0)
            {
                continue;
            }
            else
            {
                System.out.println("Número: "+i);
            }

        }
            
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
