package exercise31;

/**
 *
 * @author andrelauterjung
 */
public class Exercise31For
{

    public static void main(String[] args)
    {
        /* Crie um programa que utilize dois laços for para simular a passagem do 
        tempo de um cronômetro, exibindo no console os minutos (de 0 a 2) e os 
        segundos (de 0 a 59) no formato MM:SS. */
        
        
        System.out.println("============= MINI RELÓGIO ===============\n");
        
        for(int i = 0; i <= 2 ; i++)
        {
            for(int j = 0; j <= 59 ; j++)
            {
                System.out.printf("TEMPO: %02d : %02d\n", i, j);
            }
        }
        
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
