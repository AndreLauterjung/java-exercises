package exercise28;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise28
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Calcule o volume de uma caixa (comprimento * largura * altura).
        
        double volume, comprimento, largura, altura;
        
        System.out.println("Calculando volume de uma caixa.");
        
        System.out.println("Digite o comprimento da caixa em centímetros: ");
        comprimento = sc.nextDouble();
        
        System.out.println("Digite a largura da caixa em centímetros: ");
        largura = sc.nextDouble();
        
        System.out.println("Digite a altura da caixa em centímetros: ");
        altura = sc.nextDouble();
        
        volume = comprimento * altura * largura;
        
        System.out.printf("A caixa possui %.2f centímetros cúbicos!\n", volume);
       
    }
    
}
