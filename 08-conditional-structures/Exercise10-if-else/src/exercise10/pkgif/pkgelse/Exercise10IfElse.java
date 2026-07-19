package exercise10.pkgif.pkgelse;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise10IfElse
{

    public static void main(String[] args)
    {
        /* Sensação Térmica Comercial: Receba a temperatura atual em graus Celsius e exiba
        Frio se for menor que 15°C, Quente se for maior que 30°C ou Agradável se estiver
        entre as duas faixas. */
        
        Scanner sc = new Scanner(System.in);
        
        
        double temperatura = -1.0;
        double frio = 15.0;
        double quente = 30.0;
        
        System.out.println("- - - Verificando temperatura - - - ");
        System.out.println("Digite a temperatura (em ºC): ");
        temperatura = sc.nextDouble();
        
        sc.close();
        
        if(temperatura < frio)
        {
            System.out.println("=====================");
            System.out.println("Está frio!");
            System.out.println("Temperatura: "+temperatura+" ºC");
            System.out.println("=====================");
        }
        else if(temperatura > quente)
        {
            System.out.println("=====================");
            System.out.println("Está quente!");
            System.out.println("Temperatura: "+temperatura+" ºC");
            System.out.println("=====================");
        }
        else
        {
            System.out.println("=====================");
            System.out.println("Está agradável!");
            System.out.println("Temperatura: "+temperatura+" ºC");
            System.out.println("=====================");
        }
        
    }
    
}
