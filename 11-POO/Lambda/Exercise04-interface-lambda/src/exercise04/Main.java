/* Enunciado do exercício:

Maior de dois números.

- Crie uma interface Comparador, com um único método: int maior(int a, int b); 

- No main, crie uma variável do tipo Comparador, usando lambda, que devolve o 
maior dos dois números recebidos. (Dica: você pode usar um operador ternário, 
tipo a > b ? a : b, dentro da lambda.) 

- Teste com pelo menos 2 pares de números diferentes. 

*/
package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Comparador comparadorNum = (a, b) -> a > b? a : b;
                
        
        int resultado1 = comparadorNum.maior(10, 20);
        int resultado2 = comparadorNum.maior(21, 19);
        
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
