package exercise01.objects;

/**
 *
 * @author andrelauterjung
 */
public class Livro
{
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String verLivro()
    {
        return "Título do livro: "+this.titulo + "\nAutor do livro: "+this.autor+"\n";
    }
           
}
