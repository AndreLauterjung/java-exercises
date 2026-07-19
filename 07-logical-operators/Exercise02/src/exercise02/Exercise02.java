package exercise02;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise02
{

    public static void main(String[] args)
    {
        /* Autenticação de Painel: O acesso ao servidor central requer credenciais exatas. Receba
        o nome de usuário e a senha numérica, verificando se o usuário é igual a "admin" E a senha
        corresponde ao código 123. */
        
        Scanner sc = new Scanner(System.in);
        
        String userSystem = "admin";
        String passwordUserSystem = "123";
      
        String dadosUsername = "";
        String dadosUserPassword = "";
        
        System.out.println("- - - - - LOGIN - - - - -");
        System.out.println("Digite seu nome de usuário: ");
        dadosUsername = sc.nextLine();
        
        System.out.println("Digite a sua senha: ");
        dadosUserPassword = sc.nextLine();
        
        sc.close();
        
        boolean isLoginAprovado = dadosUsername.equals(userSystem) && dadosUserPassword.equals(passwordUserSystem);
        
        System.out.println("===============================");
        System.out.println("Login aprovado? ");
        System.out.println("Resposta do sistema: "+isLoginAprovado);
        System.out.println("===============================");
        
    }
    
}
