/* Enunciado do exercício:

Equipamentos e o valor em estoque

- Crie a classe Equipamento com nome (String), valorUnitario (double) e quantidade (int), construtor e getters. 
- Crie um Map<String, Equipamento> com o código do patrimônio como chave: NB-01 Notebook, 3500.0, 4
unidades; MO-02 Monitor, 800.0, 10; TE-03 Teclado, 120.0, 15. 
- Percorra com entrySet() e imprima, para cada um, o código, o nome e o valor total (valorUnitario * quantidade). 
- Some tudo numa variável double totalGeral e imprima. 
- Dê put("MO-02", ...) com um novo Equipamento (por exemplo, o monitor com 12 unidades). Imprima o size() e o
valor total do monitor de novo. 

Esperado: totais 14000.0, 8000.0 e 1800.0, geral 23800.0. Depois do put, o tamanho continua 3, porque a chave
repetida substituiu o objeto antigo. */

package exercise08;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        double valorTotalEstoque = 0.0;
        Map<String, Equipamento> estoque = new HashMap<>();
        
        estoque.put("NB - 01", new Equipamento("Notebook", 3500.0, 4));
        estoque.put("MO - 02", new Equipamento("Monitor", 800.0, 10));
        estoque.put("TE - 03", new Equipamento("Teclado", 120.0, 15));
        
        
        System.out.println("\nValor total estoque: ");
        for(Map.Entry<String, Equipamento> equipamento : estoque.entrySet()) {
            
            System.out.println("");
            System.out.println("Código do produto: "+equipamento.getKey());
            System.out.println("Nome do produto: "+equipamento.getValue().getNome());
            System.out.println("Valor total: R$ "+
                    equipamento.getValue().getValorUnitario() * equipamento.getValue().getQuantidade());
            
            valorTotalEstoque += equipamento.getValue().getValorUnitario() * equipamento.getValue().getQuantidade();
        }
        System.out.println("\nValor total do estoque: R$ "+valorTotalEstoque);
        System.out.println("Chaves cadastradas: "+estoque.size());
        valorTotalEstoque = 0.0;
        
        estoque.put("MO - 02", new Equipamento("Monitor", 800.0, 12));
        System.out.println("-------------------------------------------------");
        System.out.println("\nValor total estoque: ");
        for(Map.Entry<String, Equipamento> equipamento : estoque.entrySet()) {
            
            System.out.println("");
            System.out.println("Código do produto: "+equipamento.getKey());
            System.out.println("Nome do produto: "+equipamento.getValue().getNome());
            System.out.println("Valor total: R$ "+
                    equipamento.getValue().getValorUnitario() * equipamento.getValue().getQuantidade());
            
            valorTotalEstoque += equipamento.getValue().getValorUnitario() * equipamento.getValue().getQuantidade();
        }
        
        System.out.println("\nValor total do estoque: R$ "+valorTotalEstoque);
        System.out.println("Chaves cadastradas: "+estoque.size());
    }
}
