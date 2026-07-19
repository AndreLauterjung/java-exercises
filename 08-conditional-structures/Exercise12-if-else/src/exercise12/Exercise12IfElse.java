package exercise12;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise12IfElse
{

    public static void main(String[] args)
    {
        /* Classificador de IMC: Solicite o peso (kg) e a altura (metros) de uma pessoa. Calcule o
        Índice de Massa Corporal (IMC) e exiba a classificação oficial: Abaixo do peso (<18.5),
        Normal (18.5-24.9), Sobrepeso (25-29.9) ou Obesidade (>=30). */
        
        Scanner sc = new Scanner(System.in);
        
        
        double peso = -1.0;
        double altura = -1.0;
        double imc = -1.0;
        
        System.out.println("- - - - - Calculando Índice de Massa Corporal - - - - -");
        System.out.println("Digite o seu peso: ");
        peso = sc.nextDouble();
        
        System.out.println("Digite a sua altura (em metros): ");
        altura = sc.nextDouble();
        
        sc.close();
        
        
        imc = peso / (altura*altura);
        
        if(imc < 18.5)
        {
            System.out.println("============================================================");
            System.out.printf("O seu IMC é de %.1f | CLASSIFICAÇÃO: Abaixo do peso!\n", imc);
            System.out.println("============================================================");
        }
        else if(imc >= 18.5 && imc <=24.9)
        {
            System.out.println("============================================================");
            System.out.printf("O seu IMC é de %.1f | CLASSIFICAÇÃO: Normal!\n", imc);
            System.out.println("============================================================");
        }
        else if(imc >= 25 && imc <= 29.9)
        {
            System.out.println("============================================================");
            System.out.printf("O seu IMC é de %.1f | CLASSIFICAÇÃO: Sobrepeso!\n", imc);
            System.out.println("============================================================");
        }
        else
        {
            System.out.println("============================================================");
            System.out.printf("O seu IMC é de %.1f | CLASSIFICAÇÃO: Obesidade!\n", imc);
            System.out.println("============================================================");
        }
        
    }
    
}
