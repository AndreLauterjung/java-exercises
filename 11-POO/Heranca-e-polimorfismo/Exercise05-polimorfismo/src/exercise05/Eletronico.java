package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Eletronico extends Produto 
{
    private int garantiaMeses;
    
    public Eletronico(String nome, double preco, int garantia)
    {
        super(nome, preco);
        this.garantiaMeses = garantia;
    }

    
    public String getGarantiaMesesEletronico()
    {
        return "meses de garantia: "+this.garantiaMeses;
    }
        
}
