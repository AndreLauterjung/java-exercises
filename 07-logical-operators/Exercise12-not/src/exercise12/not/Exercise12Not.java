package exercise12.not;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise12Not
{

    public static void main(String[] args)
    {
        /*  Status de Retenção: Crie um validador acadêmico utilizando a negação. A regra deve
        retornar verdadeiro apenas se o aluno NÃO preencher os critérios de reprovação (os critérios
        de reprovação são: média menor que 7.0 ou faltas acima de 10). */
        
        Scanner sc = new Scanner(System.in);
        
        double media = -1.0;
        int faltas = -1;
        
        
        System.out.println("- - -Verificador de média - - - ");
        System.out.println("Digite sua média: ");
        media = sc.nextDouble();
        
        System.out.println("Digite a quantidade de faltas: ");
        faltas = sc.nextInt();
        
        sc.close();
        
        boolean isReprovado = !(media > 7.0) || !(faltas <= 10);
                                   
        
        System.out.println("===========================");
        System.out.println("O aluno está Reprovado? ");
        System.out.println("Rsposta do programa: "+isReprovado);
        System.out.println("===========================");

    }
    
}
