package exercise05;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung/home/andrelauterjung/.cache/netbeans/27/executor-snippets/run.xml:111
 */
public class Main {

    public static void main(String[] args)
    {
        
        ContaBancaria conta = new ContaBancaria(0.0);
        
        Scanner sc = new Scanner(System.in);
        
        boolean isFuncionando = true;
        
        while(isFuncionando)
        {
            System.out.println("\n**************** BANCO ASDF **********************");
            System.out.println("Digite o número para realizar uma ação: ");
            System.out.println("0 - SAIR DA CONTA");
            System.out.println("1 - CONSULTAR SALDO");
            System.out.println("2 - DEPOSITAR DINHEIRO");
            System.out.println("3 - SACAR DINHEIRO");
            System.out.println("4 - PAGAR UM BOLETO");
            System.out.println("5 - CONSULTAR CHEQUE ESPECIAL");
            System.out.println("6 - VERIFICAR SE CHEQUE ESPECIAL ESTÁ ATIVO");
            
            System.out.printf("\n");
            
            int opcao = sc.nextInt();

            if(opcao == 0)
            {
                System.out.println("\nPROGRAMA ENCERRADO!");
                isFuncionando = false;   
            }
            
            else if(opcao == 1)
            {
                System.out.println(conta.consultarSaldo());
                
                System.out.println("\nPROGRAMA ENCERRADO!");
                
            }
            else if(opcao == 2)
            {
                conta.depositarDinheiro(sc);
                System.out.println(conta.consultarSaldo());
                
            }
            else if(opcao == 3)
            {
                conta.sacarDinheiro(sc);
                System.out.println(conta.consultarSaldo());
            }
            
            else if(opcao == 4)
            {
                conta.pagarBoleto(sc);
                System.out.println(conta.consultarSaldo());
            }
            else if(opcao == 5)
            {
                conta.consultarChequeEspecial();
                System.out.println(conta.consultarSaldo());
            }
            else if(opcao == 6)
            {
                conta.verificarChequeEspecial();
                System.out.println(conta.consultarSaldo());
            }
                
        }
    }
}
