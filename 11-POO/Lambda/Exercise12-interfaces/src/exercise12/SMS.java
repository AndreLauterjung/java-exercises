package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class SMS implements Marketing
{
    @Override
    public void mensagemSistema(String mensagem)
    {
        System.out.println("SMS: "+mensagem);
    }
}
