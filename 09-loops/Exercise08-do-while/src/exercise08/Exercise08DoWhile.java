package exercise08;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise08DoWhile
{

    public static void main(String[] args)
    {
        /* Menu de Repetição do Sistema: Crie um menu para processamento de dados.
        Mostre as opções disponíveis, execute a opção e pergunte ao usuário: "Deseja
        realizar outra operação? (1-Sim / 0-Não)". O laço do-while deve repetir todo o menu
        se ele digitar 1. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isFuncionando = true;
        int opcaoUsuario = -1;
        
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        
        do
        {
            System.out.println("=====================================");
            System.out.println("        SOMADOR DE NÚMEROS ");
            System.out.println("=====================================");
            System.out.println("Digite um número inteiro: ");
            num1 = sc.nextInt();
            
            System.out.println("Digite outro número inteiro: ");
            num2 = sc.nextInt();
            
            resultado = num1 + num2;
            
            System.out.println("RESULTADO = "+resultado);
            System.out.println("=====================================");
            
            System.out.println("Deseja realizar outra operação?");
            System.out.println("0: NÃO");
            System.out.println("1: SIM");
            opcaoUsuario = sc.nextInt();
            
            
            if(opcaoUsuario == 1)
            {
                isFuncionando = true;
            }
            else
            {
                isFuncionando = false;
                System.out.println("PROGRAMA ENCERRADO!");
            }
            
                 
        }
        while(isFuncionando);
        
    }
    
}
