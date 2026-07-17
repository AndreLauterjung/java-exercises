package exercise44;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise44 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int hora, minuto, segundo, resultadoTempoSeg;
        
        System.out.println("Digite a quantidade de horas: ");
        hora = sc.nextInt();
        
        System.out.println("Digite a quantidade de minutos: ");
        minuto = sc.nextInt();
        
        System.out.println("Digite a quantidade de segundos: ");
        segundo = sc.nextInt();
        
        System.out.printf("Hora digitada: %d:%d:%d\n", hora, minuto, segundo);
        // Conversor de Tempo: Receba um valor em horas, minutos e segundos. Converta tudo para o total de segundos.
        
        
        resultadoTempoSeg = (hora * 60 * 60) + (minuto * 60) + segundo;
        System.out.println("Segundos totais: "+resultadoTempoSeg);
      
        // 10 horas = 10*60*60
        // 30 minutos = 30 * 60
        // + segundos
    }
    
}
