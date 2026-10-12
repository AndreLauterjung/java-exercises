package exercise16;

/**
 *
 * @author andrelauterjung
 */
public class Produto
{
    private String codigo;
    
    public Produto()
    {
        
    }
    
    public Produto(String codigoProduto)
    {
        this.codigo= codigoProduto;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Produto)
        {
            Produto novoProduto = (Produto) obj;
            
            return this.getCodigoProduto().equals(novoProduto.getCodigoProduto());
        }

        return false;
    }
    
    public String getCodigoProduto()
    {
        return this.codigo;
    }
}
