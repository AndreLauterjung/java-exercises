package exercise61;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise61
{
    public static void main(String[] args)
    {
        /*Escreva um código que receba o nome e o ano de nascimento de alguém e 
        imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"*/
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int anoNascimento;
        int anoAtual = 2026;
        
        
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        
        System.out.println("Digite o seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        
        sc.close();
        
        int idade = anoAtual - anoNascimento;
        System.out.printf("Olá %s você tem %d anos de idade!\n", nome, idade);
    }   
}