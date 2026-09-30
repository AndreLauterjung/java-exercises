package exercise10;

/**
 *
 * @author andrelauterjung
 */
public class Notebook implements Recarregavel
{
    public void ligar()
    {
        System.out.println("\n====================");
        System.out.println("Ligando notebook...");
        System.out.println("Notebook ligado!");
    }
    
    public void desligar()
    {
        System.out.println("\n====================");
        System.out.println("Desligando notebook...");
        System.out.println("Notebook desligado!");
    }
    
    public void recarregar()
    {
        System.out.println("\n====================");
        System.out.println("Recarregando notebook...");

    }
}
