package exercise13;

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
    
    public Filme(String tituloFilme)
    {
        this.titulo = tituloFilme;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Filme)
        {
            Filme outroFilme = (Filme) obj;
            
            return this.titulo.equals(outroFilme.getTituloFilme());
        }
        return false;
    }
    
    public String getTituloFilme()
    {
        return this.titulo;
    }
        
}
