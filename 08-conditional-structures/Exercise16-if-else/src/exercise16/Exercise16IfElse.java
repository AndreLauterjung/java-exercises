package exercise16;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise16IfElse
{

    public static void main(String[] args)
    {
        /*Classificação de Triângulos II: Expanda o exercício anterior. Caso os lados formem um
        triângulo válido, adicione uma lógica aninhada para classificá-lo em Equilátero (todos os
        lados iguais), Isósceles (dois lados iguais) ou Escaleno (todos os lados diferentes). */
        
        
        Scanner sc = new Scanner(System.in);
        
        
        double lado1 = -1.0;
        double lado2 = -1.0;
        double lado3 = -1.0;
        
        System.out.println("- - - - - Verificando se é triângulo - - - - -");
        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = sc.nextDouble();
        
        System.out.println("Digite o valor do segundo lado: ");
        lado2 = sc.nextDouble();
        
        System.out.println("Digite o valor do terceiro lado: ");
        lado3 = sc.nextDouble();
        
        sc.close();
        
        double soma1 = lado1 + lado2;
        double soma2 = lado2 + lado3;
        double soma3 = lado1 + lado3;
        
        
        if(lado1 < soma2 && lado1 < soma2 && lado3 < soma1)
        {
            System.out.println("================================================");
            System.out.println("Com base nos valores digitados, é um triângulo! ");
            System.out.println("================================================");
            
            if(lado1 == lado2 && lado1 == lado3)
            {
                System.out.println("============================");
                System.out.println("É UM TRIÂNGULO EQUILÁTERO!");
                System.out.println("============================");
            }
            else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1)
            {
                System.out.println("============================");
                System.out.println("É UM TRIÂNGULO ISÓSCELES!");
                System.out.println("============================");
            }
            else
            {
                System.out.println("============================");
                System.out.println("É UM TRIÂNGULO ESCALENO!");
                System.out.println("============================");
            } 
        }
        else
        {
            System.out.println("============================");
            System.out.println("Não é um triângulo! ");
            System.out.println("============================");
        }
        
        
    }
}
