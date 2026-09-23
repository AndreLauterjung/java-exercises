package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        
        Veiculo[] frotaVeiculos = {new Veiculo(), new Carro(), new Carro(), new Caminhao(), new Caminhao()};
        
        
        for(int i = 0; i < frotaVeiculos.length; i++)
        {
            if(frotaVeiculos[i] instanceof Caminhao)
            {
                System.out.println(((Caminhao)frotaVeiculos[i]).carregarCarga());
            }
            else if(frotaVeiculos[i] instanceof Carro)
            {
                System.out.println(((Carro)frotaVeiculos[i]).abrirPortaMalas());
            }
        }
    }
    
}
