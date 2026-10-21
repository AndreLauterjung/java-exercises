package exercise14;

import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author andrelauterjung
 */
public class Hotel
{
    private Set<Hospede> hospedes = new HashSet<Hospede>();
    
    public boolean registrarEntrada(Hospede h)
    {
        return hospedes.add(h);
    }
    
    public boolean registrarSaida(String documento)
    {
        return hospedes.remove(new Hospede(documento, ""));
    }
    
    public void listarHospedes()
    {
        System.out.println("\n==============================");
        System.out.println("\nLista de hóspedes: ");
        for(Hospede hospede: hospedes)
        {
            System.out.println("Nome do hóspede: "+hospede.getNome());
        }
    }
    
    public void quantidadeHospedes()
    {
        System.out.println("\n==============================");
        System.out.println("Quantidade de hóspedes: "+hospedes.size());
    }
}
