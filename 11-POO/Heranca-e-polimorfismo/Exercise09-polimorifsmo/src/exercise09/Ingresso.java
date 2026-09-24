package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class Ingresso
{
    private double valor;
    private String nomeFilme;
    private String tipoFilme;
    
    public Ingresso(double valorI, String nomeF, String tipoF)
    {
        this.valor = valorI;
        this.nomeFilme = nomeF;
        this.tipoFilme = tipoF;
    }
    
    public String valorDoIngresso()
    {
        return "O valor da entrada inteira é: R$ "+this.valor;
    }
    
    public double getValorIngresso()
    {
        return this.valor;
    }
}
