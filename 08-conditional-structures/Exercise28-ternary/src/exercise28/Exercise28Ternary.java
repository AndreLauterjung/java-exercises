package exercise28;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise28Ternary
{

    public static void main(String[] args)
    {
        /* Tributação Simplificada: Crie um sistema de cálculo fiscal rápido. Se o salário bruto
        recebido for maior que 5000.00, a variável decimal aliquota deve receber o valor 0.15
        (15%); caso contrário, deve receber 0.05 (5%). Monte a estrutura em uma única atribuição
        linear. */
        
        Scanner sc = new Scanner(System.in);
        
        double salarioBruto = -1.0;
        double novoSalarioQuinze = -1.0;
        double novoSalarioCinco = -1.0;
        
        double quinzeP = 15.0;
        double cincoP = 5.0;
        
        System.out.println(" - - - - - Tributação - - - - - - - -");
        System.out.println("Digite o seu salário bruto: ");
        salarioBruto = sc.nextDouble();
        sc.close();
        
        
        novoSalarioQuinze = salarioBruto - ((quinzeP/100.0)*salarioBruto);
        novoSalarioCinco = salarioBruto - ((cincoP/100.0)* salarioBruto);
        
        
        double resultado = (salarioBruto > 5000.0) ? novoSalarioQuinze : novoSalarioCinco;
        
        System.out.printf("Salário final: R$ %.2f\n", resultado);
              
    }
    
}
