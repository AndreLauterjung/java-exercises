package exercise44;

/**
 *
 * @author andrelauterjung
 */
public class Cidade
{
    private String nome;
    private String estado;
    
    public Cidade(){
        
    }
    
    public Cidade(String nome, String estado)
    {
        this.nome = nome;
        this.estado = estado;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Cidade)
        {
            Cidade outraCidade = (Cidade) obj;
            
            return this.getNome().equalsIgnoreCase(outraCidade.getNome()) &&
                    this.getEstado().equalsIgnoreCase(outraCidade.getEstado());
        }
        return false;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getEstado()
    {
        return this.estado;
    }
    
    
}
