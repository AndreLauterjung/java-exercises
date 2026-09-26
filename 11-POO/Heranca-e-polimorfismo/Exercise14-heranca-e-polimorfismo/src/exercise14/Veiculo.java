package exercise14;

/**
 *
 * @author andrelauterjung
 */
public class Veiculo
{
    private String marca;
    private String modelo;
    
    public Veiculo(String marcaV, String modeloV)
    {
        this.marca = marcaV;
        this.modelo = modeloV;
    }
    
    public void exibirInfo()
    {
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
    }
    
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
}
