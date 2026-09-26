package exercise13;

/**
 *
 * @author andrelauterjung
 */
public class Circulo extends FormaGeometrica
{
    private double raio;
    
    public Circulo(double raioC)
    {
        super();
        this.raio = raioC;
    }
    
    @Override
    public String calcularArea()
    {
        return "Área do circulo: "+3.14 * (raio*raio);
    }
    
}
