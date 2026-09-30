package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class Quadrado implements Desenhavel, Redimensionavel
{
    @Override
    public void desenhar()
    {
        System.out.println("\n===================================");
        System.out.println("Desenhando quadrado...");
        System.out.println("Quadrado desenhado!");
        
    }
    
    @Override
    public void redimensionar(double fator)
    {
        System.out.println("\n===================================");
        System.out.println("Redimensionando quadrado...");
        System.out.println("Quadrado redimensionado em "+fator+" cm.");
        
    }
}
