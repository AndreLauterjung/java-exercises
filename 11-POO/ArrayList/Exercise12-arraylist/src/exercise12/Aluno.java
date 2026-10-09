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
    
    public void mostrarNome()
    {
        System.out.println("Nome: "+this.nome);
    }
    
    public String getNome()
    {
        return this.nome;
    }
}
