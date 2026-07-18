package exercise55;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise55
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int numLoteProduto;
        int lote;
        boolean isRestoPar;
        boolean isRestoImpar;
        
        /* Lotes Industriais: Uma fábrica precisa categorizar seus lotes de produtos de forma
        binária. Receba um número de lote inteiro e, avaliando apenas o resto da divisão por 2, exiba
        0 para indicar lotes pares ou 1 para lotes ímpares. */
        System.out.println("*************************************");
        System.out.println("Digite o número do lote do produto: ");
        numLoteProduto = sc.nextInt();
        sc.close();
        System.out.println("*************************************");
        
        lote = numLoteProduto % 2;
        
        isRestoPar = lote == 0;
        isRestoImpar = lote == 1;
        
        System.out.println("*************************************");
        System.out.println("LOTE 0 = Par.");
        System.out.println("LOTE 1 = Ímpar");
        System.out.println("*************************************");
        System.out.println("O lote é par: "+isRestoPar+" | LOTE: "+lote);
        System.out.println("O lote é ímpar: "+isRestoImpar+" | LOTE: "+lote);
        System.out.println("*************************************");
        
    }
    
}
