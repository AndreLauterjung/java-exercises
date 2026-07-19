package exercise13;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise13IfElse 
{

    public static void main(String[] args) 
    {
        /* Faixas de Desconto Progressivo: Receba o valor total de uma compra no e-commerce.
        Se o valor for maior que 500.00, aplique 20% de desconto; se estiver entre 200.00 e 500.00,
        aplique 10%; abaixo disso, exiba que não há direito a desconto. Mostre o valor final. */
        
        Scanner sc = new Scanner(System.in);
        
        double valorCompra = -1.0;
        double descontoVinte = 20.0;
        double descontoDez = 10.0;
        
        
        
        System.out.println("- - - - Verificando o valor da compra - - - -");
        System.out.println("Digite o valor total da compra: ");
        valorCompra = sc.nextDouble();
        
        sc.close();
        
        if(valorCompra > 500.0)
        {
            valorCompra = valorCompra - ((descontoVinte/100)*valorCompra);
            
            System.out.println("==========================================================");
            System.out.println("Você recebeu um desconto de 20% no valor da sua compra! ");
            System.out.println("Valor a pagar: R$ "+valorCompra);
            System.out.println("==========================================================");
        }
        else if(valorCompra >= 200.0 && valorCompra <= 500.0)
        {
            valorCompra = valorCompra - ((descontoDez/100)*valorCompra);
            
            System.out.println("==========================================================");
            System.out.println("Você recebeu um desconto de 10% no valor da sua compra! ");
            System.out.println("Valor a pagar: R$ "+valorCompra);
            System.out.println("==========================================================");
        }
        else
        {
            System.out.println("==========================================================");
            System.out.println("Você não recebeu desconto no valor da sua compra! ");
            System.out.println("Valor a pagar: R$ "+valorCompra);
            System.out.println("==========================================================");
        }
           
        
    }
    
}
