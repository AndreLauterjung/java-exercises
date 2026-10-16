package exercise45;

/**
 *
 * @author andrelauterjung
 */
public class Funcionario
{
    private String nome;
    private String cpf;
    
    public Funcionario()
    {
        
    }
    
    public Funcionario(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Funcionario( String cpf)
    {
        this.cpf = cpf;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Funcionario)
        {
            Funcionario outroFuncionario = (Funcionario) obj;
            return this.getCPF().equals(outroFuncionario.getCPF());
        }
        return false;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getCPF()
    {
        return this.cpf;
    }
}
