package exercise05;

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
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Pessoa)
        {
            Pessoa outraPessoa = (Pessoa) obj;
            
            return this.getNome().equals(outraPessoa.getNome()) &&
                    this.getIdade() == outraPessoa.getIdade();
        }
        
        return false;
    }
    
    /*@Override
    public int hashCode()
    {
        return Objects.hash(nome, idade);
    }*/
}
