package exercise24;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise24IfElse
{

    public static void main(String[] args)
    {
        /* Análise de Risco de Crédito: Um banco precisa automatizar a aprovação de
        empréstimos imobiliários. Receba o valor da parcela solicitada, o salário bruto do cliente, o
        tempo de serviço em anos e o valor total do seu patrimônio. O crédito só é aprovado se: (a
        parcela não ultrapassar 30% do salário bruto) E (o tempo de serviço for maior que 2 anos
        OU o salário bruto for superior a 5000.00). */
        
        Scanner sc = new Scanner(System.in);
        
        double valorParcelaSolic = -1.0;
        double salarioBruto = -1.0;
        int tempoServico = -1;
        double valorTotPatrimonio = -1.0;
        
        double fracaoSalarioBruto = -1.0;
        
        
        
        System.out.println(" - - - - - Verificação de Crédito - - - - - - ");
        System.out.println("Digite o valor da parcela solicitada: ");
        valorParcelaSolic = sc.nextDouble();
        
        System.out.println("Digite o valor do seu salário bruto: ");
        salarioBruto = sc.nextDouble();
        
        System.out.println("Digite o total de tempo de serviço (em anos): ");
        tempoServico = sc.nextInt();
        
        System.out.println("Digite o valor total do seu patrimônio: ");
        valorTotPatrimonio = sc.nextDouble();
        sc.close();
        System.out.println("===============================================");

        fracaoSalarioBruto = salarioBruto * (30.0/100.0);
        
        if(!((valorParcelaSolic > fracaoSalarioBruto)) && (tempoServico > 2 || salarioBruto > 5000.0))
        {
            System.out.println("CRÉDITO APROVADO!");
        }
        else
        {
            System.out.println("EMPRÉSTIMO NÃO FOI APROVADO!");
        }
        
        System.out.println("************ PROGRAMA ENCERRADO! *****************");
    }
    
}
