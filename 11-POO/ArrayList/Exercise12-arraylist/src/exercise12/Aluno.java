package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Aluno
{
    private String nome;
    
    public Aluno(String nome)
    {
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Aluno)
        {
            Aluno outro = (Aluno) obj;
            return this.nome.equals(outro.getNome());
        }
            return false;
     }
    
    public void mostrarNome()
    {
        System.out.println("Nome: "+this.nome);
    }
    
    public String getNome()
    {
        return this.nome;
    }
}
