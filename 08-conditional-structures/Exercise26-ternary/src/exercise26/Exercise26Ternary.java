package exercise26;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise26Ternary
{

    public static void main(String[] args)
    {
        /* Otimização de Média Escolar: Pegue a lógica básica de validação escolar (Média 7.0
        para aprovação). Converta a estrutura condicional tradicional em uma linha de código
        utilizando o operador ternário para armazenar o status "Aprovado" ou "Reprovado" em uma
        String. */
            
        Scanner sc = new Scanner(System.in);
         
        double nota1 = -1.0;
        double nota2 = -1.0;
        double nota3 = -1.0;
        double nota4 = -1.0;
        
        double media = -1.0;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();
        
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        
        String resultado = (media >= 7.0)? "Você está aprovado!":"Você está reprovado!";
        
        System.out.println(resultado);
        System.out.printf("Média: %.2f\n", media);

        
    }
    
}
