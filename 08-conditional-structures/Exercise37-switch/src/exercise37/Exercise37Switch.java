package exercise37;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise37Switch
{

    public static void main(String[] args)
    {
        /* Rastreio de Pedidos de e-Commerce: Dado um número inteiro que representa o
        status atual de uma encomenda (1 a 4), exiba uma mensagem descritiva: 1 -
        Pedido Confirmado, 2 - Em Preparação, 3 - Em Trânsito, 4 - Entregue. */
        
        
        Scanner sc = new Scanner(System.in);
        
        int opcao = -1;
        
        
        System.out.println("============ MENU ================");
        System.out.println("Digite o número referente a opção: ");
        System.out.println("1 - Pedido Confirmado.");
        System.out.println("2 - Em Preparação.");
        System.out.println("3 - Em Trânsito.");
        System.out.println("4 - Entregue.");
        opcao = sc.nextInt();
        sc.close();
        
        
        switch(opcao)
        {
            case 1:
                System.out.println("Pedido Confirmado: o seu pedido foi confirmado e será"
                        + " entregue em breve!");
                break;
                
            case 2:
                System.out.println("Em Preparação: o seu pedido está sendo preparado!");
                break;
                
            case 3:
                System.out.println("Em Trânsito: o seu pedido está a caminho do"
                        + " local de entrega!");
                break;
                
            case 4:
                System.out.println("Entregue: o seu pedido foi entregue!");
                break;
                
            default: 
                System.out.println("Opção Inválida!");
                System.out.println("TENTE NOVAMENTE!");
        }
        System.out.println("=============================================================="
                + "=========="); 
        
    }
    
}
