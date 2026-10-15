package exercise43;

/**
 *
 * @author andrelauterjung
 */
public class Carro
{
    private String modelo;
    private String placa;
    
    public Carro()
    {
        
    }
    
    public Carro(String modelo, String placa)
    {
        this.modelo = modelo;
        this.placa = placa;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Carro)
        {
            Carro outroCarro = (Carro) obj;
            
            return this.getPlaca().equalsIgnoreCase(outroCarro.getPlaca());
        }
        return false;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    
    public String getPlaca()
    {
        return this.placa;
    }
    
    
}
