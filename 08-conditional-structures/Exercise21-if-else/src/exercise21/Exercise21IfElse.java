package exercise21;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise21IfElse
{

    public static void main(String[] args)
    {
        /* Login de Segurança Preciso: Crie um sistema de login que compare strings de
        credenciais. Se o nome de usuário digitado não existir no banco de dados fictício, exiba
        explicitamente "Usuário Inexistente". Se o usuário estiver correto, mas a senha estiver
        errada, exiba "Senha Incorreta". Mostre "Acesso Autorizado" apenas se ambos convergirem */
        
        Scanner sc = new Scanner(System.in);
        
        // banco de dados fictício
        String username1 = "JavaCode";
        String senhaUser1 = "java123java";
  
        // Variáveis para armazenar respostas do usuário
        String nomeDigitado = "";
        String senhaDigitada = "";
        
        
        System.out.println(" - - - - - - LOGIN - - - - - - - -");
        System.out.println("Digite seu nome de usuário: ");
        nomeDigitado = sc.nextLine();
        
        if(nomeDigitado.equals(username1))
        {
            System.out.println("Digite sua senha: ");       
            senhaDigitada = sc.nextLine();
            
            if(senhaDigitada.equals(senhaUser1))
            {
                System.out.println("LOGIN AUTORIZADO!");
                System.out.println("BEM-VINDO, "+nomeDigitado+" !");
            }
            else
            {
                System.out.println("X X X X X X X X X X X X");
                System.out.println("Senha inválida!");
                System.out.println("TENTE NOVAMENTE!");
                System.out.println("X X X X X X X X X X X X");
            }
        }
        else
        {
            System.out.println("X X X X X X X X X X X X X X X X X");
            System.out.println("Usuário Inexistente!");
            System.out.println("TENTE NOVAMENTE! ");
            System.out.println("X X X X X X X X X X X X X X X X X");
        }
        

    }
    
}
