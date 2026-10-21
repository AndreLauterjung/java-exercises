package exercise10;

import java.util.Objects;
/**
 *
 * @author andrelauterjung
 */
public class Jogador
{
    private int camisa;
    private String nome;
    private String time;
    
    public Jogador(int camisa, String nome, String time)
    {
        this.camisa = camisa;
        this.nome = nome;
        this.time = time;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        
        if(obj instanceof Jogador)
        {
            Jogador jogadorAtual = (Jogador) obj;
            
            return this.getTime().equals(jogadorAtual.getTime()) &&
                    this.getCamisa() == jogadorAtual.getCamisa();  
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(camisa, time);
    }
    
    
    
    public int getCamisa()
    {
        return this.camisa;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getTime()
    {
        return this.time;
    }
    
    
}
