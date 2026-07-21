package exercise06;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise06While
{

    public static void main(String[] args)
    {
        /* Validador de Entrada de Nota: Peça uma nota entre 0.0 e 10.0. Enquanto o
        usuário digitar um valor fora dessa faixa, exiba uma mensagem de erro e peça para
        digitar novamente. */
        
        Scanner sc = new Scanner(System.in);
        
        
        double notaDigitada = -1.0;
        boolean isProgramaOn = true;
        
 
        while(isProgramaOn)
        {

            System.out.println("======== Loop notas ===========");
            System.out.println("Digite uma nota entre 0.0 e 10.0");
            notaDigitada = sc.nextDouble();
        
            if(!(notaDigitada >= 0.0 && notaDigitada<= 10.0))
            {
                System.out.println("ERRO!");
                System.out.println("Digite novamente!");
            }
            else
            {
                isProgramaOn = false;
            }
        }  
        System.out.println("PROGRAMA ENCERRADO!"); 
        
    }
    
}
