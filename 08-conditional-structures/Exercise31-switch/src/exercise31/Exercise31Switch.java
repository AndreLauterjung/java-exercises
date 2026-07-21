package exercise31;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise31Switch
{

    public static void main(String[] args)
    {
        /* Menu de Operações Bancárias: Monte um programa que receba um código
        numérico de 1 a 4. Exiba a ação correspondente: 1 para "Consultar Saldo", 2 para
        "Efetuar Depósito", 3 para "Efetuar Saque" e 4 para "Encerrar Atendimento".
        Tratando também qualquer opção fora dessa faixa como "Opção Inválida". */
        
        Scanner sc = new Scanner(System.in);
        
        int opcaoUsuario = -1;
        
        System.out.println("---------- MENU DE SELEÇÃO ---------------");
        System.out.println("Digite o número referente a opção: ");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Efetuar Depósito");
        System.out.println("3 - Efetuar Saque");
        System.out.println("4 - Encerrar Atendimento");
        opcaoUsuario = sc.nextInt();
        sc.close();
        
        switch(opcaoUsuario)
        {
            case 1:
                System.out.println("Consultando Saldo...");
                System.out.println("Saldo: +XXX.XXX,XX");
                break;
            case 2: 
                System.out.println("Efetuando Depósito...");
                System.out.println("Valor depositado: XXX.XXX,XX");
                break;
            case 3: 
                System.out.println("Efetuando Saque...");
                System.out.println("Valor sacado: XXX.XXX,XX");
                break;
            case 4:
                System.out.println("Atendimento Encerrado!");
                break;
            default:
                System.out.println("Opção inválida!");
                System.out.println("TENTE NOVAMENTE!");
        }
        
        System.out.println("==========================================");
        
    }
    
}
