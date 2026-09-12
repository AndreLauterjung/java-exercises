package exercise64;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise64
{

    public static void main(String[] args)
    {
        /*
        Escreva um código que receba o nome e a idade de 2 pessoas e imprima a 
        diferença de idade entre elas.
        */
        
        Scanner sc = new Scanner(System.in);
        
        int idade1;
        int idade2;
        int diferencaIdade;
        
        System.out.println("Calculando a diferença de idade.");
        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();
        
        System.out.println("Digite a idade da segunda pessoa: ");
        idade2 = sc.nextInt();
        
        sc.close();
        
        diferencaIdade = idade1 - idade2;
        
        System.out.println("Diferença de idade da primeira pessoa para a segunda: "+diferencaIdade);
        
    }
    
}
