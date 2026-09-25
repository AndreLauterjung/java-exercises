package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Atendente extends Usuario
{
    private double valorCaixa;
    private boolean isAdministrador = false;
    
    boolean isCaixaAberto = true;
    
    public Atendente(String nomeU, String emailU, String senhaU)
    {
        super(nomeU, emailU, senhaU);
    }
    
    
    
    public void menuOpcoesAtendente(Scanner sc, Atendente atendente)
    {
        boolean isRodandoAtendente = true;
        
        while(isRodandoAtendente)
        {
            System.out.println("\n*********** MENU VENDEDOR *************");
            System.out.println("0 - Fazer logoff");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Alterar dados");
            System.out.println("3 - Alterar senha");
            System.out.println("4 - receber pagamentos");
            System.out.println("5 - fechar caixa");
            int opcaoMenuAtendente = sc.nextInt();
            sc.nextLine();
            
            switch(opcaoMenuAtendente)
            {
                case 0:
                    atendente.realizarLogoff();
                    isRodandoAtendente = false;
                    break;
                    
                case 1: 
                    atendente.realizarLogin(sc, atendente);
                    break;
                    
                case 2:
                    atendente.alterarDados(sc, atendente);
                    break;
                    
                case 3:
                    atendente.alterarSenha(sc, atendente);
                    break;
                    
                case 4:
                    atendente.receberPagamentos(sc);
                    break;
                    
                case 5:
                    atendente.fecharCaixa();
                    break;
                    
                default: 
                    System.out.println("\n!!!!!!!!!!!!!!!!!");
                    System.out.println("Opção inválida!");
            }
        }
    }
        
    
    
    
    
    
    
    public void receberPagamentos(Scanner sc)
    {
        if(isCaixaAberto)
        {
            System.out.println("Digite o valor a ser depositado: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            
            this.valorCaixa += valor;
        }
        else
        {
            System.out.println("Não é possível acrescentar valor.");
            System.out.println("O caixa está fechado!");
        }
        // onde o método recebe um valor que deve ser incrementado no valor em caixa
    }
    
    public void fecharCaixa()
    {
        System.out.println("Fechando caixa...");
        isCaixaAberto = false;
    }
        
    
    public double getValorCaixa()
    {
        return this.valorCaixa;
    }
}
