package exercise30;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise30For
{

    public static void main(String[] args)
    {
        /* Receba o tamanho N de uma matriz e utilize dois laços for para imprimir 
        uma representação gráfica onde a diagonal principal contém o valor 1 e as 
        demais posições contêm o valor 0. */
        
        Scanner sc = new Scanner(System.in);
        
        int dimensao = -1;
        
        System.out.println("============== GERADOR DE MATRIZ ================");
        System.out.println("Digite um número para a dimensão da matriz: ");
        dimensao = sc.nextInt();
        sc.close();
        System.out.printf("\n");
        
        
        for(int i = 0; i < dimensao ; i++)
        {
            for(int j = 0 ; j < dimensao ; j++)
            {
                if(j == i)
                {
                    System.out.printf("1 ");
                }
                else
                {
                    System.out.printf("0 ");
                }
                    
            }
            System.out.printf("\n");
        }
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
          
    }
    
}
