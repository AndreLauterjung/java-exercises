package exercise39;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise39ForContinue
{

    public static void main(String[] args)
    {
        /* Somador de Valores Positivos: Monte um laço que solicite 10 números ao
        usuário. Se o valor digitado for negativo, utilize a instrução continue para saltar a
        etapa de somatória e passar para a próxima leitura. */
        
        Scanner sc = new Scanner(System.in);
        
        int numSoma = 0;
        int num;
        int contador = 10;
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("Digite o %dº número inteiro: \n", i);
            num = sc.nextInt();
            System.out.printf("\n");
            
            if(num < 0)
            {
                continue;
            }
            else
            {
                numSoma += num;
            }
        }
        System.out.println("VALOR TOTAL SOMADO: "+numSoma);
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
