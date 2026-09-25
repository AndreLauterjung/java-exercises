package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Gerente extends Usuario
{
    private boolean isAdministrador = true;
    
    public Gerente(String nomeU, String emailU, String senhaU)
    {
        super(nomeU, emailU, senhaU);
    }
    
    
    public void gerarRelatorioFinanceiro(Vendedor vendedor, Atendente atendente)
    {
        System.out.println("=======================");
        System.out.println("Total de vendas: "+vendedor.getVendas());
        System.out.println("Total em caixa: "+atendente.getValorCaixa());
        System.out.println("=======================");  
    }
    
    public void consultarVendas(Vendedor vendedor)
    {
        System.out.println("=============================");
        System.out.println("Quantidade de vendas: "+vendedor.getVendas());
        System.out.println("=============================");
    }
    
    
    public void menuOpcoesGerente(Scanner sc, Gerente gerente, Vendedor vendedor, Atendente atendente)
    {
        
        boolean isRodandoGerente = true;
        
        while(isRodandoGerente)
        {
            System.out.println("\n********** MENU GERENTE ***************");
            System.out.println("0 - Fazer logoff");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Alterar dados");
            System.out.println("3 - Alterar senha");
            System.out.println("4 - Gerar relatório financeiro");
            System.out.println("5 - consultar vendas");
            int opcaoMenuGerente = sc.nextInt();
            sc.nextLine();
            
            switch(opcaoMenuGerente)
            {
                case 0:
                    gerente.realizarLogoff();
                    isRodandoGerente = false;
                    break;
                    
                case 1: 
                    gerente.realizarLogin(sc, gerente);
                    break;
                    
                case 2:
                    gerente.alterarDados(sc, gerente);
                    break;
                    
                case 3:
                    gerente.alterarSenha(sc, gerente);
                    break;
                    
                case 4:
                    gerente.gerarRelatorioFinanceiro(vendedor, atendente);
                    break;
                    
                case 5:
                    gerente.consultarVendas(vendedor);
                    break;
            }
        }
        
        
        
        
    }
        
    
    
    
   
    
}
