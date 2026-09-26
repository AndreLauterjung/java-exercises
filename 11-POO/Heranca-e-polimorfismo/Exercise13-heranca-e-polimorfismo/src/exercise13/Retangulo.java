package exercise13;

/**
 *
 * @author andrelauterjung
 */
public class Retangulo extends FormaGeometrica
{
    private double base;
    private double altura;
    
    public Retangulo(double baseQ, double alturaQ)
    {
        super();
        this.base = baseQ;
        this.altura = alturaQ;
    }
    

    @Override
    public String calcularArea()
    {
        
        return "Área do retângulo: "+base*altura;
    }
}
