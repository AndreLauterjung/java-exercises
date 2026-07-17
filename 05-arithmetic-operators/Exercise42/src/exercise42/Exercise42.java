package exercise42;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise42
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Consumo de Viagem: Calcule a quantidade de litros necessária para uma viagem
        // (Km / Consumo) e o custo total baseado no preço do combustível.]
        
        double precoCombustivel = 5.30, distanciaTotal, litroKm, quantidadeLitros, custoTotal;
        
        System.out.println("Digite a distancia total em km para o destino: ");
        distanciaTotal = sc.nextDouble();
        
        System.out.println("Digite o total de combustível que o veículo consome por km (em litros): ");
        litroKm = sc.nextDouble();
        
        quantidadeLitros = (distanciaTotal/litroKm);
        custoTotal = quantidadeLitros * precoCombustivel;
        
        System.out.println("Quantidade total de litros que serão gastos na viagem: "+quantidadeLitros+" L.");
        System.out.println("Custo total com combustível: R$ "+custoTotal);
    }
    
}
