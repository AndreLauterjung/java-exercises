package exercise46;

/**
 *
 * @author andrelauterjung
 */
public class Exercise46
{

    public static void main(String[] args)
    {
        int caixasCheias, caixa = 12, itens = 127, resto;
        // Divisão de Estoque: Encontre o número de caixas completas para 
        // 127 itens (cada caixa cabe 12). Dica: use a divisão entre duas variáveis 
        // int para que o Java descarte automaticamente o resto.
   
        
        caixasCheias = itens / caixa;
        int totalItens = caixasCheias * caixa;
        
        resto = itens - totalItens;
        System.out.println("Total de caixas: "+caixasCheias);
        System.out.println("Total de itens guardados: "+totalItens);
        System.out.println("Itens restantes: "+resto);

    }
    
}