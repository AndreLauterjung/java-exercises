package exercise10;

/**
 *
 * @author andrelauterjung
 */
public class Celular implements Recarregavel
{
    
    public void ligar()
    {
        System.out.println("\n====================");
        System.out.println("Ligando celular...");
        System.out.println("Celular ligado!");
    }
    
    public void desligar()
    {
        System.out.println("\n====================");
        System.out.println("Desigando celular...");
        System.out.println("Celular desligado!");
    }
    
    public void recarregar()
    {
        System.out.println("\n====================");
        System.out.println("Recarregando celular...");
    }
}
