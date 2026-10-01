/* Enunciado do exercício:

Validador de senha.

- Crie uma interface ValidadorSenha com um único método:
boolean validar(String senha); 

- No main, crie uma variável do tipo ValidadorSenha, usando lambda, 
que retorna true se a senha tiver 6 ou mais caracteres, e false caso contrário. 
(Dica: toda String tem um método .length() que devolve a quantidade de 
caracteres.) 

- Teste com 2 senhas diferentes: uma curta (menos de 6 caracteres) e uma longa 
(6 ou mais). 

*/

package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ValidadorSenha validarSenha = (senha) -> 
                senha.length() > 6;
        
        boolean resultado1 = validarSenha.validar("asdf12345");
        boolean resultado2 = validarSenha.validar("afsdf");
        
        System.out.println("A senha é válida? "+resultado1);
        System.out.println("A senha é válida? "+resultado2);
    }
}
