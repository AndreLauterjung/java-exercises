package exercise03;

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
    
    
    public String emitirSom()
    {
        return "O animal emite o som...";
    }
    
    
    public String getNomeAnimal()
    {
        return this.nome;
    }
        
    public int getIdadeAnimal()
    {
        return this.idade;
    }
}
