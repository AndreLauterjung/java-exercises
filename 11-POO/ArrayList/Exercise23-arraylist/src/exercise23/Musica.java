package exercise23;

/**
 *
 * @author andrelauterjung
 */
public class Musica
{
    private String titulo;
    
    public Musica()
    {
        
    }
    
    public Musica(String titulo)
    {
        this.titulo = titulo;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Musica)
        {
            Musica outraMusica = (Musica) obj;
            
            return this.getTitulo().equals(outraMusica.getTitulo());
        }
        return false;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
}
