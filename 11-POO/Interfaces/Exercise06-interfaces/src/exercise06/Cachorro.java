package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Cachorro extends Animal implements Domestico
{
    public Cachorro(String nomeCachorro)
    {
        super(nomeCachorro);
    }
    
    public void brincar()
    {
        System.out.println("Brincando com o animal...");
    }
}
