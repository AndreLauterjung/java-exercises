package exercise62;

import java.util.Scanner;
        
/**
 *
 * @author andrelauterjung
 */
public class Exercise62
{

    public static void main(String[] args)
    {
        /*
        Escreva um código que receba o tamanho do lado de um quadrado, calcule 
        sua área e exiba na tela. fórmula: área=lado X lado
        */
        
        Scanner sc = new Scanner(System.in);
        double lado;
        
        System.out.println("Digite o tamanho do lado do quadrado: ");
        lado = sc.nextDouble();
        
        sc.close();
        
        double area = lado * lado;
        
        System.out.println("Área do quadrado: "+area);
        
    }
    
}
