package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class Circulo implements Desenhavel, Redimensionavel
{
    @Override
    public void desenhar()
    {
        System.out.println("\n===================================");
        System.out.println("Desenhando círculo...");
        System.out.println("Círculo desenhado!");
        
    }
    
    @Override
    public void redimensionar(double fator)
    {
        System.out.println("\n===================================");
        System.out.println("Redimensionando círculo...");
        System.out.println("Círculo redimensionado em "+fator+" cm.");
        
    }
}
