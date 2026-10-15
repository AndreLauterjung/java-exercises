package exercise42;

/**
 *
 * @author andrelauterjung
 */
public class Aluno
{
    private int matricula;
    private String nome;
    
    public Aluno()
    {
        
    }
    
    public Aluno(int matricula, String nome)
    {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Aluno)
        {
            Aluno outroAluno = (Aluno) obj;
            
            return this.getMatricula() == outroAluno.getMatricula();
        }
        
        return false;
    }
    
    public int getMatricula()
    {
        return this.matricula;
    }
    
    public String getNome()
    {
        return this.nome;
    }
}
