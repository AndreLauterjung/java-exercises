package exercise41;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise41 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Salário Líquido: Calcule o salário bruto, subtraia 11% de INSS e, do que sobrar, retire R$ 150,00 de sindicato.
        
        double inss = 11.0, sindicato = 150.0, salarioFinal, salarioSemDesc;
        
        System.out.println("Digite o salário total (sem descontos): ");
        salarioSemDesc = sc.nextDouble();
        
        salarioFinal = salarioSemDesc - ((inss/100)*salarioSemDesc);
        salarioFinal = salarioFinal - sindicato;
        
        System.out.println("O seu salário final é de R$ "+salarioFinal);
    }
    
}
