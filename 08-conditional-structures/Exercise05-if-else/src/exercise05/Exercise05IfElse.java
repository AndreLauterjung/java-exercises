package exercise05;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise05IfElse
{

    public static void main(String[] args)
    {
        /* Calendário Bissexto: Receba um ano inteiro e informe se ele é "Bissexto" ou "Não
        Bissexto" avaliando a regra básica de divisibilidade por 4. */
        
        Scanner sc = new Scanner(System.in);
        
        int ano = -1000;
        
        
        System.out.println("- - - Verificando se é ou não Ano Bissexto - - -");
        System.out.println("Digite um ano: ");
        ano = sc.nextInt();
        
        sc.close();
        
        if(ano % 4 == 0)
        {
            System.out.println("==============================");
            System.out.printf("O ano de %d é Ano Bissexto!\n", ano);
            System.out.println("==============================");
        }
        else
        {
            System.out.println("=================================");
            System.out.printf("O ano de %d não é Ano Bissexto!\n", ano);
            System.out.println("=================================");
        }
        
    }
    
}
