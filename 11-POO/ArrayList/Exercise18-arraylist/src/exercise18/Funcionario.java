package exercise18;

/**
 *
 * @author andrelauterjung
 */
public class Funcionario
{
    private String nome;
    private double salario;
    
    public Funcionario()
    {
        
    }
    
    public Funcionario(String nomeFuncionario, double salarioFuncionario)
    {
        this.nome = nomeFuncionario;
        this.salario = salarioFuncionario;
    }
    
    public String getNomeFuncionario()
    {
        return this.nome;
    }
    
    
    public double getSalarioFuncionario()
    {
        return this.salario;
    }
    
    public void setSalarioFuncionario(double novoSalarioFuncionario)
    {
        this.salario = novoSalarioFuncionario;
    }
}
