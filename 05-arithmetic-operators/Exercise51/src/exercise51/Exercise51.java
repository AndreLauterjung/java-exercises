package exercise51;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise51
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int x;
        /*01. Cenário A (Pós-Incremento): Receba um número inteiro do usuário. 
        Atribua esse valor a uma nova variável utilizando o operador de pós-incremento (x++). Imprima o valor de
        ambas as variáveis e explique, via comentário no código, o comportamento da memória.*/
        
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        x = num++; // Primeiro ocorre a atribuição, depois o incremento.
        
        System.out.println("num: "+num);
        System.out.println("x: "+x);
        
        /* -> num (valor) incremento ++
        
        Primeiro, o valor de num foi atribuído à variável x, ou seja, 5
        Após a atribuição, foi incrementado +1 na variável num, que passou a 
        ter o valor 6. 
        
        Então, quando o resultado foi mostrado na tela, o x recebeu o valor de num
        antes do incremento e o num teve seu valor incrementado em 1. */



    }
    
}
