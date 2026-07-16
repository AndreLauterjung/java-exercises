package exercise35;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise35
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Calcule a área de um trapézio: ((baseMaior + baseMenor) * altura) / 2.0.
        
        double area, baseMaior, baseMenor, altura;
        
        System.out.println("Calculando área do trapézio.");
        System.out.println("Digite o valor da base maior do trapézio (em cm): ");
        baseMaior = sc.nextDouble();
        
        System.out.println("Digite o valor da base menor do trapézio (em cm):");
        baseMenor = sc.nextDouble();
        
        System.out.println("Digite o valor da altura do trapézio (em cm):");
        altura = sc.nextDouble();
        
        area = ((baseMaior + baseMenor) * altura) / 2.0;
        
        System.out.printf("A área do trapézio é de %.2f centímetros!\n", area);
        
    }
    
}
