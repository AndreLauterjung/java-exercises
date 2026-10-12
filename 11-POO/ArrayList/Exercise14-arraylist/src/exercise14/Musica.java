package exercise14;

/**
 *
 * @author andrelauterjung
 */
public class Musica
{
    private String nome;
    
    public Musica()
    {
        
    }
    
    public Musica(String nomeMusica)
    {
        this.nome = nomeMusica;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Musica)
        {
            Musica outraMusica = (Musica) obj;
            
            return this.getNomeMusica().equals(outraMusica.getNomeMusica());
        }
        return false;
    }
    
    public String getNomeMusica()
    {
        return this.nome;
    }
}
