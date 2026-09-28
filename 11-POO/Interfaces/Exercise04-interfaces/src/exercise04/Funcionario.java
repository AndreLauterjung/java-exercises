package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Funcionario implements Pagavel
{
    private double salarioMensal;
    private String nome;
    
    public Funcionario(double valSalarioFuncionario, String nomeFuncionario)
    {
        this.salarioMensal = valSalarioFuncionario;
        this.nome = nomeFuncionario;
    }
    
    
    @Override
    public double calcularPagamento()
    {
        return this.salarioMensal;
    }
}
