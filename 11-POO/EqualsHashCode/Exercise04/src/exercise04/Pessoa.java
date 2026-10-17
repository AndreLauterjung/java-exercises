package exercise04;

import java.util.Objects;
/**
 *
 * @author andrelauterjung
 */
public class Pessoa
{
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
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
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
