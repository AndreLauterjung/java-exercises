package exercise29;

/**
 *
 * @author andrelauterjung
 */
public class Exercise29For
{

    public static void main(String[] args)
    {
        /* Monte um programa que utilize laços aninhados para imprimir a tabuada 
        completa do número 1 ao 10 de forma organizada. */
        
        
        for(int i = 1; i <= 10; i++ )
        {
            System.out.println("------------------");
            System.out.println("Tabuada do "+i+":");
 
            for(int j = 0; j <= 10 ; j++)
            {
                System.out.printf("%d * %d = %d\n", i, j, i*j);  
            }
            System.out.println("------------------");
        }
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");

    }
    
}
