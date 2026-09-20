package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Retangulo
{
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura)
    {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double calcularAreaRetangulo()
    {
        return this.largura * this.altura;
    }
    
    
     
}
