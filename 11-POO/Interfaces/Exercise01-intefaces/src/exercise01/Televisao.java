package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Televisao implements Ligavel
{
    @Override
    public void ligar()
    {
        System.out.println("A televisão foi ligada!");
    }
    
    @Override
    public void desligar()
    {
        System.out.println("A televisão foi desligada!");
    }
}
