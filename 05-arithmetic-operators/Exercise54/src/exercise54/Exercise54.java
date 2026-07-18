package exercise54;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise54
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        /* Cenário D (Pré-Decremento): Receba um número inteiro qualquer. Aplique o operador
        de pré-decremento (--x) consecutivamente três vezes dentro de instruções de impressão
        separadas, mostrando a redução instantânea a cada linha. */
        
        
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        System.out.println("Valor 1: "+ --num);
        System.out.println("Valor 2: "+ --num);
        System.out.println("Valor 3: "+ --num);
        
        /* Neste operador, ocorre o inverso do operador de pŕe-incremento (++x)
        primeiro é subtraído 1 da variável e depois o valor atualizado é mostrado
        na tela.
        
        É como se o programa estivesse lendo e dizendo: "Oopa, tenho que fazer 
        esse cálculo antes de terminar a linha". Ou seja, primeiro faz o calculo 
        e depois o valor é mostrado na tela.
        
        No incremento primeiro é mostrado o valor e só depois o programa faz o calculo, 
        que é o incremento. "
        */
    }
    
}
