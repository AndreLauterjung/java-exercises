package exercise09;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise09IfElse
{

    public static void main(String[] args)
    {
        /* Simulador de Semáforo: Receba uma String representando a cor atual 
        de um semáforo (Verde, Amarelo, Vermelho). Exiba a ação correspondente 
        para o motorista: Siga, Atenção ou Pare. */
        
        
        Scanner sc = new Scanner(System.in);
        
        String corSemaforo = "";
        
        System.out.println("- - - Observando Semáforo - - -");
        System.out.println("Digite a cor atual do semáforo: ");
        corSemaforo = sc.nextLine();
        
        sc.close();
        
        if(corSemaforo.equalsIgnoreCase("vermelho"))
        {
            System.out.println("======");
            System.out.println("PARE!");
            System.out.println("=====");
        }
        else if(corSemaforo.equalsIgnoreCase("amarelo"))
        {
            System.out.println("========");
            System.out.println("ATENÇÃO!");
            System.out.println("========");
        }
        else if(corSemaforo.equalsIgnoreCase("verde"))
        {
            System.out.println("=====");
            System.out.println("SIGA!");
            System.out.println("=====");
        }
        else
        {
            System.out.println("XXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Você digitou errado!");
            System.out.println("TENTE NOVAMENTE!");
            System.out.println("XXXXXXXXXXXXXXXXXXXXX");
        }
        
    }
    
}
