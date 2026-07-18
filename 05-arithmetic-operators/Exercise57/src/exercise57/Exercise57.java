package exercise57;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise57
{

    public static void main(String[] args)
    {
        
        /* Painel de Mídia (Tempo): Um player de vídeo registra o tempo de reprodução apenas
        em minutos. Receba um valor total acumulado de minutos e calcule, sem condicionais, a
        quantidade de horas cheias e quantos minutos restam após extrair essas horas. */
        
        Scanner sc = new Scanner(System.in);
        
        int minutos;
        int horas;
        int minutosRestantes;
        System.out.println("****************************************************");
        System.out.println("Digite a quantidade de minutos do player de vídeo: ");
        minutos = sc.nextInt();
        
        sc.close();
        
        System.out.println("****************************************************");
        
        horas = minutos / 60;
        minutosRestantes = minutos % 60;
        
        
        System.out.println("***********************");
        System.out.println("Horas: "+horas);
        System.out.println("Minutos restantes: "+minutosRestantes);
        System.out.println("***********************");

    }
    
}
