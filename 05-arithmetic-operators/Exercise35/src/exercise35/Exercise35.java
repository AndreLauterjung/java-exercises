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
        // Determine a velocidade média: distanciaTotal / tempoGasto.
        
        double velocidadeMedia, distanciaTotal, tempoGasto;
        
        
        System.out.println("Digite a distancia total percorrida (em km): ");
        distanciaTotal = sc.nextDouble();
        
        System.out.println("Digite o tempo gasto em horas para percorrer a distancia: ");
        tempoGasto = sc.nextDouble();
        
        velocidadeMedia = distanciaTotal / tempoGasto;
        
        System.out.printf("A velocidade média do veículo é de %.2f km por hora\n", velocidadeMedia);
        
        
    }
    
}
