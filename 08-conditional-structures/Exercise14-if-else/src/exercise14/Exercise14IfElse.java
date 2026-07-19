package exercise14;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise14IfElse
{

    public static void main(String[] args)
    {
        /* Calculadora de Operações Básicas: Receba dois números decimais e um caractere
        representando uma operação matemática (+, -, *, /). Calcule e exiba o resultado, tratando
        explicitamente o erro de divisão por zero caso o segundo número seja 0. */ 
        
        Scanner sc = new Scanner(System.in);
        
        double num1;
        double num2;
        char operador;
        
        double resultado;
        
        
        System.out.println("- - - - Realizando calculo - - - -");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Digite o operador (+, -, *, /): ");
        operador = sc.nextLine().charAt(0);
        
        sc.close();
        
        
        if(operador == '*')  
        {
            resultado = num1 * num2;
            
            System.out.println("========================");
            System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, resultado);
            System.out.println("========================");
        }
        else if(operador == '+')
        {
            resultado = num1 + num2;
            
            System.out.println("========================");
            System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, resultado);
            System.out.println("========================");
        }
        else if(operador == '-')
        {
            resultado = num1 - num2;
            
            System.out.println("========================");
            System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, resultado);
            System.out.println("========================");
        }
        else if(operador == '/')
        {
            if(num2 == 0.0)
            {
                System.out.println("=========================");
                System.out.println("O resultado da conta é 0!");
                System.out.println("=========================");
            }
            else
            {
                resultado = num1 / num2;
                
                System.out.println("=========================");
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, resultado);
                System.out.println("=========================");
            }
            
        }
        else
        {
            System.out.println("=========================");
            System.out.println("Operador ou valor inválido!");
            System.out.println("TENTE NOVAMENTE!");
            System.out.println("=========================");
        }
            
        
    }
    
}
