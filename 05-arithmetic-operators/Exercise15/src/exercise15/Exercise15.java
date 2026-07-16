package exercise15;

/**
 *
 * @author andrelauterjung
 */
public class Exercise15
{
    public static void main(String[] args)
    {
        // Some o valor de um aluguel (R $1200,00) com a conta de energia (R$ 150,00).
        
        double aluguel = 1200.00, contaEnergia = 150.00, valorTotalGastos;
        
        valorTotalGastos = aluguel + contaEnergia;
        
        System.out.printf("O valor total de contas a serem pagas é de R$ %.2f !\n", valorTotalGastos);
        
    }
    
}
