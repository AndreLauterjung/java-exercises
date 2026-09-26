package exercise11;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Relogio
{
    private int hora;
    private int minuto;
    private int segundo;
    
    
    public Relogio()
    {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    
    public String mostrarHora(Relogio relogio)
    {
        return relogio.getHora()+":"+relogio.getMinuto()+":"+relogio.getSegundo();
        
    }
    
    public void novoRelogio(Relogio relogio)
    {
        this.hora = relogio.getHora();
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();
    }
    
   
    
    
    // Setters
    public void setHora(int horaT)
    {
        this.hora = horaT;
    }
    
    public void setMinuto(int minutoT)
    {
        this.minuto = minutoT;
    }
    
    public void setSegundo(int segundoT)
    {
        this.segundo = segundoT;
    }
            
    
    // Getters
    public int getHora()
    {
        return this.hora;
    }
    
    public int getMinuto()
    {
        return this.minuto;
    }
    
    public int getSegundo()
    {
        return this.segundo;
    }
    
}
