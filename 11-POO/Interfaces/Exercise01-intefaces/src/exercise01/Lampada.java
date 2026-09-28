package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Lampada implements Ligavel
{
    @Override
    public void ligar()
    {
        System.out.println("A lâmpada foi ligada!");
    }
    
    @Override
    public void desligar()
    {
        System.out.println("A lâmpada foi desligada!");
    }
}
