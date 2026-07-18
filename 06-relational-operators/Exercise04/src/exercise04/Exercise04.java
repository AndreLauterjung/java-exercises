package exercise04;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise04
{

    public static void main(String[] args)
    {
        /* Filtro de Preço Baixo: Um e-commerce quer aplicar uma tag automática em produtos
        promocionais. Receba o preço de um item e verifique se ele é menor ou igual a 30.00. */
        
        Scanner sc = new Scanner(System.in);
        
        double valorVerif = 30.00;
        double precoItem;
        
        boolean isMenorIgual;
        
        System.out.println("******************************");
        System.out.println("Digite o valor do item: "); 
        precoItem = sc.nextDouble(); 
        
        sc.close();
        System.out.println("******************************");
        
        isMenorIgual = precoItem <= valorVerif;
        
        System.out.println("***************************************************");
        System.out.println("O preço do item é menor ou igual a R$ 30,00? ");
        System.out.println("Resposta do programa: "+isMenorIgual);
        System.out.println("***************************************************");
        
    }
    
}
