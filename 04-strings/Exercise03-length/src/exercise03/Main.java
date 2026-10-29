/* Enunciado do exercício:

Validador de Senha Mínima

- Objetivo: Simular uma validação de cadastro onde a senha precisa ter pelo menos 8 caracteres.
- O que fazer: Leia a senha digitada pelo usuário. Verifique se o length() é maior ou igual a 8. Se for, exiba
"Senha válida!"; caso contrário, exiba "A senha deve ter pelo menos 8 caracteres." */

package exercise03;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int minLengthSenha = 8;
        
        System.out.println("------------------------------------------");
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        sc.close();
        
        System.out.println(senha.length() >= minLengthSenha ? "\nSenha válida!":"\nERRO!\nA senha deve ter pelo menos 8 caracteres.");
        
        System.out.println("\n------------------------------------------");
        System.out.println("Programa encerrado!");
        System.out.println("------------------------------------------");
    }
}
