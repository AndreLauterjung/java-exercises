/* Enunciado do exercício:

Verificador de maioridade.

- Crie uma interface VerificadorIdade, com um único método: boolean 
verificar(int idade); 

- No main, crie uma variável do tipo VerificadorIdade, usando lambda, que
retorna true se a idade for maior ou igual a 18, e false caso contrário. 

- Teste chamando o método com 3 idades diferentes (uma que dê true, uma que dê 
false), imprimindo o resultado de cada uma. 

*/
package exercise02;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        VerificadorIdade verificador = (idade) -> idade >= 18;
        
        boolean isMaiorIdade1 = verificador.verificarIdade(17);
        boolean isMaiorIdade2 = verificador.verificarIdade(18);
        boolean isMaiorIdade3 = verificador.verificarIdade(19);
        
        System.out.println("(1) É maior de idade? "+isMaiorIdade1);
        System.out.println("(2) É maior de idade? "+isMaiorIdade2);
        System.out.println("(3) É maior de idade? "+isMaiorIdade3);
    }
}
