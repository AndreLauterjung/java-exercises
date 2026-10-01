/* Enunciado do exercício:

Texto em maiúsculas.

- Crie uma interface Transformador, com um único método: 
String transformar(String texto); 

- No main, crie uma variável do tipo Transformador, usando lambda, que recebe 
um texto e devolve ele todo em maiúsculas. (Dica: toda String tem um método 
pronto chamado .toUpperCase(), que você pode usar dentro da lambda.) 

- Teste com 2 textos diferentes, imprimindo o resultado. */

package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Transformador transformarTexto = (texto) -> texto.toUpperCase();
        
        
        String novoTexto1 = transformarTexto.transformar("a b c d e f g h i j");
        String novoTexto2 = transformarTexto.transformar("k l m n o p q r s t u...");
        
        System.out.println(novoTexto1);
        System.out.println(novoTexto2);
    }
}
