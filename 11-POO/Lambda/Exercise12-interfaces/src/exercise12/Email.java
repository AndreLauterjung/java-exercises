package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Email implements Marketing
{
    @Override
    public void mensagemSistema(String mensagem)
    {
        System.out.println("E-mail: "+mensagem);
    }
}
