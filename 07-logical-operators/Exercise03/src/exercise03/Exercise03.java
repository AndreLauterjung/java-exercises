package exercise03;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise03
{

    public static void main(String[] args)
    {
        /* Aprovação de Benefício: Uma universidade concede bolsas de estudo baseada em
        desempenho e renda. Receba a média de notas e a renda familiar, checando se a média é
        maior ou igual a 9.0 E se a renda é de no máximo 2000.00. */
        
        Scanner sc = new Scanner(System.in);
        
        double notaSistema = 9.0;
        double salarioSistema = 2000.0;
        double notaUsuario = 0.0;
        double salarioUsuario = 0.0;
        
        System.out.println("- - - - - Verificando Bolsa de Estudo - - - - -");
        System.out.println("Digite o valor da média de suas notas: ");
        notaUsuario = sc.nextDouble();
        
        System.out.println("Digite o valor da sua renda: ");
        salarioUsuario = sc.nextDouble();
        
        sc.close();
        
        boolean isBolsaAprovada = notaUsuario >= notaSistema && salarioUsuario <= salarioSistema;
        
        System.out.println("=====================================");
        System.out.println("A Bolsa de Estudos foi aprovada? ");
        System.out.println("Resposta do sistema: "+isBolsaAprovada);
        System.out.println("=====================================");
        
    }
    
}
