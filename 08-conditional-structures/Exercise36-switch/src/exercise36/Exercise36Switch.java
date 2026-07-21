package exercise36;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise36Switch
{

    public static void main(String[] args)
    {
        /* Sistema de Avaliação por Conceito: Crie um leitor que receba uma letra
        representando um conceito ('A', 'B', 'C', 'D', 'E') e imprima uma mensagem
        motivacional ou explicativa referente ao desempenho correspondente. */
        
        
        Scanner sc = new Scanner(System.in);
        
        
        char opcao;
        
        System.out.println("====================== DESEMPENHO ========================");
        System.out.println("Digite uma leta referente ao desempenho(A, B, C, D ou E): ");
        opcao = sc.nextLine().toUpperCase().charAt(0);
        sc.close();
        
        switch(opcao)
        {
            case 'A':
                System.out.println("Vocẽ foi incrível!");
                break;
                
            case 'B':
                System.out.println("Você mandou bem!");
                break;
                
            case 'C':
                System.out.println("você está indo bem!");
                break;
                
            case 'D':
                System.out.println("Não foi muito bom, mas está no caminho certo!");
                break;
                
            case 'E':
                System.out.println("Seu desempenho foi ruim, mas você consegue melhorar!");
                break;
                
            default:
                System.out.println("Caracter Inválido!");
                System.out.println("TENTE NOVAMENTE!");
        }
        
        System.out.println("==========================================================");
    }
    
}
