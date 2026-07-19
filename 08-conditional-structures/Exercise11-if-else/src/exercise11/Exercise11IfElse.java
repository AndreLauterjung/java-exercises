package exercise11;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise11IfElse
{

    public static void main(String[] args)
    {
        /* Categorização de Atletas: Receba a idade de um atleta de natação e classifique sua
        categoria de acordo com as faixas oficiais: de 5 a 10 anos (Infantil), de 11 a 17 anos
        (Juvenil) e a partir de 18 anos (Adulto). */
        
        
        Scanner sc = new Scanner(System.in);
        
        int idade = -1;
        
        System.out.println("- - - Verificação de categoria de Natação - - - -");
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        sc.close();
        
        if(idade >= 5 && idade<=10)
        {
            System.out.println("===============================================");
            System.out.printf("Você tem %d anos de idade | CATEGORIA: INFANTIL!\n", idade);
            System.out.println("===============================================");
        }
        else if(idade >= 11 && idade <= 17)
        {
            System.out.println("===============================================");
            System.out.printf("Você tem %d anos de idade | CATEGORIA: JUVENIL!\n", idade);
            System.out.println("===============================================");
        }
        else if(idade >= 18)
        {
            System.out.println("===============================================");
            System.out.printf("Você tem %d anos de idade | CATEGORIA: ADULTO!\n", idade);
            System.out.println("===============================================");
        }
        else
        {
            System.out.println("===============================================");
            System.out.printf("Idade digitada: %d | NÃO HÁ CATEGORIA!\n", idade);
            System.out.println("===============================================");
        }
        
    }
    
}
