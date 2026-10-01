/* Enunciado do exercício:

Mensagem de saudação.

- Crie uma interface Saudacao, com um único método: 
String cumprimentar(String nome); 

- No main, crie uma variável do tipo Saudacao, usando lambda, que recebe um nome 
e devolve uma frase tipo "Olá, " + nome + "!". 

- Teste com 2 nomes diferentes. */
package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Saudacao saudar = (nome) -> "Olá, "+nome+" !";
        
        String resultado1 = saudar.cumprimentar("André");
        String resultado2 = saudar.cumprimentar("Ferreira");
        
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
