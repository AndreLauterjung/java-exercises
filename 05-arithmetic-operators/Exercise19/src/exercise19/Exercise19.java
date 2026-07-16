package exercise19;

/**
 *
 * @author andrelauterjung
 */
public class Exercise19
{
    public static void main(String[] args)
    {
        // Calcule o preço total de 5 camisetas que custam R$ 30,00 cada.
        
        double precoCamiseta = 30.00, totalCompra;
        int qtdCamisetas = 5;
        
        totalCompra = precoCamiseta * qtdCamisetas;
       
        System.out.printf("O valor final da compra é de R$ %.2f !\n", totalCompra);
        
    }
    
}
