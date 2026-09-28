package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Pato implements Voador, Nadador
{
    @Override
    public void nadar()
    {
        System.out.println("Pato nadando...");
    }
    
    @Override
    public void voar()
    {
        System.out.println("Pato voando...");
    }
}
