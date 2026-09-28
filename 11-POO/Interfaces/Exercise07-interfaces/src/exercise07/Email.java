package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Email implements Notificador
{
    @Override
    public void enviar(String notificacao)
    {
        System.out.println("\nVocê recebeu um email!");
        System.out.println("[Email] "+notificacao);
    }
}
