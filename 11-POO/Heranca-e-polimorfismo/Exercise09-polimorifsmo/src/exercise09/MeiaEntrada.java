package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class MeiaEntrada extends Ingresso
{
    public MeiaEntrada(double valorI, String nomeF, String tipoF)
    {
        super(valorI, nomeF, tipoF);
    }
    
    @Override
    public String valorDoIngresso()
    {
        double valorIngresso = this.getValorIngresso();
        
        valorIngresso = valorIngresso / 2;
        
        
        return "O valor da meia entrada é: R$ "+valorIngresso;
    }
        
}
