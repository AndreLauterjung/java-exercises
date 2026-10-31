/* Enunciado do exercício:

Validador de E-mail Corporativo (Básico)

- Objetivo: Verificar se um endereço de e-mail pertence à empresa.
- O que fazer: Peça para o usuário digitar seu e-mail. Utilize o método contains("@suaempresa.com") para verificar
se o domínio corporativo está presente. Exiba uma mensagem de acesso autorizado ou negado com base no
resultado (true ou false).

- Exemplo de saída:

- Entrada: joao.silva@suaempresa.com
- Saída: "Acesso corporativo autorizado!" */

package exercise17;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("Digite seu e-mail: ");
        String email = sc.nextLine();
        sc.close();
        
        String textoVerificacao = "@suaempresa.com";
        
        
        
        System.out.println(email.contains(textoVerificacao) ? "\nAcesso autorizado!": "\nAcesso negado!");
        
        
        System.out.println("\n==================================");
        System.out.println("Programa encerrado!");
        System.out.println("==================================");
    }
}
