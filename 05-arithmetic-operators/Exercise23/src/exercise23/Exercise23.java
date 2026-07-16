package exercise23;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise23
{

    public static void main(String[] args)
    {
    
        // Calcule a área de um retângulo (base * altura).
        
        Scanner sc = new Scanner(System.in);
        
        
        double area, base, altura;
        
        System.out.println("Digite o valor da base do retângulo em cm: ");
        base = sc.nextDouble();
        
        System.out.println("Digite o valor da altura do retângulo em cm: ");
        altura = sc.nextDouble();
        
        area = base * altura;
        
        System.out.printf("O retângulo possui uma área de %.2f centímetros!\n", area);
        
        
        
    }
    
}
