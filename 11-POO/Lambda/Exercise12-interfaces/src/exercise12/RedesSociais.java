package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class RedesSociais implements Marketing
{
    @Override
    public void mensagemSistema(String mensagem)
    {
        System.out.println("Redes sociais: "+mensagem);
    }
}
