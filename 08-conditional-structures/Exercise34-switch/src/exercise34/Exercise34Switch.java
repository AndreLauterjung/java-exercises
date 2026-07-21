package exercise34;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise34Switch
{

    public static void main(String[] args)
    {
        /* Calculadora de Desconto de Loja: Receba o valor total de uma compra e uma
        categoria de cliente em caractere ('A', 'B', 'C' ou 'D'). Cada letra aplica um
        percentual fixo de desconto no total da compra. Mostre o valor final recalculado. */
        
        Scanner sc = new Scanner(System.in);
        
        double totalCompra = -1.0;
        double novoValorCompra = -1.0;
        char categoria;
        
        System.out.println("============ CÁLCULO DE DESCONTO ==============");
        System.out.println("Digite o valor total da sua compra: ");
        totalCompra = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Digite a sua categoria (A, B, C ou D): ");
        categoria = sc.nextLine().toUpperCase().charAt(0);
        sc.close();
        
        
        switch(categoria)
        {
            case 'A':
                System.out.println("Você recebeu um desconto de 20% no valor da sua compra!");
                novoValorCompra = totalCompra- ((20.0/100.0)* totalCompra);
                System.out.println("Novo valor da compra: R$ "+novoValorCompra);
                break;
            
            case 'B':
                System.out.println("Você recebeu um desconto de 15% no valor da sua compra!");
                novoValorCompra = totalCompra- ((15.0/100.0)* totalCompra);
                System.out.println("Novo valor da compra: R$ "+novoValorCompra);
                break;
                
            case 'C':
                System.out.println("Você recebeu um desconto de 10% no valor da sua compra!");
                novoValorCompra = totalCompra- ((10.0/100.0)* totalCompra);
                System.out.println("Novo valor da compra: R$ "+novoValorCompra);
                break;
                
            case 'D':
                System.out.println("Você recebeu um desconto de 5% no valor da sua compra!");
                novoValorCompra = totalCompra- ((5.0/100.0)* totalCompra);
                System.out.println("Novo valor da compra: R$ "+novoValorCompra);
                break;
            
            default:
                System.out.println("Você não recebeu desconto na compra!");
                System.out.println("Valor da compra: R$ "+totalCompra);
                
        }
        
        
    }
    
}
