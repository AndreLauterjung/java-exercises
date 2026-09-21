package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Cachorro extends Animal
{
    private String raca;
    
    public Cachorro(String nome, int idade, String raca)
    {
        super(nome, idade);
        this.raca = raca;
    }
    
    public String getRacaCachorro()
    {
        return this.raca;
    }
        
  
}
