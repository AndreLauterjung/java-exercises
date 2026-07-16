package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Exercise01
{

    public static void main(String[] args)
    {
        String text = "Hello World!";
        String newText;
        
        // Deixa as letras maiúsculas
        newText = text.toUpperCase();
        System.out.println(text+"    -> NO EDIT!");
        System.out.println(newText);
        
        // Deixa as letras minúsculas
        newText = text.toLowerCase();
        System.out.println(text+"    -> NO EDIT!");
        System.out.println(newText);
        
        
    }
    
}
