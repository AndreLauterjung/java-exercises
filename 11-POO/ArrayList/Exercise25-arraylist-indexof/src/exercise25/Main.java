/* Enunciado do exercício: 

- Crie a classe Carro (atributos: String placa).

- Localize a vaga (o índice) de um carro específico na garagem informando a placa. */

package exercise25;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Carro> garagem = new ArrayList<>();
        
        garagem.add(new Carro("ASDF-1234"));
        garagem.add(new Carro("ADSI-2389"));
        garagem.add(new Carro("ODND-1739"));
        garagem.add(new Carro("QWER-0987"));
        
        
        int resultado = garagem.indexOf(new Carro("ZYDF-0000"));
        
        if(resultado == -1)
        {
            System.out.println("O carro não está na garagem.");
        }
        else
        {
            System.out.println("O carro está na posição: "+resultado);
        }
            
        
    }
}
