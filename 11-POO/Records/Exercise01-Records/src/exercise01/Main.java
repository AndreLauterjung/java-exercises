package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
        Crie um record chamado 'Produto' que represente um item de loja.
        
        Componentes (Atributos): nome (String), preco (double) e quantidade (int).
        Na Main: Instancie um produto com valores à sua escolha e imprima as informações 
        dele na tela usando os métodos automáticos que o record gera (.nome(), .preco(), .quantidade()).
        */
        
        Produto produto1 = new Produto("Arroz", 10.0, 1);
        
        String nomeProduto = produto1.nome();
        double precoProduto = produto1.preco();
        int quantidadeProduto = produto1.quantidade();
        
        System.out.println("Nome produto: "+nomeProduto);
        System.out.println("Preço produto: R$ "+precoProduto);
        System.out.println("Quantidade produto: "+quantidadeProduto);
    }
}
