package exercise23;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise23IfElse
{

    public static void main(String[] args)
    {
        /* Cálculo de Imposto de Renda Comercial: Receba o salário bruto de um trabalhador e
        calcule o desconto do Imposto de Renda Retido na Fonte (IRRF) baseado em faixas
        simplificadas: até 2259.20 é Isento; de 2259.21 até 2826.65 desconte 7.5%; de 2826.66 até
        3751.05 desconte 15%; de 3751.06 até 4664.68 desconte 22.5%; e acima disso aplique
        27.5%. Exiba o imposto devido e o salário líquido final. */
        
        Scanner sc = new Scanner(System.in);
        
        double salarioT = -1.0; 
        double novoSalario = -1.0;
        
        double taxaI = 7.5;
        double taxaII = 15.0;
        double taxaIII = 22.5;
        double taxaIV = 27.5;
        
        System.out.println("- - - - - - Verificando salário - - - - - - -");
        System.out.println("Digite o seu salário bruto: ");
        salarioT = sc.nextDouble();
        
        sc.close();
        
        if(salarioT <= 2259.20)
        {
            System.out.println("Você está isento! ");
            System.out.printf("Seu salário: %.2f\n", salarioT);
        }
        else if(salarioT <= 2826.65)
        {
            novoSalario = salarioT - ((taxaI/100)*salarioT);
            System.out.println("Foi descontado 7.5% do seu salário! ");
            System.out.printf("Seu salário: %.2f\n", novoSalario);
        }
        else if(salarioT <= 3751.05)
        {
            novoSalario = salarioT - ((taxaII/100)*salarioT);
            System.out.println("Foi descontado 15% do seu salário! ");
            System.out.printf("Seu salário: %.2f\n", novoSalario);
        }
        else if(salarioT <= 4664.68)
        {
            novoSalario = salarioT - ((taxaIII/100)*salarioT);
            System.out.println("Foi descontado 22.5% do seu salário! ");
            System.out.printf("Seu salário: %.2f\n", novoSalario);
        }
        else if(salarioT > 4664.68)
        {
            novoSalario = salarioT - ((taxaIV/100)*salarioT);
            System.out.println("Foi descontado 27.5% do seu salário! ");
            System.out.printf("Seu salário: %.2f\n", novoSalario);
        }
        else
        {
            System.out.println("Valor inválido!");
            System.out.println("TENTE NOVAMENTE!");
        }
        System.out.println("********** PROGRAMA ENCERRADO ***************");
                
    }
    
}
