package exercise12;

import java.util.Objects;
/**
 *
 * @author andrelauterjung
 */
public class Ingresso
{
    private String evento;
    private String setor;
    private int assento;
    
    public Ingresso(String evento, String setor, int assento)
    {
        this.evento = evento;
        this.setor = setor;
        this.assento = assento;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        
        if(obj instanceof Ingresso)
        {
            Ingresso ingressoAtual = (Ingresso) obj;
            
            return this.getEvento().equals(ingressoAtual.evento) &&
                    this.setor.equals(ingressoAtual.setor) &&
                    this.assento == ingressoAtual.assento;
        }
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(this.evento, this.setor, this.assento);
    }
    
    public String getEvento()
    {
        return this.evento;
    }
    
    public String getSetor()
    {
        return this.setor;
    }
    
    public int getAssento()
    {
        return this.assento;
    }
    
}
