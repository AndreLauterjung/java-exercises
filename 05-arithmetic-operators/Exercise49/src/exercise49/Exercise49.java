package exercise49;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise49
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Conversão Composta: Converta um valor de Reais para Dólares e, do resultado em dólares, converta para Euros.
    
        double dolar = 5.12, valReal, convRealDol;
    
        // real para dolar
        System.out.println("Digite o valor em reais para converter para dolar: ");
        valReal = sc.nextDouble();
    
        convRealDol = valReal / dolar;
        
        System.out.printf("Quantidade de dólares: US$ %.2f\n", convRealDol);
        
        // Dólar para euro
        double euro = 0.87, convDolEu;
        
        convDolEu = convRealDol / euro;
        
        System.out.println("Convertendo dólar para euro...");
        System.out.printf("Quantidade de euros: EU$ %.2f\n", convDolEu);
        
    }
    
}
