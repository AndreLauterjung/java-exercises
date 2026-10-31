/* Enunciado do exercício:

Filtro de Palavras Ofensivas (Moderação)

- Objetivo: Simular um filtro de chat que detecta mensagens impróprias.
- O que fazer: Crie um programa que receba uma mensagem de texto digitada pelo usuário. Use o contains() para
verificar se a frase possui alguma palavra proibida (por exemplo, "spam" ou "promoção"). Se contiver, exiba um
alerta de "Mensagem bloqueada por conter termos indesejados"; caso contrário, "Mensagem publicada com
sucesso!".

- Exemplo de saída:

- Entrada: "Clique aqui para ver essa super promoção imperdível!"
- Saída: "Mensagem bloqueada por conter termos indesejados." */

package exercise18;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean contemPalavraProibida = false;
        
        System.out.println("\n============================================");
        System.out.println("\nDigite uma mensagem de texto: ");
        String mensagem = sc.nextLine();
        sc.close();
        
        ArrayList<String> palavrasProibidas = new ArrayList<>();
        
        palavrasProibidas.add("promocao");
        palavrasProibidas.add("spam");
        
        
        for(String palavra : palavrasProibidas) {
            
            if(mensagem.contains(palavra))
            {
                contemPalavraProibida = true;
            }
        }
        
        if(contemPalavraProibida) {
            System.out.println("\nMensagem bloqueada por conter termos indesejados");
        }
        else
        {
            System.out.println("\nMensagem publicada com sucesso!");
        }
        
        System.out.println("\n============================================");
        System.out.println("Programa encerrado!");
        System.out.println("============================================");
    }
}
