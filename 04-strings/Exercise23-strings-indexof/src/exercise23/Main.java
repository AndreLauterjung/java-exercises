/* Enunciado do exercício:

O Validador de Extensão de Arquivo

- Objetivo: Descobrir a posição do ponto (.) em um nome de arquivo para identificar sua extensão.
- O que fazer: Peça para o usuário digitar o nome de um arquivo (ex: relatorio_anual.pdf). Use o indexOf(".") para
achar onde o ponto começa. Se o retorno for diferente de -1, informe a posição; se for -1, avise que o arquivo não
tem ponto ou extensão.

Exemplo de saída:

- Entrada: foto_ferias.png
- Saída: "O ponto da extensão está na posição: 12" */

package exercise23;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n===============================================");
        System.out.println("Digite o nome de um arquivo (exemplo: texto.txt): ");
        String nomeArquivo = sc.nextLine().toLowerCase();
        sc.close();
        
        int posicaoPonto = nomeArquivo.indexOf(".");
        
        if(posicaoPonto == -1) {
            System.out.println("O arquivo não tem ponto de extensão!");
        }
        else {
            System.out.println("O ponto da extensão está na posição: "+posicaoPonto);
        }
                
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");

    }
}
