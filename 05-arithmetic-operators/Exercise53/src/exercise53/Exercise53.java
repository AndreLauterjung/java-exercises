package exercise53;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise53 
{

    public static void main(String[] args) 
    {      
        Scanner sc = new Scanner(System.in);
        
        int numItem = 0;
        /* Cenário C (Pós-Decremento): Receba um número inteiro que representa o estoque de
        um produto. Realize uma operação de pós-decremento (x--) dentro da própria instrução de
        impressão na tela. Na linha seguinte, imprima o valor final da variável para evidenciar a
        alteração.*/
        
        System.out.println("Digite o número de itens no estoque: ");
        numItem = sc.nextInt();
        
        System.out.println(numItem--);
        System.out.println(numItem);
        
        /* Aqui ocorreu o inverso do pós-incremento
        primeiro foi mostrado o valor na tela e após isso ocorreu o decremento.
        
        No println seguinte o valor já está atualizado. */

    }
    
}
