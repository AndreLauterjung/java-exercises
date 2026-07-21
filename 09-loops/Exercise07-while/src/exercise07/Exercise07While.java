package exercise07;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise07While
{

    public static void main(String[] args)
    {
        /* Adivinhe o Número: Gere um número alvo estático (ex: 42). Peça palpites ao
        usuário dentro de um while que só encerra quando o palpite for exatamente igual
        ao número alvo. */
        
        Scanner sc = new Scanner(System.in);
        
        int numCorreto = 270;
        int numUsuario = 0;
        
        boolean isFuncionando = true;
        
        while(isFuncionando)
        {
            System.out.println("========= Acerte o número =======");
            System.out.println("Digite um número inteiro: ");
            numUsuario = sc.nextInt();
            
            if(numUsuario == numCorreto)
            {
                System.out.println("VOCÊ ACERTOU O NÚMERO!!!");
                isFuncionando = false;
            }
            else
            {
                System.out.println("Você errou...");
            }  
                
        }
           
    }
    
}
