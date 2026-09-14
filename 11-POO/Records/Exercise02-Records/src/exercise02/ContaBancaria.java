package exercise02;

/**
 
 * @author andrelauterjung
 */
public record ContaBancaria(String titular, double saldo)
{
    public ContaBancaria
    {
        if(saldo < 0)
        {
            saldo = 0.0;
        }
    }
    
    public ContaBancaria realizarSaque(double valSaque)
    {
        if(valSaque  >0 && valSaque <= saldo)
        {
            return new ContaBancaria(titular, this.saldo - valSaque);
        }
        else
        {
            System.out.println("Ação inválida!");
            return this;
        }
    }
    
        
        
    public String mostrarDados()
    {
        return ("Titular da conta: "+titular+"\nSALDO: "+saldo);
    }

        
}
