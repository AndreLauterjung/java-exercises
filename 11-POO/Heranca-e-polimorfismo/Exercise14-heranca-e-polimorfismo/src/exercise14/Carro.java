package exercise14;

/**
 *
 * @author andrelauterjung
 */
public class Carro extends Veiculo
{
    private int quantidadePortas;
    
    public Carro(String marcaV, String modeloV, int qtdPortas)
    {
        super(marcaV, modeloV);
        this.quantidadePortas = qtdPortas;
    }
    
    @Override
    public void exibirInfo()
    {
        super.exibirInfo();
        System.out.println("Quantidade portas: "+this.quantidadePortas);
    }
    
    
    public int getQuantidadePortas()
    {
        return this.quantidadePortas;
    }
}
