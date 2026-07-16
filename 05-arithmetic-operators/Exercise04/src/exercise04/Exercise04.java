package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Exercise04
{

    public static void main(String[] args)
    {
        // Divida uma despesa de restaurante de R$ 120,00 entre 3 amigos.
        
        double totalConta = 120.00, pagamentoPessoa;
        int pessoas = 3;
        
        pagamentoPessoa = totalConta /  pessoas;
        
        System.out.printf("Valor total da conta: R$ %.2f\n", totalConta);
        System.out.printf("Valor total para cada pessoa: R$ %.2f\n", pagamentoPessoa);
        
        
    }
    
}
