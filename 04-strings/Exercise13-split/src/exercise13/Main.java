/* Enunciado do exercício:

Analisador de E-mail

- Objetivo: Separar o nome de usuário do domínio em um endereço de e-mail.
- O que fazer: Peça para o usuário digitar um e-mail (ex: usuario@gmail.com). Use o split("@") para dividir o texto
em duas partes: o login e o provedor. Depois, exiba cada parte separadamente.

Exemplo de saída:

Entrada: carlos.silva@empresa.com

Saída:
          Usuário: carlos.silva
          Domínio: empresa.com */

package exercise13;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
      
        String[] emailSplit;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("Digite um e-mail: ");
        String email = sc.nextLine();
        sc.close();
        
        emailSplit = email.split("@");
        
        System.out.println("\nResultado: ");
        for(int i = 0; i<emailSplit.length; i++) {
            System.out.println(emailSplit[i]);
        }
        
        System.out.println("\n==============================");
        System.out.println("Programa encerrado!");
        System.out.println("==============================");
    }
}
