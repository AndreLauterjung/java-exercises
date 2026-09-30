package exercise11;

/**
 *
 * @author andrelauterjung
 */
public interface MeioPagamento
{
    boolean pagar(double valor);
    
    // Nome do meio de pagamento
    String getNome();
}
