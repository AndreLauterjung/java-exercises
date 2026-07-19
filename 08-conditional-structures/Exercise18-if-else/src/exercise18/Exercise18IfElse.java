package exercise18;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise18IfElse
{

    public static void main(String[] args)
    {
        /* Conversor de Escalas Térmicas: Pergunte ao usuário qual conversão ele deseja
        realizar: (1) Celsius para Fahrenheit ou (2) Fahrenheit para Celsius. Receba a opção
        escolhida, o valor da temperatura e realize o cálculo matemático correspondente para a
        escala selecionada. */
        
        Scanner sc = new Scanner(System.in);
        
        int opcao = -1;
        
        
        System.out.println("- - - - - CONVERSOR DE TEMPERATURAS - - - - - -");
        
        System.out.println("Digite a opção de conversão: ");
        System.out.println("1 - Celsius para Fahrenheit.");
        System.out.println("2 - Fahrenheit para Celsius.");
        opcao = sc.nextInt();
        
        if(opcao == 1)
        {
            System.out.println("-----------------------------------");
            System.out.println("Digite a temperatura (em ºC): ");
            double temperaturaC = sc.nextDouble();
            
            double cParaFah = (temperaturaC * (9.0 / 5.0)) + 32;
            System.out.println("=============================");
            System.out.println("Temperatura convertida!");
            System.out.printf("%.2f ºC = %.2f ºF !\n", temperaturaC, cParaFah);
            System.out.println("=============================");
        }
        else if(opcao == 2)
        {
            System.out.println("-----------------------------------");
            System.out.println("Digite a temperatura (em ºF): ");
            double temperaturaF = sc.nextDouble();
            
            double fahParaC = (temperaturaF - 32)* 5/9;
            System.out.println("=============================");
            System.out.println("Temperatura convertida!");
            System.out.printf("%.2f ºF = %.2f ºC !\n", temperaturaF, fahParaC);
            System.out.println("=============================");
        }
        else
        {
            System.out.println("=====================");
            System.out.println("Valor inválido!");
            System.out.println("TENTE NOVAMENTE!");
            System.out.println("=====================");
        }
        
    }
    
}
