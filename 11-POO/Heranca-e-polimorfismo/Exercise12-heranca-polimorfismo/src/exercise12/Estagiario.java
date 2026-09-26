package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Estagiario extends Funcionario
{
    public Estagiario(String nome, double salarioBase, String CPF)
    {
        super(nome, salarioBase, CPF);
    }
    
    @Override
    public String retornarSalarioBase()
    {
        double salarioBase = getSalarioBase();
        
        salarioBase = salarioBase - (salarioBase - (salarioBase * (60.0/100.0)));
        
        return "Salário com desconto de 60%: R$ "+salarioBase;
    }
}
