package exercise11;

import java.util.Objects;
/**
 *
 * @author andrelauterjung
 */
public class Medicamento
{
    private String nome;
    private double dosagemMg;

    public Medicamento(String nome, double dosagem)
    {
        this.nome = nome;
        this.dosagemMg = dosagem;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        
        if(obj instanceof Medicamento)
        {
            Medicamento medicamentoAtual = (Medicamento) obj;
            
            return this.getNome().equals(medicamentoAtual.getNome() )&& 
                    Double.compare(this.getDosagem(), medicamentoAtual.getDosagem()) == 0;
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(this.nome, this.dosagemMg);
    }
    
    
    public String getNome()
    {
        return this.nome;
    }
            
    public double getDosagem()
    {
        return this.dosagemMg;
    }






    
}
