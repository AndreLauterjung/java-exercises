package exercise05;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Produto[] produtos = new Produto[5];
        
        produtos[0] = new Produto("Arroz", 20.0);
        produtos[1] = new Eletronico("Celular", 200.00, 10);
        produtos[2] = new Roupa("Camisa", 50.0, 44.3);
        produtos[3] = new Produto("Feijão", 7.0);
        produtos[4] = new Eletronico("Notebook", 2000.0, 12);
        
        for(int i = 0; i < produtos.length; i++)
        {
            if(produtos[i] instanceof Eletronico)
            {
                System.out.println(((Eletronico)produtos[i]).getGarantiaMesesEletronico());
            }
            else if(produtos[i] instanceof Roupa)
            {
                System.out.println(((Roupa)produtos[i]).getTamanhoRoupa());
            }
        }
            
    }
}
