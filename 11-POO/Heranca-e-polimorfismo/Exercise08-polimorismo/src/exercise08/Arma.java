package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class Arma extends Item
{
    private int dano;
    
    public Arma(int danoArma)
    {
        this.dano = danoArma;
    }
    
    
    public String atacar()
    {
        return "Atacou!";
    }
    
    public int getDanoArma()
    {
        return this.dano;
    }
}
