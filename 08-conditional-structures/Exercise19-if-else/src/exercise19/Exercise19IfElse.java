package exercise19;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise19IfElse
{

    public static void main(String[] args)
    {
        /* Sistema Escolar por Conceito: Crie um algoritmo que converta notas numéricas em
        conceitos de histórico acadêmico. Notas entre 9.0 e 10.0 recebem conceito "A"; entre 7.0 e
        8.9 recebem "B"; entre 5.0 e 6.9 recebem "C"; notas abaixo de 5.0 recebem "D". */ 
        
        Scanner sc = new Scanner(System.in);
        
        double media = -1.0;
        
        double nota1 = -1.0;
        double nota2 = -1.0;
        double nota3 = -1.0;
        double nota4 = -1.0;
        
        
        System.out.println("- - - - - - Verificador de notas - - - - - - -");
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();
        
        sc.close();
        System.out.println("----------------------------------------------");
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        
        // Conceito para nota 1
        if(nota1 >= 9.0 && nota1 <= 10.0)
        {
            System.out.println("NOTA 1 = A");
        }
        else if(nota1 >= 7.0 && nota1 <= 8.9)
        {
            System.out.println("NOTA 1 = B");
        }
        else if(nota1 >= 5 && nota1 <= 6.9)
        {
            System.out.println("NOTA 1 = C");
        }
        else if(nota1 >= 0 && nota1 < 5)
        {
            System.out.println("NOTA 1 =  D");
        }
        else
        {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("TENTE NOVAMENTE!");
        }
        
        
        // Conceito para nota 2
        if(nota2 >= 9.0 && nota2 <= 10.0)
        {
            System.out.println("NOTA 2 = A");
        }
        else if(nota2 >= 7.0 && nota2 <= 8.9)
        {
            System.out.println("NOTA 2 = B");
        }
        else if(nota2 >= 5 && nota2 <= 6.9)
        {
            System.out.println("NOTA 2 = C");
        }
        else if(nota2 >= 0 && nota2 < 5)
        {
            System.out.println("NOTA 2 =  D");
        }
        else
        {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("TENTE NOVAMENTE!");
        }
        
        
        // Conceito para nota 3
        if(nota3 >= 9.0 && nota3 <= 10.0)
        {
            System.out.println("NOTA 3 = A");
        }
        else if(nota3 >= 7.0 && nota3 <= 8.9)
        {
            System.out.println("NOTA 3 = B");
        }
        else if(nota3 >= 5 && nota3 <= 6.9)
        {
            System.out.println("NOTA 3 = C");
        }
        else if(nota3 >= 0 && nota3 < 5)
        {
            System.out.println("NOTA 3 =  D");
        }
        else
        {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("TENTE NOVAMENTE!");
        }
        
        
        // Conceito para nota 4
        if(nota4 >= 9.0 && nota4 <= 10.0)
        {
            System.out.println("NOTA 4 = A");
        }
        else if(nota4 >= 7.0 && nota4 <= 8.9)
        {
            System.out.println("NOTA 4 = B");
        }
        else if(nota4 >= 5 && nota4 <= 6.9)
        {
            System.out.println("NOTA 4 = C");
        }
        else if(nota4 >= 0 && nota4 < 5)
        {
            System.out.println("NOTA 4 =  D");
        }
        else
        {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("TENTE NOVAMENTE!");
        }
        

        
        // Conceito pra a média das notaas
        if(media >= 9.0 && media <= 10.0)
        {
            System.out.println("MÉDIA: A");
        }
        else if(media >= 7.0 && media <= 8.9)
        {
            System.out.println("MÉDIA: B");
        }
        else if(media >= 5 && media <= 6.9)
        {
            System.out.println("MÉDIA: C");
        }
        else if(media >= 0 && media < 5)
        {
            System.out.println("MÉDIA: D");
        }
        else
        {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("TENTE NOVAMENTE!");
        }
        
        System.out.println("----------------------------------------------");
    }
    
}
