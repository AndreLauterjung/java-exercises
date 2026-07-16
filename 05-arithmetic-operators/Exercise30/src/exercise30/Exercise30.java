package exercise30;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise30
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Calcule juros simples: capital * taxa * tempo (use 0.05 para representar 5%).
        
        double taxa = 5, jurosSimples, capital;
        int tempo;
        
        System.out.println("Calculando juros simples.");
        System.out.println("Digite quanto de dinheiro você quer investir: ");
        capital = sc.nextDouble();
        
        System.out.println("Digite quanto tempo você quer deixar o dinheiro rendendo (em anos): ");
        tempo = sc.nextInt();
        
        taxa = taxa/100;
        
        jurosSimples = capital + (capital * (taxa*tempo));
        
        System.out.printf("Capital depositado: R$ %.2f\n ", capital);
        System.out.printf("Tempo que o dinheiro ficará rendendo: %d anos\n", tempo);
        System.out.printf("Taxa: %.2f\n", taxa);
        
        System.out.printf("Capital final: R$ %.2f\n", jurosSimples);
        System.out.printf("Rendimento: R$ %.2f\n", jurosSimples - capital);
        
    }
    
}
