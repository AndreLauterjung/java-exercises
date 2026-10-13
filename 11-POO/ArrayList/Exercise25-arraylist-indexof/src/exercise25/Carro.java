package exercise25;

/**
 *
 * @author andrelauterjung
 */
public class Carro
{
    private String placa;
    
    public Carro()
    {
        
    }
    
    public Carro(String placaCarro)
    {
        this.placa = placaCarro;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Carro)
        {
            Carro outroCarro = (Carro) obj;
            
            return this.getPlaca().equals(outroCarro.getPlaca());
        }
        return false;
    }
    
    
    public String getPlaca()
    {
        return this.placa;
    }
    

}
