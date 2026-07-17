package exercise50;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise50
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Diárias de Hotel: Calcule o valor total: (diárias * preço) + taxa de serviço (10%
        // sobre o valor das diárias).
        
        double valorFinal, precoDiaria, taxaServ = 10.0;
        int qtdDiarias;
        
        System.out.println("Calculando estadia.");
        System.out.println("Digite o valor da diária: ");
        precoDiaria = sc.nextDouble();
        
        System.out.println("Digite a quantidade de diárias: ");
        qtdDiarias = sc.nextInt();
        
        valorFinal = (double) (qtdDiarias * precoDiaria);
        valorFinal = valorFinal + ((taxaServ/100.0)*valorFinal);
        
        System.out.printf("Valor final da estadia: R$ %.2f\n", valorFinal);
 
    }
    
}
