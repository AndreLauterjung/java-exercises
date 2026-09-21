package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {

        Cachorro doguinho = new Cachorro("Bob", 1, "pitbull");
        
        System.out.println(doguinho.getNomeAnimal());
        System.out.println(doguinho.getIdadeAnimal());
        System.out.println(doguinho.getRacaCachorro());
    }
}
