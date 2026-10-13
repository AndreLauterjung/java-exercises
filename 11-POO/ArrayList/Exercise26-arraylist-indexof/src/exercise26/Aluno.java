package exercise26;

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
    
    public Aluno(String nomeAluno)
    {
        this.nome = nomeAluno;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Aluno)
        {
            Aluno outroAluno = (Aluno) obj;
            
            return this.getNome().equals(outroAluno.getNome());
        }
        return false;
    }
    
    public String getNome()
    {
        return this.nome;
    }
}
