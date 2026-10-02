package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class WhatsApp implements Marketing
{
    @Override
    public void mensagemSistema(String mensagem)
    {
        System.out.println("WhatsApp: "+mensagem);
    }
}
