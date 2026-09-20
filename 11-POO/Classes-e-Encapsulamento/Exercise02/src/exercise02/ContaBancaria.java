package exercise02;

/**
 *
 * @author andrelauterjung
 */
public class ContaBancaria
{
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular)
    {
        this.titular = titular;
        this.saldo = 0.00;
    }
    
    public String verSaldo()
    {
        return "Titular da conta: "+this.titular+"\nSaldo da conta: R$ "+this.saldo+ "\n";
    }
     
}
