package exercise21;

import java.util.Scanner;
        

/**
 *
 * @author andrelauterjung
 */
public class Exercise21 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Calcule a média aritmética de 4 notas escolares (garanta o resultado decimal).
    
        double nota1, nota2, nota3, nota4, mediaNotas;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();
    
        mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.printf("A sua média final é de: %.1f !\n", mediaNotas);
        
    }
    
}
