package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise10
{

    public static void main(String[] args)
    {
        /* Painel de Monitoramento: Um pedido de vendas muda seu estado para inativo por
        decurso de prazo ou ação humana. Receba o status de vencimento e a intenção do usuário,
        invalidando-o se o tempo expirou OU se houve solicitação de cancelamento. */
        
        Scanner sc = new Scanner(System.in);
        
        String cancelado = "cancelar";
        String produtoIndisponivel = "nao";
        
        String respUsuario = "";
        String respProduto = "";
        
        System.out.println(" - - - - Verificação de pedido - - - - ");
        System.out.println("O produto está disponível? (Digite \"sim\" ou \"não\") ");
        respProduto = sc.nextLine();
        
        System.out.println("Você deseja cancelar ou comprar o produto? ");
        respUsuario = sc.nextLine();
        
        sc.close();
        
        boolean isPedidoCancelado = respProduto.equalsIgnoreCase(produtoIndisponivel) || respUsuario.equalsIgnoreCase(cancelado);
        
        System.out.println("==================================");
        System.out.println("O pedido está CANCELADO? ");
        System.out.println("Resposta do programa: "+isPedidoCancelado);
        System.out.println("==================================");
        
    }
    
}
