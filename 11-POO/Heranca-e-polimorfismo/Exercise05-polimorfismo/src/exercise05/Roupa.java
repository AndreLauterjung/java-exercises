package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Roupa extends Produto
{
    private double tamanho;
    
    public Roupa(String nome, double preco, double tamanhoRoupa)
    {
        super(nome, preco);
        this.tamanho = tamanhoRoupa;
    }
    
    
    public String getTamanhoRoupa()
    {
        return "Tamanho da roupa: "+this.tamanho;
    }
}
