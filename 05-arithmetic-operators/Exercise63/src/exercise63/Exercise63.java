package exercise63;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise63
{
    public static void main(String[] args)
    {
        /*
        Escreva um código que receba a base e a alturade um retângulo, calcule 
        sua área e exiba na tela. Fórmula: área=base X altura
        */
        
        Scanner sc = new Scanner(System.in);
        
        double base;
        double altura;
        
        System.out.println("Calculando área de um retângulo.");
        System.out.println("Digite o valor total da base do retângulo: ");
        base = sc.nextDouble();
        
        System.out.println("Digite o valor total da altura do retângulo: ");
        altura = sc.nextDouble();
        
        sc.close();
        
        double area = base * altura;
        
        System.out.println("Área do retângulo: "+area);
        
    }
    
}
