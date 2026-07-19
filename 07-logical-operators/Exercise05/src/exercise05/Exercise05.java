package exercise05;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise05
{

    public static void main(String[] args)
    {
        /* Checkout de E-commerce: A finalização de uma compra exige consistência no
        catálogo. Receba a quantidade em estoque e o status de ativação do item, validando se a
        quantidade é maior que zero E se o produto está ativo. */
        
        Scanner sc = new Scanner(System.in);
        
        String produtoAtivo = "sim";
        int qtdProduto = 0;
        
        String respProduto = "";
        int respQtdProduto = -1;
        
        
        System.out.println("- - - - - -  Finalizando Compra - - - - - -");
        System.out.println("Digite a quantidade do produto em estoque: ");
        respQtdProduto = sc.nextInt();
        sc.nextLine();
        
        System.out.println("O produto está ativo? (digite \"sim\" ou \"não\") ");
        respProduto = sc.nextLine();
        
        sc.close();
        
        boolean isCompraValida = respProduto.equalsIgnoreCase(produtoAtivo)&& respQtdProduto > qtdProduto;
        
        System.out.println("=============================");
        System.out.println("A compra foi validada? ");
        System.out.println("Resposta do programa: "+isCompraValida);
        System.out.println("=============================");
        
        
    }
    
}
