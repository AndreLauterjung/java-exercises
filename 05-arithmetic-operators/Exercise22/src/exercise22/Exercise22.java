package exercise22;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise22
{

    public static void main(String[] args)
    {
        // Converta uma temperatura de Celsius para Fahrenheit: (C * 9 / 5) + 32.
        
        Scanner sc = new Scanner(System.in);
        
        double tempCelsius, tempFahrenheit;
        
        System.out.println("Digite a temperatura em graus celsius: ");
        tempCelsius = sc.nextDouble();
        
        tempFahrenheit = ((tempCelsius * 9) / 5) + 32;
        
        System.out.printf("A temperatura de %.1fºC convertida para Fahrenheit é de %.1fºF !\n", tempCelsius, tempFahrenheit);
    }
    
}
