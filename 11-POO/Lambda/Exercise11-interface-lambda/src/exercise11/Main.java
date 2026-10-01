/* Enunciado do exercício:

 Lambda com dois parâmetros de tipos diferentes.

- Crie uma interface FormatadorPreco com um único método: 
String formatar(String produto, double preco); 

- No main, crie uma variável do tipo FormatadorPreco, usando lambda, que recebe
o nome de um produto e o preço dele, e devolve uma frase tipo: 
"Produto: Notebook - R$ 2500.0" (ou seja, junta o nome do produto com o preço,
numa frase formatada). 

- Teste com 2 produtos diferentes (ex: "Notebook" com preço 2500.0, e "Mouse"
com preço 50.0).  */

package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        FormatadorPreco precoFormatado = (produto, preco) ->
                "Produto: "+produto+" - Preço: R$ "+preco;
        
        String resultado1 = precoFormatado.formatar("Notebook", 2500.0);
        String resultado2 = precoFormatado.formatar("Mouse", 230.0);
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        
    }
}
