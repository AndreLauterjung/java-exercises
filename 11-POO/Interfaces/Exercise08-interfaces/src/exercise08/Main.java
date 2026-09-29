/* Enunciado do exercício:

Crie a interface Autenticavel com boolean autenticar(String credencial);. 

Crie:

- UsuarioSenha, que guarda uma senha e retorna true se a credencial for igual 
a ela; 

- UsuarioToken, que guarda um token e faz a mesma coisa. 

No main, teste cada um com uma credencial certa e uma errada, imprimindo 
"Acesso liberado" ou "Acesso negado".

*/

package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        UsuarioSenha usuarioS = new UsuarioSenha("asdf1234");
        UsuarioToken usuarioT = new UsuarioToken("AsDf$111111");
        
        System.out.println("TESTANDO CREDENCIAL USUÁRIO (SENHA) ");
        if(usuarioS.autenticar("asdf1234"))
        {
            System.out.println("Acesso liberado!");
        }
        else
        {
            System.out.println("Acesso negado!");
        }
        
        
        
        System.out.println("TESTANDO CREDENCIAL USUÁRIO (TOKEN) ");
        if(usuarioT.autenticar("2348asd3"))
        {
            System.out.println("Acesso liberado!");
        }
        else
        {
            System.out.println("Acesso negado!");
        }
    }
}
