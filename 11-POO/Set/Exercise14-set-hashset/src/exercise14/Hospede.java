package exercise14;

import java.util.Objects;
/**
 *
 * @author andrelauterjung
 */
public class Hospede
{
    private String documento;
    private String nome;
    
    public Hospede(String documento, String nome)
    {
        this.documento = documento;
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Hospede)
        {
            Hospede hospedeAtual = (Hospede) obj;
            
            return this.getDocumento().equals(hospedeAtual.getDocumento());
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(this.documento);
    }
    
    
    public String getDocumento()
    {
        return this.documento;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
}