package exercise02;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise02
{

    public static void main(String[] args)
    {
        /* Validação de Caractere (ASCII): Receba um caractere via teclado. Crie uma expressão
        que compare se, por trás dos panos, o Java avalia esse caractere como sendo equivalente ao
        código numérico 65 (aplicando o conceito de casting implícito).*/
        
        Scanner sc = new Scanner(System.in);
        
        char letra;
        int convertChar;
        boolean isIgual;
        
        System.out.println("************************");
        System.out.println("Digite um caractere: ");
        letra = sc.nextLine().charAt(0); // Char na posição 0
        
        sc.close();
        System.out.println("************************************************");
        
        convertChar = (int) letra;
        isIgual = convertChar == 65;

        System.out.println("*****************************************************************");
        System.out.println("O caractere digitado corresponde ao número 65 na tabela ASCII? ");
        System.out.println("Reposta do programa: "+isIgual);
        System.out.println("*****************************************************************");
        
    }
    
}
