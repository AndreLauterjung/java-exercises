package exercise06;

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
    public boolean equals(Object obj)
    {
        if(obj instanceof Pessoa)
        {
            Pessoa outraPessoa = (Pessoa) obj;
            return this.nome.equals(outraPessoa.nome) &&
                    this.idade == outraPessoa.idade;
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(nome, idade);
    }
}
