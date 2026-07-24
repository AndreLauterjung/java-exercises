package exercise26;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise26For
{

    public static void main(String[] args)
    {
        /* Identificador de Extremos: Peça ao usuário para indicar quantos números ele
        quer digitar. Em seguida, leia essa quantidade de números usando for e determine
        qual foi o maior e o menor valor informado. */
        
        Scanner sc = new Scanner(System.in);
        
        double num;
        double numMaior=0;
        double numMenor=0;
        
        int limite = 4;
        
        
        for(int i = 1; i <= limite; i++)
        {
            System.out.printf("Digite o %dº número: \n", i);
            num = sc.nextInt();
            
            if(i==1)
            {
                numMaior = num;
                numMenor = num;
            }
            else
            {
                if(num > numMaior)
                {
                    numMaior = num;
                }
                if(num < numMenor)
                {
                    numMenor = num;
                }
                    
            }      
        }
        
        
        System.out.println("Número maior: "+numMaior);
        System.out.println("Número menor: "+numMenor);
            
    }
    
}
