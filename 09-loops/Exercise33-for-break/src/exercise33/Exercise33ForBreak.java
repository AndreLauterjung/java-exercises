package exercise33;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise33ForBreak
{

    public static void main(String[] args)
    {
        /* Parada por Digitação de Zero: Crie um laço que solicite números indefinidamente
        ao usuário e os acumule numa soma. Se o número digitado for 0, utilize a instrução
        break para encerrar o laço imediatamente e exibir o total. */
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        int valSom = 0;
        
        for(int i = 1; i > 0; i++)
        {
            System.out.println("===== SOMADOR DE VALORES =====");
            System.out.println("Digite um número inteiro: ");
            num = sc.nextInt();
            
            if(num == 0)
            {
                System.out.println("TOTAL SOMADO: "+valSom);
                break;
            }
            else
            {
                valSom += num;
            }
        }
            
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
