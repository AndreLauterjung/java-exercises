package exercise06.objects;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Carro carro1 = new Carro();
        
        boolean isProgramaRodando = true;
        int opcao;
        
        while(isProgramaRodando)
        {
            System.out.println("\n************ MENU DE OPÇÕES ************");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar carro");
            System.out.println("4 - desacelerar carro");
            System.out.println("5 - virar para esquerda ou direita");
            System.out.println("6 - verificar velocidade");
            System.out.println("7 - trocar marcha");
            System.out.println("****************************************");
            opcao = sc.nextInt();
            sc.nextLine();
        
            switch(opcao)
            {
                case 1:
                    carro1.ligarCarro();
                    break;

                case 2: 
                    carro1.desligarCarro();
                    isProgramaRodando = false;
                    break;

                case 3: 
                    carro1.acelerarCarro();
                    break;
                    
                case 4:
                    carro1.desacelerarCarro();
                    break;
                    
                case 5: 
                    carro1.virarCarroEsqDir(sc);
                    break;
                    
                case 6:
                    carro1.verificarVelocidade();
                    break;
                    
                case 7:
                    carro1.trocarMarcha();
                    break;
            }

        }
        sc.close();
    }

}
