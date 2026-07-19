package exercise17;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise17IfElse
{

    public static void main(String[] args)
    {
        /* Reajuste Salarial de RH: Uma empresa precisa atualizar sua folha de pagamento.
        Receba o salário atual de um funcionário: se o salário for de até 2000.00, aplique um
        reajuste de 15%; se for superior, aplique 10%. Exiba o valor do aumento e o novo salário. */
        
        
        Scanner sc = new Scanner(System.in);
        
        double salario = -1.0;
        double reajusteQuinze = 15.0;
        double reajusteDez = 10.0;
        
        
        System.out.println("- - - - - Verificando reajuste no salário - - - - - -");
        System.out.println("Digite o seu salário: ");
        salario = sc.nextDouble();
        
        if(salario <= 2000.0)
        {
            salario = salario + ((reajusteQuinze/100)*salario);
            
            System.out.println("======================================");
            System.out.println("O seu salário teve um reajuste de 15%! ");
            System.out.printf("Seu salário: R$ %.2f\n", salario);
            System.out.println("======================================");
        }
        else
        {
            salario = salario + ((reajusteDez/100)*salario);
            
            System.out.println("=======================================");
            System.out.println("O seu salário teve um reajuste de 10%! ");
            System.out.printf("Seu salário: R$ %.2f\n", salario);
            System.out.println("=======================================");
        }
        
    }
    
}
