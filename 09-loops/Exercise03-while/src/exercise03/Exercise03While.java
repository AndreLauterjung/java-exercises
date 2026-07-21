package exercise03;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise03While
{

    public static void main(String[] args)
    {
        /* Jogo da Senha Secreta: Defina uma senha numérica no seu código. Solicite a
        senha ao usuário repetidamente enquanto a entrada digitada for diferente do valor
        correto. */
        
        Scanner sc = new Scanner(System.in);
        
        
        int senhaUsuario = 0;
        int senhaPrograma = 3211;
        
        
        while(senhaUsuario != senhaPrograma)
        {
            System.out.println("=============================");
            System.out.println("Digite a senha correta: ");
            senhaUsuario = sc.nextInt();
            
            if(senhaUsuario != senhaPrograma)
            {
                System.out.println("SENHA INCORRETA!");
                System.out.println("TENTE NOVAMENTE!");
            }
            else
            {
                System.out.println("LOGIN AUTORIZADO!");
                System.out.println("=============================");
            }
        }
      
    }
    
}
