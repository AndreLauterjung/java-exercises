package exercise30;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise30Ternary
{

    public static void main(String[] args)
    {
        /* Aninhamento de Ternários (Status de Sinais): Escreva uma expressão com operadores
        ternários aninhados (um dentro do outro) para avaliar um número inteiro. A expressão deve
        retornar e armazenar em uma String se o número avaliado é "Positivo", "Negativo" ou
        "Zero" em uma única linha de comando. */
        
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("- - - - - - Verificando número - - - - - -");
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        
        
        String resultado = (num > 0) ? "É número positivo"
                : (num < 0) ? "É número negativo": "O número é 0";
        
        
        System.out.println("======================");
        System.out.println(resultado);
        System.out.println("======================");    
        
    }
    
}
