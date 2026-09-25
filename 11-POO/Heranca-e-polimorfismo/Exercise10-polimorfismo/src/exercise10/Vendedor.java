package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Vendedor extends Usuario
{
    Scanner sc = new Scanner(System.in);
    
    private int quantidadeVendas;
    private boolean isAdministrador = false;
    
    public Vendedor(String nomeU, String emailU, String senhaU)
    {
        super(nomeU, emailU, senhaU);
    }
    
    
    public void menuOpcoesVendedor(Scanner sc, Atendente antendente, Vendedor vendedor)
    {
        boolean isRodandoVendedor = true;
        
        while(isRodandoVendedor)
        {
            System.out.println("\n*********** MENU VENDEDOR *************");
            System.out.println("0 - Fazer logoff");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Alterar dados");
            System.out.println("3 - Alterar senha");
            System.out.println("4 - realizar venda");
            System.out.println("5 - consultar vendas");
            int opcaoMenuVendedor = sc.nextInt();
            sc.nextLine();
            
            switch(opcaoMenuVendedor)
            {
                case 0:
                    vendedor.realizarLogoff();
                    isRodandoVendedor = false;
                    break;
                    
                case 1: 
                    vendedor.realizarLogin(sc, vendedor);
                    break;
                    
                case 2:
                    vendedor.alterarDados(sc, vendedor);
                    break;
                    
                case 3:
                    vendedor.alterarSenha(sc, vendedor);
                    break;
                    
                case 4:
                    vendedor.realizarVenda(sc, antendente);
                    break;
                    
                case 5:
                    vendedor.consultarVendas();
                    break;
                    
                default: 
                    System.out.println("\n!!!!!!!!!!!!!!!!!");
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    
    public void realizarVenda(Scanner sc, Atendente atendente)
    {
        System.out.println("******* REALIZANDO VENDA **********");
        System.out.println("Vender item? (S ou N)");
        String resposta = sc.nextLine();
        
        if(resposta.equalsIgnoreCase("S"))
        {
            atendente.receberPagamentos(sc);
            System.out.println("=============================");
            System.out.println("PRODUTO VENDIDO!");
            System.out.println("=============================");
        }
        else
        {
            System.out.println("Não vendeu o produto!");
        }
    }
    
    public void consultarVendas()
    {
        System.out.println("Quantidade de vendas: "+this.quantidadeVendas);
    }
    
    public int getVendas()
    {
        return this.quantidadeVendas;
    }
    
}
