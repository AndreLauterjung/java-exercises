package exercise27;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise27Ternary
{

    public static void main(String[] args)
    {
        /* Captura de Extremo: Receba dois números inteiros distintos (n1 e n2). Escreva uma
        linha de código com operador ternário que filtre qual deles é o maior e atribua o valor
        diretamente a uma nova variável chamada int maior. */
        
        Scanner sc = new Scanner(System.in);
        
        
        int n1 = 0;
        int n2 = 0;
        
        String resposta1 = "O primeiro valor é maior do que o segundo!";
        String resposta2 = "O segundo valor é maior do que o primeiro!";
        String resposta3 = "Os números são iguais!";
        
        
        System.out.println("- - - - Verificando número maior - - - - ");
        System.out.println("Digite o primerio número: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        sc.close();
        
        String resultado = (n1>n2) ? resposta1
                : (n1<n2) ? resposta2: resposta3;
        
        
        System.out.println(resultado);
        
    }
    
}
