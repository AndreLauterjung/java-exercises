package exercise36;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise36
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // Encontre a densidade demográfica: populacao / areaTotal.
        
        int densidadeDemografica, populacao, areaTotal;
        
        System.out.println("Calculando densidade demográfica de uma área.");
        System.out.println("Digite a área (em quilometros quadrados): ");
        areaTotal = sc.nextInt();
        
        System.out.println("Digite a quantidade de pessoas na área: ");
        populacao = sc.nextInt();
        
        densidadeDemografica = populacao / areaTotal;
        
        System.out.printf("Existem cerca de %d pessoas por quilometro quadrado na área digitada!\n", densidadeDemografica);
        
    }
    
}
