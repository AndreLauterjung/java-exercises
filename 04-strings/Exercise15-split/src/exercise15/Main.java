/* Enunciado do exercício:

Leitor de Dados CSV (Produto)

- Objetivo: 
- Objetivo: Processar uma linha de dados vindos de uma tabela ou arquivo CSV.
- O que fazer: Crie uma string com dados de um produto no formato: "Notebook,3500.00,10" (Nome, Preço e
Estoque). Utilize o split(",") para extrair essas informações, e exiba uma mensagem formatada.

Exemplo de saída:

- Entrada: "Mouse Gamer,150.50,25"

- Saída:

    Produto: Mouse Gamer
    Preço: R$ 150.50
    Estoque disponível: 25 unidades */

package exercise15;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String[] dadosSplit;
        
        String dados = "Notebook,3500.00,10";
        
        
        dadosSplit = dados.split(",");
        
        String nome = dadosSplit[0];
        String preco = dadosSplit[1];
        String quantidade = dadosSplit[2];
        
        System.out.println("====================================");
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço do produto: "+preco);
        System.out.println("Quantidade: "+quantidade);
        
        System.out.println("====================================");
        System.out.println("Programa encerrado!");
        System.out.println("====================================");
    }
}
