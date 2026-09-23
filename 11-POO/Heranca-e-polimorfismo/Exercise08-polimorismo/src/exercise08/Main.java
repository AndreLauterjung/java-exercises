package exercise08;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean programaRodando = true;
        
        Item[] mochilaHeroi = new Item[5];

        mochilaHeroi[0] = new  Item();
        mochilaHeroi[1] = new Arma(98);
        mochilaHeroi[2] = new Pocao(29);
        mochilaHeroi[3] = new Item();
        mochilaHeroi[4] = new Item();
        
        while(programaRodando)
        {
            
            System.out.println("=========================");
            System.out.println("Opções: ");
            System.out.println("0 - Fechar jogo.");
            System.out.println("1 - Olhar mochila.");
            int opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1)
            {
                for(int i = 0; i < mochilaHeroi.length; i++)
                {
                    if(mochilaHeroi[i] instanceof Arma)
                    {
                        System.out.println("Dano da arma: "+((Arma)mochilaHeroi[i]).getDanoArma());
                        System.out.println(((Arma)mochilaHeroi[i]).atacar());
  
                    }
                    else if(mochilaHeroi[i] instanceof Pocao)
                    {
                        System.out.println("Cura da poção: "+((Pocao) mochilaHeroi[i]).getCuraPocao());
                        System.out.println(((Pocao) mochilaHeroi[i]).beber());
                    }
                        
                }
            }
            else
            {
                programaRodando = false;
            }
        }

    }
  
}
