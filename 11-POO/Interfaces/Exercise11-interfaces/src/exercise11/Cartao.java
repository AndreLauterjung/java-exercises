package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class Cartao implements MeioPagamento
{
    private String nome;
    private double limite;
    
    
    public Cartao(String nome, double limite)
    {
        this.nome = nome;
        this.limite = limite;
    }
    
    @Override
    public boolean pagar(double valor)
    {
        if(valor <= this.limite)
        {
            this.limite -= valor;
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
