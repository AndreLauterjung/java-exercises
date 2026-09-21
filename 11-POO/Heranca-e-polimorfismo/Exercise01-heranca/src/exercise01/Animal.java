package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Animal
{
    private String nome;
    private int idade;
    
    public Animal(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNomeAnimal()
    {
        return this.nome;
    }
        
    public String getIdadeAnimal()
    {
        return "Idade do animal: "+this.idade;
    }
    
    
    
}
