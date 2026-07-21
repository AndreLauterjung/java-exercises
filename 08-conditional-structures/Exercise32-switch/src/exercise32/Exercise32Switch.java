package exercise32;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise32Switch
{

    public static void main(String[] args) 
    {
        /* Classificação de Dias: Crie um sistema que leia um número de 1 a 7
        representando os dias da semana. Utilizando switch, exiba se o dia em questão é
        "Dia Útil" ou "Final de Semana". */
        
        Scanner sc = new Scanner(System.in);
        
        int opcaoUsuario = -1;
        
        System.out.println("======== Verificação - Dia da Semana =========");
        System.out.println("Digite um número referente ao dia da semana: ");
        opcaoUsuario = sc.nextInt();
        sc.close();
        
        switch(opcaoUsuario)
        {
            case 1:
                System.out.println("É Domingo!");
                break;
            case 2:
                System.out.println("É Segunda-Feira!");
                break;
            case 3:
                System.out.println("É Terça-Feira!");
                break;
            case 4:
                System.out.println("É Quarta-Feira!");
                break;
            case 5:
                System.out.println("É Quinta-Feira!");
                break;
            case 6:
                System.out.println("É Sexta-Feira!");
                break;
            case 7:
                System.out.println("É Sábado!");
                break;
            default:
                System.out.println("Opção Inválida!");
                System.out.println("Tente novamente!");
        }
        System.out.println("==============================================");
   
    }
    
}
