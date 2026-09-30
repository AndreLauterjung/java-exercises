package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class Loja
{
     
    public void finalizarCompra(MeioPagamento meio, double valor)
    {
        if(meio.pagar(valor))
        {
            System.out.println("\nCompra aprovada via "+meio.getNome());
        }
        else
        {
            System.out.println("\nCompra recusada via "+meio.getNome());
        }
    }
}
