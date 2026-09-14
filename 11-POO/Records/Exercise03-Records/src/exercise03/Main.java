package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Carro novoCarro = new Carro("Ford", 1, 190);
        
        novoCarro = novoCarro.acelerarCarro(133);
        
        System.out.println(novoCarro.mostrarInfo());
        System.out.println(novoCarro.altaVelocidade());
        
        
    }
}