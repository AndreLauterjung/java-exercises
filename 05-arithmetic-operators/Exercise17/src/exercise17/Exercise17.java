package exercise17;

/**
 *
 * @author andrelauterjung
 */
public class Exercise17
{

    public static void main(String[] args)
    {
        // Multiplique o número de meses em um ano (12) por uma economia mensal de R$ 100,00.
        
        int mesesAno = 12;
        double economiaMensal = 100.00, totalEconomizado;
        
        totalEconomizado = mesesAno * economiaMensal;
        
        System.out.printf("Em %d meses foram economizados R$ %.2f !\n", mesesAno, totalEconomizado);
        
        
        
        
    }
    
}
