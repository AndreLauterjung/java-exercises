package exercise05;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise05While
{

    public static void main(String[] args)
    {
        /* Simulador de Poupança: Crie um sistema onde o usuário informa o saldo inicial e
        a taxa de juros fixa ao mês. Faça o saldo render mensalmente usando while até
        que o valor final dobre em relação ao saldo inicial, informando quantos meses
        levou. */
        
        Scanner sc = new Scanner(System.in);
        
        double saldoInicial = -1.0;
        double taxaJuros = -1.0;
        double valorFinal = 0.0;
        int qtdMesesRenda = 0;
        
        
        System.out.println("============ SIMULADOR DE POUPANÇA ==============");
        System.out.println("Digite o seu saldo inicial: ");
        saldoInicial = sc.nextDouble();
        
        System.out.println("Digite a taxa de juros fixa ao mês: ");
        taxaJuros = sc.nextDouble();
        sc.close();
        
        valorFinal = saldoInicial;
        
        while(!(valorFinal == saldoInicial*2))
        {
            valorFinal += ((taxaJuros/100.0) * saldoInicial);
            qtdMesesRenda++;
        }
        
        
        System.out.println("---------------------------------------------");
        System.out.println("FIM DA SIMULAÇÃO");
        System.out.println("Valor inicial: R$ "+saldoInicial);
        System.out.println("Valor final: R$ "+valorFinal);
        System.out.printf("Taxa de juros ao mês: %.2f%%\n", taxaJuros);
        System.out.println("Quantidade de meses rendendo: "+qtdMesesRenda+" meses");
        System.out.println("---------------------------------------------");    

    }
    
}
