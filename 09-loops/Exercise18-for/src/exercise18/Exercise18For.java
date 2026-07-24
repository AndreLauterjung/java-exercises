package exercise18;

/**
 *
 * @author andrelauterjung
 */
public class Exercise18For
{

    public static void main(String[] args)
    {
        /* Filtro de Números Pares: Escreva um programa que utilize um laço for para
        imprimir todos os números pares existentes entre 1 e 50. */
        
        int contador = 0;
        
        
        System.out.println("=========================================");
        System.out.println("NÚMEROS PARES ENTRE 1 E 50:");
        
        
        for(int i = 1; i <= 50; i++)
        {
            if(i % 2 ==0)
            {
                System.out.println("Número "+i);
                contador++;
            }
            
        }
        
        System.out.println("\nTotal de números pares entre 1 e 50: "+contador);
        System.out.println("=========================================");
        
        
    }
    
}
