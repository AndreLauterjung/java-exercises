package exercise15;

/**
 *
 * @author andrelauterjung
 */
public class ContaCorrente extends Conta
{
    public ContaCorrente(double saldoConta)
    {
        super(saldoConta);
    }
    
    
    @Override
    public void sacarValor(double valorSaque)
    {
        double saldoConta = getSaldo();
        
        saldoConta = saldoConta - (valorSaque + 2.0);
        
        setSaldo(saldoConta);
        
        System.out.println("Saldo da conta: "+getSaldo());
    }
}
