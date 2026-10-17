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
    
    @Override
    public int hashCode()
    {
        return Objects.hash(nome, idade);
    }
            
    
}
