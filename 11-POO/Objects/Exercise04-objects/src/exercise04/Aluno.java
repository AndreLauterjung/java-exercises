package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Aluno
{
    private String nome;
    private double nota;
    
    private boolean resultadoFinal;
    
    public Aluno(String nome, double nota)
    {
        this.nome = nome;
        this.nota = nota;
    }
    
    public boolean verificarAprovacao()
    {
        if(this.nota >= 7.0)
        {
            this.resultadoFinal = true;
        }
        else
        {
            this.resultadoFinal = false;
        }
        
        return resultadoFinal;
    }
    
      
}
