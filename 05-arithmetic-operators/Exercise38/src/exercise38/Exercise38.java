package exercise38;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise38
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Converta Fahrenheit para Celsius: (F - 32) * 5 / 9.
        
        double conversao, tempFah;
        
        System.out.println("Digite a temperatura em ºF para a conversão: ");
        tempFah = sc.nextDouble();
        
        conversao = ((tempFah - 32) * 5)/9;
        
        System.out.printf("A temperatura convertida para Celsius é: %.2fºC\n", conversao);
        
    }
    
}
