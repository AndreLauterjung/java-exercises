package exercise13;

/**
 *
 * @author andrelauterjung
 */
public class Exercise13
{
    public static void main(String[] args)
    {
        // Divida um prêmio de R$ 5000,00 igualmente entre 2 ganhadores.
        
        double premio = 5000.00, divisaoPessoa;
        int ganhadores = 2;
        
        divisaoPessoa = premio / ganhadores;
        
        System.out.printf("Cada ganhador receberá: R$ %.2f\n", divisaoPessoa);
        
    }
    
}
