package exercise36;

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
        this.codigo = codigoProduto;
    }
    
    public String getCodigo()
    {
        return this.codigo;
    }
}
