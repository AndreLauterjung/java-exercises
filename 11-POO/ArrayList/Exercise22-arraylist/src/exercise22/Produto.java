package exercise22;

/**
 *
 * @author andrelauterjung
 */
public class Produto
{
    private String nome;
    
    public Produto()
    {
        
    }
    
    public Produto(String nomeProduto)
    {
        this.nome = nomeProduto;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Produto)
        {
            Produto outroProduto = (Produto) obj;
            
            return this.getNome().equals(outroProduto.getNome());
        }
        return false;
    }
    public String getNome()
    {
        return this.nome;
    }
}
