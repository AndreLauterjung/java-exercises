package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class Pix implements MeioPagamento
{
    private String nome;
    private double saldo;
    
    public Pix(String nomeP, double saldo)
    {
        this.nome = nomeP;
        this.saldo = saldo;
    }
    
    @Override
    public boolean pagar(double valor)
    {
        if(valor <= this.saldo)
        {
            this.saldo -= valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public String getNome()
    {
        return this.nome;
    }
    
    
}
