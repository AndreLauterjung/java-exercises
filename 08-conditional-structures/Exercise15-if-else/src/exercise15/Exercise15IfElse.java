package exercise15;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise15IfElse
{
    
    public static void main(String[] args)
    {
        /* Validação de Triângulos I: Receba três valores numéricos representando os lados de
        uma figura geométrica. Verifique e informe se esses lados possuem dimensões matemáticas
        válidas para formar um triângulo (cada lado deve ser menor que a soma dos outros dois). */
        
        
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
        }
        else
        {
            System.out.println("Não é um triângulo! ");
        }
  
    }
}
