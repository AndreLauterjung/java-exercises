package exercise03;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise03
{

    public static void main(String[] args)
    {
        /* Divergência de Estoque: O sistema de inventáOrio precisa disparar um sinal se houver
        inconsistências. Receba a quantidade de itens contados fisicamente e a quantidade registrada
        no sistema, avaliando se os dois valores são diferentes. */
        
        Scanner sc = new Scanner(System.in);
        
        int quantidadeRegistrada = 10000;
        int quantidadeContFis;
        
        System.out.println("***************************************************");
        System.out.println("Digite a quantidade de itens contados fisicamente: ");
        quantidadeContFis = sc.nextInt();
        
        sc.close();
        System.out.println("***************************************************");
        
        boolean isQuantidadeCorreta = quantidadeContFis == quantidadeRegistrada;
        
        System.out.println("***************************************************************************");
        System.out.println("A quantidade de itens contados fisicamente é a mesma de itens registrados? ");
        System.out.println("Resposta do programa: "+isQuantidadeCorreta);
        System.out.println("****************************************************************************");
    }
    
}
