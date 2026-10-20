package exercise09;

import java.util.Objects;
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
    public int hashCode()
    {
        return Objects.hash(nome);
    }
    
    
    public String getNome()
    {
        return this.nome;
    }
    
    
}
