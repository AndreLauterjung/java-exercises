package exercise20;

/**
 *
 * @author andrelauterjung
 */
public class Carro
{
    private String modelo;
    
    public Carro()
    {
        
    }
    
    public Carro(String modelo)
    {
        this.modelo = modelo;
    }
            
    public void setModelo(String novoModelo)
    {
        this.modelo = novoModelo;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
}
