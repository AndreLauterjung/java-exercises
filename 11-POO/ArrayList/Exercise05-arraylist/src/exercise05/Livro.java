package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Livro
{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String tituloLivro, String autorLivro, int anoPublicacaoLivro)
    {
        this.titulo = tituloLivro;
        this.autor = autorLivro;
        this.anoPublicacao = anoPublicacaoLivro;
    }
    
    public String retornarLivro()
    {
        return getTituloLivro()+" - "+getAutorLivro()+ " ("+getAnoPublicacaoLivro()+")";
    }
    
    public String getTituloLivro()
    {
        return this.titulo;
    }
    
    public String getAutorLivro()
    {
        return this.autor;
    }
    
    public int getAnoPublicacaoLivro()
    {
        return this.anoPublicacao;
    }
    
}
