package exercise36;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise36ForBreak
{

    public static void main(String[] args)
    {
        /* Otimização da Busca do Primo: Reescreva o algoritmo de verificação de número
        primo. Ao testar os divisores com um laço, utilize a instrução break assim que
        encontrar qualquer divisor exato antes do fim da contagem. */
        
        Scanner sc = new Scanner(System.in);
        
        
        boolean isPrimo = true;
        int num = 0;
        
        
        System.out.println("==== VERIFICADOR NÚMERO PRIMO ===== ");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        System.out.printf("\n");
        
        
        for(int i = 2 ; i < num ; i++)
        {
             
            if(num % i == 0)
            {
                isPrimo = false;
                break;
            }
            
        }    
        
        if(num == 2)
        {
            isPrimo = true;
        }
        
        System.out.printf("O número %d é primo? \n", num);
        System.out.println("Resposta do programa: "+isPrimo);
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");

    }
    
}
