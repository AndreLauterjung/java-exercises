/* Enunciado do exercício:

Jogadores de um campeonato (int + String)

- Crie a classe Jogador com camisa (int), nome (String) e time (String), construtor e getters. 

- Sobrescreva equals e hashCode comparando a camisa e o time. O nome não entra. 

- Na Main, crie um HashSet<Jogador> e tente adicionar, nesta ordem: 10 / Ana / Verde, 10 / Bia / Azul, 
7 / Carla / Verde, 10 / Dani / Verde. 

- Para cada tentativa, imprima Inscrito! ou Camisa já usada neste time!, de acordo com o retorno do .add(). 

- Imprima o tamanho e o nome de cada jogador. 

Esperado: só a quarta é recusada, o tamanho é 3, e a camisa 10 do Verde continua com a Ana. */

package exercise10;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        boolean isFuncionando = true;
        
        Scanner sc = new Scanner(System.in);
        Set<Jogador> jogadores = new HashSet<>();
        
        while(isFuncionando)
        {
            System.out.println("Digite o número da camisa do jogador: ");
            int numeroJogador = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome do jogador: ");
            String nomeJogador = sc.nextLine();

            System.out.println("Digite a cor do time do jogador: ");
            String corTime = sc.nextLine();
            

            boolean isFoiAdicionado = jogadores.add(new Jogador(numeroJogador, nomeJogador, corTime));

            if(isFoiAdicionado)
            {
                System.out.println("\nJogador inscrito!");
            }
            else
            {
                System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Erro!");
                System.out.println("Camisa usada nesse time!");
            }
            
            System.out.println("\nTamanho da lista de jogadores: "+jogadores.size());
            
            for(Jogador jogador : jogadores)
            {
                System.out.println(jogador.getNome());
            }
            
            System.out.println("\n= = = = = = = = = = = = = = = = = =");
            System.out.println("Deseja encerrar o programa? (S/n)");
            char resposta = sc.nextLine().charAt(0);
            
            
            if(resposta == 'S' || resposta == 's')
            {
                System.out.println("PROGRAMA ENCERRADO!");
                System.out.println("= = = = = = = = = = = = = = = = = =");
                isFuncionando = false;
            }
            
            
        }
        sc.close();
    }
}
