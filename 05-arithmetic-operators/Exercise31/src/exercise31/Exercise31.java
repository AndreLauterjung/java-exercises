package exercise31;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise31 
{

    public static void main(String[] args)
    {
        double metroCentimetros = 100.0, distancia, conversao;
        
        Scanner sc = new Scanner(System.in);
        // Converta uma distância de metros para centímetros.

        
        System.out.println("Conversor de distâncias.");
        System.out.println("Digite a distancia em metros para converter o valor para centímetros: ");
        distancia = sc.nextDouble();
        
        conversao = distancia * metroCentimetros;
        
        System.out.printf("%.2f metros = %.2f centímetros!\n", distancia, conversao);
        
    }
    
}
