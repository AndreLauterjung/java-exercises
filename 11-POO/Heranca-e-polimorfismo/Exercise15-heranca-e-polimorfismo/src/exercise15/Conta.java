package exercise15;

/**
 *
 * @author andrelauterjung
 */
public class Conta
{
    private double saldo;
    
    public Conta(double saldoC)
    {
        this.saldo = saldoC;
    }
    
    
    public void sacarValor(double valorSaque)
    {
        this.saldo -= valorSaque;
        
        System.out.println("Saldo da conta: "+this.saldo);
        
    }
    
    
    public void setSaldo(double valorSaldo)
    {
        this.saldo = valorSaldo;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
}
