package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        
        Animal[] animal = {new Cachorro(), new Cachorro(), new Gato(), new Gato()};
        
        
        
        for(int i = 0; i < animal.length; i++)
        {
            if(animal[i] instanceof Gato)
            {
                System.out.println(((Gato)animal[i]).arranharSofa());
            }
            else
            {
                System.out.println(((Cachorro)animal[i]).abanarRabo());
            }
        }
    }
}
