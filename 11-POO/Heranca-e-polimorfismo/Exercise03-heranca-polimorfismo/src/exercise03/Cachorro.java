package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Cachorro extends Animal
{
    private String racaCachorro;
    
    public Cachorro(String nome, int idade, String racaCachorro)
    {
        super(nome, idade);
        this.racaCachorro = racaCachorro;
    }
    
    @Override
    public String emitirSom()
    {
        return "Au Au Au";
    }
    
    
    public String getRacaCachorro()
    {
        return this.racaCachorro;
    }
        
}
