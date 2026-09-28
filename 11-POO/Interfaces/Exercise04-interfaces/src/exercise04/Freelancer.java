package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Freelancer implements Pagavel
{
    private int horasTrabalho;
    private String nome;
    private double pagamento;
    private double valorHora;
    
    public Freelancer(String nome, int horasT, double valorHoraT)
    {
        this.nome = nome;
        this.horasTrabalho = horasT;
        this.valorHora = valorHoraT;
    }
    
    
    @Override
    public double calcularPagamento()
    {
        this.pagamento = horasTrabalho * valorHora;
        
        return this.pagamento;
    }
}
