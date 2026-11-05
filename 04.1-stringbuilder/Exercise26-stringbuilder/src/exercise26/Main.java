/* Enunciado do exercício:

CPF com e sem pontuação

Parte A: formatar

- Peça um CPF com 11 dígitos, sem pontuação, com Scanner (por exemplo 12345678901). 
- Se o tamanho não for 11, imprima CPF deve ter 11 dígitos e termine. 
- Crie um StringBuilder com o CPF e use insert três vezes, da esquerda para a direita: um . na posição 3, outro . na
posição 7 e um - na posição 11. 
- Imprima o resultado. 

Esperado: 123.456.789-01.

Parte B: limpar

- Crie um StringBuilder com "123.456.789-01". 
- Percorra com um for de trás para frente (i de length() - 1 até 0). Se o caractere for . ou -, remova com
deleteCharAt(i). 
- Imprima o resultado. 

Esperado: 12345678901.

Depois, rode de novo com o for de frente para trás e compare. Com esse CPF, os dois funcionam, mas anote por
que ir de trás para frente é mais seguro quando você apaga caracteres: cada deleteCharAt desloca todos os que
vêm depois. */

package exercise26;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        StringBuilder cpfLimpo = new StringBuilder();
        StringBuilder cpfBuilder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=========================================");
        System.out.println("Digite um CPF: ");
        String cpf = sc.nextLine();
        sc.close();
        
        if(cpf.length() > 11) {
            
            System.out.println("O CPF deve ter 11 digitos! ");
            System.out.println("\n=========================================");
            System.out.println("PROGRAMA ENCERRADO!");
            System.out.println("=========================================");
        }
        else {
            
            cpfBuilder.append(cpf);
            cpfBuilder.insert(3, ".").insert(7, ".").insert(11, "-");
            
            System.out.println("\nResultado: "+cpfBuilder);
            
            cpfLimpo.append(cpfBuilder);
            
            
            for(int i = cpfLimpo.length() - 1; i >= 0; i--) {
                
                if(cpfLimpo.charAt(i) == '.' || cpfLimpo.charAt(i) == '-') {
                    
                    cpfLimpo.deleteCharAt(i);
                }
            }
            System.out.println("CPF sem pontos e traço: "+cpfLimpo);
            
            System.out.println("\n=========================================");
            System.out.println("PROGRAMA ENCERRADO!");
            System.out.println("=========================================");
        }
    }
}
