package exercise14.not;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise14Not
{

    public static void main(String[] args)
    {
        /* Relatório de Falhas: No backend, precisamos mapear uma flag de erro de autenticação.
        Crie uma lógica que aponte verdadeiro para erro se NÃO tivermos as duas credenciais
        válidas (usuário e senha) confirmadas ao mesmo tempo. */
        
        Scanner sc = new Scanner(System.in);
        
        String userSystem = "admin";
        String passwordSystem = "1234a";
        
        String verifyUser = "";
        String verifyPassword = "";
        
        
        System.out.println("- - - - - - - LOGIN - - - - - -");
        System.out.println("Digite o nome de usuário: ");
        verifyUser = sc.nextLine();
        
        System.out.println("Digite a senha: ");
        verifyPassword = sc.nextLine();
        
        sc.close();
        
        boolean isErro = !(verifyUser.equals(userSystem) && (verifyPassword.equals(passwordSystem)));
        
        System.out.println("====================================");
        System.out.println("Houve erro em algum dado de login? ");
        System.out.println("Resposta do programa: "+isErro);
        System.out.println("====================================");
    }
    
}
