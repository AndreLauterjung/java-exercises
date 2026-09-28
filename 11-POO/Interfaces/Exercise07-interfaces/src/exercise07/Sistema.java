package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Sistema
{

    public void notificarTodos(Notificador[] canais, String mensagem)
    {
        for(Notificador avisoCanais : canais)
        {
            avisoCanais.enviar(mensagem);
        }
    }
}
