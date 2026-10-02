package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Marketing[] notificacao = {new Email(), new SMS(), new WhatsApp(), new RedesSociais()};
        
        
        String mensagem = "Novo produdo disponível!";
        
        
        Sistema sistema = new Sistema();
        
        sistema.enviarMensagensMarket(notificacao, mensagem);
    }
}
