package exercise52;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise52
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int x;
        
        /* Cenário B (Pré-Incremento): Receba um número inteiro do usuário. Atribua esse valor
        a uma nova variável utilizando o operador de pré-incremento (++x). Imprima o valor de
        ambas as variáveis e compare o resultado com o exercício anterior.*/
        
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        x = ++num;
        
        System.out.println("Num: "+num);
        System.out.println("x: "+x);
        
        /* Neste cenário, primeiro ocorreu o incremento na variável num e depois
        a atribuição do valor à variável x
        
        como o programa "lê" da esquerda para a direita, o incremento ocorreu primeiro
        então primeiro num ficou com o valor 11 (foi digitado 10) e depois o 11
        foi atribuído à variavel x. E assim ambas ficaram com o mesmo valor. */
        
    }
    
}
