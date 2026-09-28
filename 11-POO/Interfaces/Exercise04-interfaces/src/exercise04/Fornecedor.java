package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Fornecedor implements Pagavel 
{
    private double valorNota;
    private String nomeFornecedor;
    
    public Fornecedor(String nomeF, double valorNotaF)
    {
        this.nomeFornecedor = nomeF;
        this.valorNota = valorNotaF; 
    }
    
    @Override
    public double calcularPagamento()
    {
        return this.valorNota;
    }
        
}
