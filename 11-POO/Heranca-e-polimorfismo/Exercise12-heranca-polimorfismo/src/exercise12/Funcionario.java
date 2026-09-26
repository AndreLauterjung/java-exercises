package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Funcionario
{
    private String nome;
    private double salarioBase;
    private String CPF;
    
    
    public Funcionario(String nome, double salarioBase, String CPF)
    {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.CPF = CPF;
    }
    
    public String retornarSalarioBase()
    {
        return "Salário base: R$ "+this.salarioBase;
    }
    
    public double getSalarioBase()
    {
        return this.salarioBase;
    }
}
