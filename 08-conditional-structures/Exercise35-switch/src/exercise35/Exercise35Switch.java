package exercise35;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise35Switch 
{

    public static void main(String[] args)
    {
        /* Estações do Ano por Mês: Solicite um mês do ano (número de 1 a 12) e informe
        a estação do ano predominante no hemisfério sul associada àquele mês. */
        
        Scanner sc = new Scanner(System.in);
        
        int mes = -1;
        
        
        System.out.println("=========== Verificando Estações do Ano =============");
        System.out.println("Digite um número de 1 a 12 referente ao número do mês: ");
        mes = sc.nextInt();
        
        sc.close();
        
        
        switch(mes)
        {
            case 1:
                System.out.println("Janeiro.");
                System.out.println("A estação é: Verão.");
                break;
                
            case 2:
                System.out.println("Fevereiro.");
                System.out.println("A estação é: Verão.");
                break;
                
            case 3:
                System.out.println("Março.");
                System.out.println("A estação predominante é: Verão.");
                break;
                
            case 4:
                System.out.println("Abril.");
                System.out.println("A estação é: Outono.");
                break;
                
            case 5:
                System.out.println("Maio.");
                System.out.println("A estação é: Outono.");
                break;
                
            case 6:
                System.out.println("Junho.");
                System.out.println("A estação predominante é: Outono.");
                break;
                
            case 7:
                System.out.println("Julho.");
                System.out.println("A estação é: Inverno.");
                break;
                
            case 8:
                System.out.println("Agosto.");
                System.out.println("A estação é: Inverno.");
                break;
                
            case 9:
                System.out.println("Setembro.");
                System.out.println("A estação predominante é: Inverno.");
                break;
                
            case 10:
                System.out.println("Outubro.");
                System.out.println("A estação é: Primavera.");
                break;
                
            case 11:
                System.out.println("Novembro.");
                System.out.println("A estação é: Primavera.");
                break;
                
            case 12:
                System.out.println("Dezembro.");
                System.out.println("A estação predominante é: Primavera.");
                break;
            default:
                System.out.println("Opção Inválida!");
                System.out.println("TENTE NOVAMENTE!");
        }
        
        System.out.println("=====================================================");

    }
    
}
