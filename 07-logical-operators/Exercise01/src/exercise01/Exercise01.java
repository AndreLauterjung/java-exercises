package exercise01;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise01
{

    public static void main(String[] args)
    {    
        /* Blitz de Trânsito: Um condutor só está legalizado se cumprir dois requisitos
        simultâneos. Receba a idade do motorista e o status de sua carteira de habilitação, validando
        se ele é maior de idade E possui o documento válido. */
        
        Scanner sc = new Scanner(System.in);
        
        int idade = -1;
        String statusCarteira = "";
        
        System.out.println("- - - - - Verificação de documentos - - - - - ");
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        sc.nextLine(); // Armazenar o "Enter"
        
        System.out.println("Seu documento está válido? (Digite \"sim\" ou \"não\") ");
        statusCarteira = sc.nextLine();
        
        sc.close();
        
        boolean isCondutorAprovado = idade >= 18 && statusCarteira.equalsIgnoreCase("sim");
        
        System.out.println("============================================");
        System.out.println("O condutor está apto a continuar dirigindo? ");
        System.out.println("Resposta do programa: "+isCondutorAprovado);
        System.out.println("============================================");
        
    }
    
}