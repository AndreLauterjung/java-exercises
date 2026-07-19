package exercise15.not;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise15Not
{

    public static void main(String[] args)
    {
        /* Regra de Brinde Especial: Um cliente ganha um brinde se realizar uma compra de alto
        valor casada com um benefício extra. Receba o valor da compra, se é a primeira compra e se
        possui cupom. O brinde é concedido se o valor passar de 100.00 E (for a primeira compra
        OU possuir um cupom ativo). */
        
        Scanner sc = new Scanner(System.in);
        
        String ehPrimeiraCompra = "sim";
        String possuiCupomAtivo = "sim";
        double valorBaseBrinde = 100.0;
        
        double valorCompraCliente = -1.0;
        String respClientePrimeiraCompra = "";
        String respClienteCupom = "";
        
        System.out.println("- - - - - Realizando compra - - - - -");
        System.out.println("É a sua primeira compra neste estabelecimento?");
        respClientePrimeiraCompra = sc.nextLine();
        
        System.out.println("Você tem cupom ativo? ");
        respClienteCupom = sc.nextLine();
        
        System.out.println("Digite o total da compra: ");
        valorCompraCliente = sc.nextDouble();
        
        sc.close();
        
        boolean isBrindeNegado = !((valorCompraCliente > valorBaseBrinde)
                && (respClientePrimeiraCompra.equalsIgnoreCase(ehPrimeiraCompra) || respClienteCupom.equalsIgnoreCase(possuiCupomAtivo)));
        
        System.out.println("=============================");
        System.out.println("O brinde foi negado? ");
        System.out.println("Resposta do programa: "+isBrindeNegado);
        System.out.println("=============================");
    }
    
}
