package exercise24;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise24For
{

    public static void main(String[] args)
    {
        /* Média da Turma: Solicite a quantidade de alunos em uma sala. Em seguida, utilize
        o for para ler a nota de cada um deles e, ao final, calcule e apresente a média da
        turma. */
        
        Scanner sc = new Scanner(System.in);
        
        
        int quantidadeAlunos = -1;
        double nota; 
        double somaNotas = 0;
        double media = -1;
        
        System.out.println("========== CALCULANDO MÉDIA DA TURMA ===========");
        System.out.println("Digite a quantidade de alunos na turma: ");
        quantidadeAlunos = sc.nextInt();
        
        for(int i = 1; i <= quantidadeAlunos; i++)
        {
            System.out.printf("Digite a nota do aluno %d: \n", i);
            nota = sc.nextDouble();
            somaNotas += nota;
            System.out.printf("Nota do aluno %d adicionada!\n\n", i);
            System.out.println("-------------------------------------------------");
        }
        sc.close();
        
        media = somaNotas / quantidadeAlunos;
        System.out.printf("Nota total da turma: %.2f\n", somaNotas);
        System.out.println("Quantidade de alunos: "+quantidadeAlunos);
        System.out.printf("Média da turma: %.2f", media);
        
        System.out.println("\n=================================================");
        System.out.println("============= PROGRAMA ENCERRADO ================");
        System.out.println("=================================================");
        
    }
    
}
