package exercise01.objects;

import exercise01.objects.Livro;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        
        Livro livro1 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis");
        
        String resultado = livro1.verLivro();
        System.out.printf(resultado);
    }
    
}
