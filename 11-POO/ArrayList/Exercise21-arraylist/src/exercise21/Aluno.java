package exercise21;

/**
 *
 * @author andrelauterjung
 */
public class Aluno
{
    private String nome;
    
    public Aluno()
    {
        
    }
            
    public Aluno(String nome)
    {
        this.nome = nome;
    }
    
    public void setNomeAluno(String novoNome)
    {
        this.nome = novoNome;
    }
    
    public String getNomeAluno()
    {
        return this.nome;
    }
}
