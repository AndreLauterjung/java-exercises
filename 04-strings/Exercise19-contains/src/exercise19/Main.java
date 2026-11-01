/* Enunciado do exercício:

Verificador de Segurança de URL

- Objetivo: Checar se um site utiliza protocolo seguro (https).
- O que fazer: Peça ao usuário que insira um endereço de site (URL). Utilize o contains("https://") para validar se o
link começa com o protocolo de segurança. Se retornar true, informe que a página é segura; se false, dê um alerta
de risco.

Exemplo de saída:

- Entrada: http: //site.com
- Saída: "Aviso: Este site não utiliza conexão segura (HTTPS)." */

package exercise19;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n============================================");
        System.out.println("\nDigite um site: ");
        String url = sc.nextLine().toLowerCase();
        sc.close();
        
        
        boolean isSeguro = url.contains("https://");
        
        if(isSeguro) {
            System.out.println("\nEste site é seguro!");
        }
        else
        {
            System.out.println("\nAviso: Este site não utiliza conexão segura (HTTPS).");  
        }
        
        System.out.println("\n============================================");
        System.out.println("Programa encerrado!");
        System.out.println("============================================");
        
    }
}
