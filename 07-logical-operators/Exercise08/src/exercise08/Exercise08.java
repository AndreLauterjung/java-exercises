package exercise08;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise08
{

    public static void main(String[] args)
    {
        /* Campanha de Frete Grátis: O sistema de frete do carrinho adota dois critérios de
        isenção. Receba o valor total da compra e a tag de fidelidade do usuário, zerando o frete se o
        valor passar de 200.00 OU se o cliente for Filiado. */
        
        Scanner sc = new Scanner(System.in);
        
        String filiadoPositivo = "sim";
        double valorFreteGratis = 200.00;
        
        String respTagCliente = "";
        double valorCompraCliente = 0.0;
        
        System.out.println("- - - - Verificando compra - - - - ");
        System.out.println("Digite o total da sua compra: ");
        valorCompraCliente = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Digite se você é um cliente filiado do estabelecimento: ");
        respTagCliente = sc.nextLine();
        
        sc.close();
        
        boolean isConcedidoFreteGratis = valorCompraCliente > valorFreteGratis || respTagCliente.equalsIgnoreCase(filiadoPositivo);
        
        System.out.println("======================================");
        System.out.println("O cliente recebeu frete grátis? ");
        System.out.println("Resposta do cliente: "+isConcedidoFreteGratis);
        System.out.println("======================================");
        

    }
    
}
