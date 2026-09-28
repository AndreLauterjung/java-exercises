package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Animal
{
    private String nome;
    
    public Animal(String nomeAnimal)
    {
        this.nome = nomeAnimal;
    }
    
    public void exibirNome()
    {
        System.out.println("\nNome do animal: "+this.nome);
    }
    
}
