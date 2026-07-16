package exercise24;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise24 
{

    public static void main(String[] args)
    {
        // Calcule a área de um triângulo (base * altura / 2.0).
        
        Scanner sc = new Scanner (System.in);
        
        double area, base, altura;
        
        System.out.println("Calculando área de um triângulo.");
        
        System.out.println("Digite o valor da base do triângulo em cm: ");
        base = sc.nextDouble();
        
        System.out.println("Digite o valor da altura do triângulo em cm: ");
        altura = sc.nextDouble();
        
        area = ((base * altura) /2.0);
        
        System.out.printf("Base do triângulo: %.2f cm\n", base);
        System.out.printf("Altura do triângulo: %.2f cm\n", altura);
        System.out.printf("O triângulo possui uma área de %.2f centímetros!\n", area);
    
    
    }
    
}
