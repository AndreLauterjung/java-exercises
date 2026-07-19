package exercise04;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise04IfElse
{

    public static void main(String[] args)
    {
        /* Média Escolar Simples: Receba duas notas bimestrais, calcule a média aritmética e
        exiba "Aprovado" se a nota for maior ou igual a 7.0, ou "Reprovado" caso contrário. */
        
        
        Scanner sc = new Scanner(System.in);
        
        double nota1 = -1.0;
        double nota2 = -1.0;
        double media = -1.0;
        
        
        System.out.println("- - - Verificando Aprovação - - -");
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        sc.close();
        
        media = (nota1+nota2)/2;
        
        if(media >= 7.0)
        {
            System.out.println("=======================================");
            System.out.printf("Sua nota foi %.2f, você está APROVADO!\n", media);
            System.out.println("=======================================");
        }
        else
        {
            System.out.println("========================================");
            System.out.printf("Sua nota foi %.2f, você está REPROVADO!\n", media);
            System.out.println("========================================");
        }
        
    }
    
}
