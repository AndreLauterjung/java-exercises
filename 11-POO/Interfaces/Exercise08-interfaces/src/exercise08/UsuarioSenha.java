package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class UsuarioSenha implements Autenticavel
{
    private String senha;
    
    public UsuarioSenha(String senhaU)
    {
        this.senha = senhaU;
    }
    
    @Override
    public boolean autenticar(String credencial)
    {
        return this.senha.equals(credencial);
    }
}
