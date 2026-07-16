package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Exercise03
{

    public static void main(String[] args)
    {
        // Multiplique o valor de uma hora de trabalho (R$ 20,00) por 8 horas trabalhadas.
        
        double hourPayment = 20.00, totalPayment;
        int hourWork = 8;
        
        totalPayment = hourPayment * hourWork;
        
        System.out.printf("Total payment received: R$ %.2f\n", totalPayment);
    }
    
}
