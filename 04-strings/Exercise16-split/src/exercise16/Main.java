/* Enunciado do exercício:

Lista de Compras com Múltiplos Itens

- Objetivo: Processar uma lista contínua separada por ponto e vírgula.
- O que fazer: Peça ao usuário uma lista de compras digitada em uma única linha, separada por ponto e vírgula
(ex: "Arroz;Feijão;Carne;Batata"). Utilize o split(";") para gerar o array e percorra o array exibindo cada item
numerado (Ex: Item 1: Arroz, Item 2: Feijão, etc.).

Exemplo de saída:

- Entrada: "Maçã;Banana;Laranja"

- Saída:
    Item 1: Maçã
    Item 2: Banana
    Item 3: Laranja */
package exercise16;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String[] listaSeparada;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==================================================================");
        System.out.println("Digite uma lista de compras sepando os itens por ponto e vírgula: ");
        String lista = sc.nextLine();
        sc.close();
        
        listaSeparada = lista.split(";");
        
        System.out.println("\nLista de comprass: ");
        for(int i = 0; i < listaSeparada.length; i++) {
            
            System.out.printf("Item %d: %s\n", i+1, listaSeparada[i]);
        }
        
        System.out.println("\n==================================================================");
        System.out.println("Programa encerrado!");
        System.out.println("==================================================================");
    }
}
