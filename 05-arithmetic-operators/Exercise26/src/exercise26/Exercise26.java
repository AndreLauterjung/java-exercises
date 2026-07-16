package exercise26;

import java.util.Scanner;

/**
 *
 * @author andrelauterjung
 */
public class Exercise26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Calcule o Índice de Massa Corporal (IMC): peso / (altura * altura).
        
        double peso, altura, IMC;
        
        System.out.println("Calculando o IMC (Índice de Massa Corporal.");
        
        System.out.println("Digite o seu peso (Exmplo: 80,2): ");
        peso = sc.nextDouble();
        
        System.out.println("Digite a sua altura (Exemplo: 1,80): ");
        altura = sc.nextDouble();
        
        IMC = peso / (altura * altura);
        
        System.out.printf("O seu IMC é de: %.2f !\n", IMC);
    
    }
    
}
