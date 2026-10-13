package exercise24;

/**
 *
 * @author andrelauterjung
 */
public class Filme
{
    private String titulo;
    
    public Filme()
    {
        
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Filme)
        {
            Filme outroFilme = (Filme) obj;
            
            return this.getTitulo().equals(outroFilme.getTitulo());
        }
        
        return false;
    }
    
    public Filme(String tituloFilme)
    {
        this.titulo = tituloFilme;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
}
