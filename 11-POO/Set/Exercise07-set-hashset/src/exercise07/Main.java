/* Enunciado do exercício:

Cadastro sem repetidos

- Crie um HashSet<String> com 3 e-mails.
- Peça um e-mail ao usuário, com Scanner.
- Use o retorno do .add(): se for false, imprima E-mail já cadastrado!; se for true, imprima E-mail cadastrado!.

Testes: um e-mail que já está no conjunto e um novo. Sem .contains() e sem loop. */

package exercise07;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Set<String> emails = new HashSet<>();
        
        emails.add("asdasd@bananamail.com");
        emails.add("asodadoa@graviolamail.com");
        emails.add("dfisifhisudhfiu123@uvapassamail.com");
        
        System.out.println("\nDigite um e-mail: ");
        String emailDigitado = sc.nextLine();
        sc.close();
        
        boolean isRecusado = emails.add(emailDigitado);
        
        if(isRecusado)
        {
            System.out.println("\nE-mail cadastrado!");
        }
        else
        {
            System.out.println("\nERRO! E-mail já cadastrado!");
        }
        
        System.out.println("\nEmails cadastrados: ");
        for(String email : emails)
        {
            System.out.println(email);
        }
        
    }
}
