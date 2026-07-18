package exercise09;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise09
{

    public static void main(String[] args)
    {
        /* Alerta de Conta Negativa: Receba o saldo bancário atual de um cliente de backend e
        monte uma checagem relacional para descobrir se o saldo dele está abaixo de zero. */
        
        Scanner sc = new Scanner(System.in);
        
        double saldoAtual;
        
        boolean isAbaixoZero;
        
        System.out.println("****************************");
        System.out.println("Digite o seu saldo atual: ");
        saldoAtual = sc.nextDouble();
        
        sc.close();
        System.out.println("*****************************");
        
        isAbaixoZero = saldoAtual < 0.0;
        
        System.out.println("****************************************");
        System.out.println("O saldo do cliente está abaixo de zero? ");
        System.out.println("Resposta do programa: "+isAbaixoZero);
        System.out.println("*****************************************");
        
    }
    
}
