package exercise43;

/**
 *
 * @author andrelauterjung
 */
public class Exercise43
{

    public static void main(String[] args)
    {
        // Herança Proporcional: Divida R$ 100.000,00 entre dois herdeiros. O primeiro recebe 70% e o segundo o restante.
    
        double heranca = 100000.0, parteHerdeiroUm = 70.0, herdeiro1, herdeiro2;
    
        herdeiro1 = (parteHerdeiroUm/100) * heranca;
        
        heranca = heranca-herdeiro1;
        
        herdeiro2 = heranca;
        
        System.out.println("Valor recebido pelo herdeiro 1: R$ "+herdeiro1);
        System.out.println("Valor recebido pelo herdeiro 2: R$ "+herdeiro2);
    }
 
}
