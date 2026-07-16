package exercise25;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise25
{
    public static void main(String[] args)
    {
    
        // Realize a média ponderada de 3 notas com pesos 2, 3 e 5.
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3, media;
        
        System.out.println("Calculando média de notas com pesos 2, 3 e 5.");
        
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
    
        media = (nota1 * (2.0/10.0)) + (nota2 * (3.0/10.0)) + (nota3 * (5.0/10.0));
                
        System.out.printf("Valor da nota 1: %.2f\n", nota1);
        System.out.printf("Valor da nota 2: %.2f\n", nota2);
        System.out.printf("Valor da nota 3: %.2f\n", nota3);
        System.out.printf("Média final: %.2f\n", media);
    }
    
}