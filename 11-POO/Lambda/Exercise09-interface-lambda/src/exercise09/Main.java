/* Enunciado do exercício:


-  Crie uma interface Comparador, com um único método: int maior(int a, int b);

- No main, crie duas variáveis diferentes do tipo Comparador: 

    Uma chamada maiorNumero, que devolve o maior dos dois números;
    
    Outra chamada menorNumero, que devolve o menor dos dois números (dica: 
inverta o sinal do operador ternário).

- Teste as duas com o mesmo par de números (ex: 15 e 8), imprimindo o resultado 
de cada uma, pra confirmar que uma dá o maior e a outra dá o menor. 

O objetivo deste exercício: mostrar que a mesma interface pode ser "preenchida"
com lambdas completamente diferentes, dependendo do que você precisa.

*/
package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Comparador maiorNumero = (a, b) ->
                a > b ? a : b;
        
        Comparador menorNumero = (a, b) ->
                a < b ? a : b;
        
        
        int resultado1 = maiorNumero.maior(10, 20);
        int resultado2 = menorNumero.maior(29, 19);
        
        
        System.out.println("Resultado 1: "+resultado1);
        System.out.println("Resultado 2: "+resultado2);
    }
}
