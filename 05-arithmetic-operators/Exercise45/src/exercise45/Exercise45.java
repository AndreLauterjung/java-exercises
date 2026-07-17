package exercise45;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise45 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // Custo de Produção: O custo final é a soma da matéria-prima + 
        // 25% de mão de obra + 15% de impostos sobre a matéria-prima.
        
        double maoObra = 25.0, impostosMateria = 15.0, custoFinal, custoMateriaPrima;
        
       
        System.out.println("Calculando custo de produção.");
        System.out.println("Digite o total a ser gasto com matéria prima: ");
        custoMateriaPrima = sc.nextDouble();
        
        
        custoFinal = custoMateriaPrima + ((impostosMateria/100)*custoMateriaPrima);
        custoFinal = custoFinal + ((maoObra/100)*custoFinal);
        
        System.out.printf("Custo final: R$ %.2f\n", custoFinal);
       
    }
    
}
