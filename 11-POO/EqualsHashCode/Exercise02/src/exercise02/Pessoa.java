package exercise02;

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
        // Gera o hashCode a partir do nome: nomes iguais produzem sempre o mesmo número
        return Objects.hash(nome);
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
}
