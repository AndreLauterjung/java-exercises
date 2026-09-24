package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class Familia extends Ingresso
{
    private int quantidadePessoas;
    
    public Familia(double valorI, String nomeF, String tipoF, int qtdPessoas)
    {
        super(valorI, nomeF, tipoF);
        this.quantidadePessoas = qtdPessoas;
    }
    
    @Override
    public String valorDoIngresso()
    {
        double valorIngresso = this.getValorIngresso();
        
        if(quantidadePessoas > 3)
        {
            valorIngresso = this.quantidadePessoas * valorIngresso;
            valorIngresso = valorIngresso - (valorIngresso * 0.05);
        }
        else
        {
             valorIngresso = this.quantidadePessoas * valorIngresso;
        }
        
        return "O valor da entrada família é: R$ "+valorIngresso;
    }

}
