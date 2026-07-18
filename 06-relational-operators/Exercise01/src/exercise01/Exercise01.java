package exercise01;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise01
{

    public static void main(String[] args)
    {
        
        /*  Batimento de Meta: Receba o valor total de vendas de um funcionário no mês. Valide
        se ele vendeu estritamente mais do que a meta estipulada de 5000.00, guardando o resultado
        em um boolean.*/
        
        Scanner sc = new Scanner(System.in);
        
        double totalVendas;
        double metaVendas = 5000.00;
        
        boolean vendeuAcima;
        
        System.out.println("************************************************");
        System.out.println("Digite o total recebido de vendas no mês: ");
        totalVendas = sc.nextDouble();
        
        sc.close();
        System.out.println("************************************************");
        
        vendeuAcima = totalVendas > metaVendas;
        
        System.out.println("************************************************");
        System.out.println("O funcionário ultrapassou a meta de vendas? ");
        System.out.println("Resposta do programa: "+vendeuAcima);
        System.out.println("************************************************");
        
        
    }
    
}
