package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class UsuarioToken implements Autenticavel
{
    private String token;
    
    public UsuarioToken(String tokenU)
    {
        this.token = tokenU;
    }
    
    @Override
    public boolean autenticar(String credencial)
    {
        return this.token.equals(credencial);
    }
}
