package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class Dinheiro implements MeioPagamento
{
    private String nome;
    
    public Dinheiro(String nome)
    {
        this.nome = nome;
    }
            
    
    @Override
    public boolean pagar(double valor)
    {
        return true;
    }
    
    @Override
    public String getNome()
    {
        return this.nome;
    }
}
