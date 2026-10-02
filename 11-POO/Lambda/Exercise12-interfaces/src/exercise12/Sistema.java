package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Sistema
{
    public void enviarMensagensMarket(Marketing[] marketing, String mensagem)
    {
        for(Marketing marketingItem: marketing)
        {
            marketingItem.mensagemSistema(mensagem);
           
        }
    }
}
