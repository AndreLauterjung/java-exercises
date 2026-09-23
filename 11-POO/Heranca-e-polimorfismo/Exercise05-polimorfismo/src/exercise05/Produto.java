package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Produto
{
    private String nome;
    private double preco;
    
    
    public Produto(String nomeP, double precoP)
    {
        this.nome = nomeP;
        this.preco = precoP;
    }
    
    
    
    public String getNomeProduto()
    {
        return this.nome;
    }
    
    public double getPrecoProduto()
    {
        return this.preco;
    }
}
