package exercise39;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise39
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Calcule o gasto de combustível: (distancia / consumoMedio) * precoLitro.
        
        double precoLitro = 6.10, distancia, consumoMedio, valFinal;
        
        System.out.println("Digite a distancia a ser percorrida em km: ");
        distancia = sc.nextDouble();
        
        System.out.println("Digite o consumo médio de combustível por km rodado: ");
        consumoMedio = sc.nextDouble();
        
        valFinal = (distancia / consumoMedio) * precoLitro;
        
        System.out.println("Considerando que o veículo gaste 0,9L por km e o valor do combustível seja R$ "+precoLitro);
        System.out.printf("Será necessário gastar R$ %.2f com combustível para percorrer %.2f km.\n", valFinal, distancia);
    }
    
}
