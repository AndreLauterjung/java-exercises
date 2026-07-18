package exercise59;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise59
{

    public static void main(String[] args)
    {
        /* Logística de Despacho: Em um centro de distribuição, cada caixa de transporte
        comporta exatamente 12 unidades de um item. Dado um número total de produtos inserido
        pelo usuário, calcule a quantidade exata de itens que vão sobrar fora das caixas cheias. */
        
        Scanner sc = new Scanner(System.in);
        
        int espacoCaixa = 12;
        int totalItens;
        int itensSobra;
        
        System.out.println("************************************************");
        System.out.println("Digite o total de itens para serem armazenados: ");
        totalItens = sc.nextInt();
        
        sc.close();
        System.out.println("************************************************");
        
        
        itensSobra = totalItens % 12;
        
        System.out.println("***********************************");
        System.out.println("Quantidade de itens que sobraram: "+itensSobra);
        System.out.println("***********************************");
        
    }
    
}
