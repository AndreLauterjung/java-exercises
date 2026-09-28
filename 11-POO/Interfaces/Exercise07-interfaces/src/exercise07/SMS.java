package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class SMS implements Notificador
{
    @Override
    public void enviar(String notificacao)
    {
        System.out.println("\nVocê recebeu um SMS!");
        System.out.println("[SMS] "+notificacao);
    }
}
