package exercise58;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise58
{

    public static void main(String[] args)
    {
        /*  Filtro de Cupons: Um e-commerce só aceita cupons cujo número de identificação
        atenda a critérios rígidos de divisibilidade. Receba o número do cupom e exiba o resto da
        divisão dele por 3 e por 5 separadamente.*/
        
        Scanner sc = new Scanner(System.in);
        
        int numCupom;
        int restoTres;
        int restoCinco;
        
        System.out.println("*********************************");
        System.out.println("Digite o número do seu cupom: ");
        numCupom = sc.nextInt();
        
        sc.close();
        System.out.println("*********************************");
        
        restoTres = numCupom % 3;
        restoCinco = numCupom % 5;
        
        System.out.println("*********************************");
        System.out.println("Número do cupom: "+numCupom);
        System.out.println("Resultado divisão cupom (% 3): "+restoTres);
        System.out.println("Resultado divisão (% 5): "+restoCinco);
        System.out.println("*********************************");
       
    }
    
}
