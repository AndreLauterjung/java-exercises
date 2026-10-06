package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Livro
{
    private String titulo;
    private String autor;
            
   public Livro(String tituloLivro, String autorLivro)
   {
       this.titulo = tituloLivro;
       this.autor = autorLivro;
   }
   
   public String getTituloLivro()
   {
       return this.titulo;
   }
   
   public String getAutorLivro()
   {
       return this.autor;
   }
}
