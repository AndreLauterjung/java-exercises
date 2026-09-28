package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class WhatsApp implements Notificador
{
    @Override
    public void enviar(String notificacao)
    {
        System.out.println("\nVocê recebeu uma mensagem no WhatsApp!");
        System.out.println("[WhatsApp] "+notificacao);
    }
}
