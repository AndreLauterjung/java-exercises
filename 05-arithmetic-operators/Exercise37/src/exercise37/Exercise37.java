package exercise37;

/**
 *
 * @author andrelauterjung
 */
public class Exercise37
{

    public static void main(String[] args)
    {
        // Calcule o valor total de um produto de R$ 1000,00 após um acréscimo de 10% e posterior desconto de R$ 50,00.
        double valorTotalProduto = 1000.00, acrescimo = 10.0, desconto = 50.0, valorFinal;
    
        
        
        System.out.println("Valor do produto: R$ "+valorTotalProduto);
        
        valorFinal = (valorTotalProduto + ((acrescimo/100)*valorTotalProduto));
        valorFinal = valorFinal - desconto;
        
        System.out.printf("O valor final do produto com acréscimo de %.2f%% e desconto de R$ %.2f é: R$"
                + " %.2f !\n", acrescimo, desconto, valorFinal );
    
    }
    
}
