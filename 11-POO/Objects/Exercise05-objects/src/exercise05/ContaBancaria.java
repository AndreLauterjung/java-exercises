package exercise05;

import java.util.Scanner;

/**
 *
 * @author andrelauterjung
 */
public class ContaBancaria
{
    private double saldo;
   
    
    private double primeiroDeposito;
    private double saldoChequeEspecial;
    
    private boolean isChequeEspecialAtivo = false;
    
    
    public ContaBancaria(double saldo)
    {
        this.saldo = saldo;
        this.primeiroDeposito = saldo;
        
        if(this.primeiroDeposito <= 500.0)
        {
            this.saldoChequeEspecial = 50.0;
        }
        else if(this.primeiroDeposito > 500.0)
        {
            this.saldoChequeEspecial = (this.primeiroDeposito * 0.5);  
        }
            
    }
    
    // Mostra o saldo da conta e do crédito Especial
    public String consultarSaldo()
    {   
        if(this.isChequeEspecialAtivo)
        {
            return ("\nSALDO TOTAL DA CONTA: R$ "+this.saldo+" !\n"+
                    "SALDO CRÉDITO CHEQUE ESPECIAL: R$ "+this.saldoChequeEspecial+" !\n");
        }
        else
        {
            return ("\nSALDO TOTAL DA CONTA: R$ "+this.saldo+" !\n"+
                    "SALDO CRÉDITO CHEQUE ESPECIAL: R$ "+this.saldoChequeEspecial+" !\n");
        }
            
    }
    
    
    public void depositarDinheiro(Scanner sc)
    {
        double valorDeposito;
        
        System.out.println("Digite o valor que quer depositar: ");
        valorDeposito = sc.nextDouble();
        
        this.saldo += valorDeposito;
        System.out.printf("FORAM DEPOSITADOS R$ %.2f NA CONTA!\n", valorDeposito);
    }
    
    public void sacarDinheiro(Scanner sc)
    {
        double valorSaque;
        
        System.out.println("Digite o valor que você quer sacar: ");
        valorSaque = sc.nextDouble();
        
        if(valorSaque > this.saldo + this.saldoChequeEspecial)
        {
            System.out.println("NÃO FOI POSSÍVEL EFETUAR O SAQUE!");
            System.out.println("O VALOR QUE DESEJA SACAR É MAIOR QUE O SALDO TOTAL DA CONTA!");     
        }
        else if(valorSaque <= 0)
        {
            System.out.println("NÃO FOI POSSÍVEL EFETUAR O SAQUE!");
            System.out.println("O VALOR DIGITADO NÃO PODE SER NEGATIVO OU IGUAL A ZERO!");
        }
        else if(valorSaque <= this.saldo + this.saldoChequeEspecial)
        {
            double valorNegativoSaque = valorSaque - this.saldo;
            
            this.saldo -= valorSaque + (valorNegativoSaque * (20.0/100.0));
            isChequeEspecialAtivo = true;
            System.out.println("SAQUE EFETUADO COM SUCESSO!");
        }
        else
        {
            System.out.println("ERRO!");
        }
        
        
    }
    
    public void pagarBoleto(Scanner sc)
    {
        double valorBoleto;
        
        System.out.println("Digite o valor do boleto: ");
        valorBoleto = sc.nextDouble();
        
        
        if(valorBoleto <= 0)
        {
            System.out.println("NÃO FOI POSSÍVEL PAGAR O BOLETO!");
            System.out.println("MOTIVO: valor inválido do boleto!");
        } 
        // 
        else if(valorBoleto > (this.saldo + this.saldoChequeEspecial))
        {
            System.out.println("MOTIVO: SALDO INSUFICIENTE!");
            
        } 
        else if(valorBoleto > this.saldo && valorBoleto <= this.saldoChequeEspecial + this.saldo)
        {
            double valorPassado = valorBoleto - this.saldo;
            
          
            this.saldo -= valorBoleto + (valorPassado * (20.0/100.0));
            System.out.println("BOLETO PAGO!");
            
            isChequeEspecialAtivo = true;
        }
        else
        {
            this.saldo -= valorBoleto;
        }
    }
        
    // Método para consultar o Cheque Especial e talvez contratar
    public void consultarChequeEspecial()
    {
        if(this.saldo <0.0)
        {
            System.out.println("VOCÊ USOU R$ "+this.saldo+" DO SEU CHEQUE ESPECIAL!");
        }
        else
        {
            System.out.println("VOCê NÃO USOU O CHEQUE ESPECIAL!");
        }
            

    }
        
    
    public void verificarChequeEspecial()
    {
        if(this.saldo < 0 &&  isChequeEspecialAtivo)
        { 
            System.out.println("Usou o cheque especial!");
        }
        else
        {
            System.out.println("NÃO usou o cheque especial!");
        }
            
           
    }
}
