package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Exercise07
{

    public static void main(String[] args)
    {
        // Subtraia um desconto de R$15,00 de um produto que custa R$ 100,00.
        
        double valorProduto = 100.00, valorFinal;
        double valorPago = 15.00;
        
        valorFinal = valorProduto - valorPago;
        
        System.out.printf("Restam R$ %.2f a serem pagos!\n", valorFinal);
         
    }
    
}
