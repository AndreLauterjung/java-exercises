package exercise07;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise07
{

    public static void main(String[] args)
    {
        /* Catraca de Portaria: A liberação de um funcionário pode ocorrer por dois métodos de
        identificação. Receba o status da leitura biométrica e do cartão físico, autorizando o acesso
        se a biometria for verdadeira OU se o cartão for válido. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isBiometriaValida = false;
        boolean isCartaoValido = false;
        
        System.out.println("- - - - Verificando métodos de entrada... - - - - "); 
        System.out.println("Você possui biometria registrada válida? (Digite \"sim\" ou \"não\")");
        String verificandoBiometria = sc.nextLine();
        
        isBiometriaValida = verificandoBiometria.equalsIgnoreCase("sim");
        
        System.out.println("Você possui cartão físico com dados ativos? (Digite \"sim\" ou \"não\")");
        String verificandoCartao = sc.nextLine();
        isCartaoValido = verificandoCartao.equalsIgnoreCase("sim");
        
        sc.close();
        
        
        boolean isEntradaAprovada = isCartaoValido || isBiometriaValida;
        
        System.out.println("=============================");
        System.out.println("A entrada foi validada? ");
        System.out.println("Resposta do programa: "+isEntradaAprovada);
        System.out.println("=============================");
        
    }
    
}
