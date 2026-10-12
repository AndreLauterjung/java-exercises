package exercise15;

/**
 *
 * @author andrelauterjung
 */
public class Pet
{
    private String nome;
    
    public Pet()
    {
        
    }
    
    public Pet(String nomePet)
    {
        this.nome = nomePet;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Pet)
        {
            Pet novoObjeto = (Pet) obj;
            
            return this.getNomePet().equals(novoObjeto.getNomePet());
        }
        
        return false;
    }
    
    public String getNomePet()
    {
        return this.nome;
    }
}
