package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Gerente extends Funcionario
{
    public Gerente(String nome, double salario, String CPF)
    {
        super(nome, salario, CPF);
    }
    
    
    @Override
    public String retornarSalarioBase()
    {
        double salarioBase = getSalarioBase();
        
        salarioBase = salarioBase + (salarioBase * (20.0/100.0));
        
        return "Salário com bônus de 20%: R$ "+salarioBase;
    }
}