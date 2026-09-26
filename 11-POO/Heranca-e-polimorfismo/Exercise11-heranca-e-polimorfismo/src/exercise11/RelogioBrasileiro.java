package exercise11;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class RelogioBrasileiro extends Relogio
{
    @Override
    public String mostrarHora(Relogio relogio)
    {
        return "Hora do Brasil -> "+relogio.getHora()+":"+relogio.getMinuto()+":"+relogio.getSegundo();
    }
    
   

    public void entradaDadosRelogioBR(Scanner sc, Relogio relogio)
    {
        
        
            System.out.println("Hora no formato brasileiro.");
            System.out.println("Digite as horas: ");
            int hora = sc.nextInt();
            
            if(hora >= 0 && hora <= 23)
            {
                relogio.setHora(hora);   
            }
            else
            {
                System.out.println("Hora inválida!");
            }
            
            System.out.println("Digite os minutos: ");
            int minuto = sc.nextInt();
            
            if(minuto >= 0 && minuto <=59)
            {
                relogio.setMinuto(minuto);
            }
            else
            {
                System.out.println("Minuto inválido!");
            }
            
            System.out.println("Digite os segundos: ");
            int segundo = sc.nextInt();
            
            if(segundo >= 0 && segundo <= 59)
            {
                relogio.setSegundo(segundo);
            }
            else
            {
                System.out.println("Segundos inválidos!");
            }
            
    }
}

