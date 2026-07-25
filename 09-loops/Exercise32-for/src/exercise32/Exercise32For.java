package exercise32;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise32For
{

    public static void main(String[] args)
    {
        /* Leia um número de iterações N. A cada ciclo do for, leia 3 notas e calcule 
        a média ponderada delas considerando pesos fixos (2, 3 e 5). Exiba o resultado 
        de cada aluno. */
        
        Scanner sc = new Scanner(System.in);

        int qtdAlunos = 0;
        
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double media = 0.0;
        
        
        System.out.println("============= LEITOR DE NOTAS ================");
        System.out.println("Digite a quantidade de alunos na turma: ");
        qtdAlunos = sc.nextInt();
        
        System.out.printf("\n");
        
        
        for(int i = 1; i <= qtdAlunos; i++)
        {
           
            System.out.printf("Digite a 1ª nota para o %dº aluno: ", i);
            nota1 = sc.nextDouble();

            System.out.printf("Digite a 2ª nota para o %dº aluno: ", i);
            nota2 = sc.nextDouble();

            System.out.printf("Digite a 3ª nota para o %dº aluno: ", i);
            nota3 = sc.nextDouble();

            media = ((nota1*0.2) + (nota2*0.3) + (nota3*0.5));
            System.out.println("===============================");
            System.out.printf("Media do aluno %d: %.2f\n", i, media);
            System.out.println("===============================");  
            
        }
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
          
    }
    
}
