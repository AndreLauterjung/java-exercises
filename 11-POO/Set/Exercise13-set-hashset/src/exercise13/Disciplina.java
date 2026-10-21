package exercise13;

import java.util.Objects;
/**
 *
 * @author andrelauterjung
 */
public class Disciplina
{
    private String codigo;
    private String nome;
    int cargaHoraria;
    
    public Disciplina(String codigo, String nome, int cargaHoraria)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Disciplina)
        {
            Disciplina disciplinaAtual = (Disciplina) obj;
            
            return this.getCodigo().toLowerCase().equals(disciplinaAtual.getCodigo().toLowerCase());
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(this.codigo.toLowerCase());
    }
    
    public String getCodigo()
    {
        return this.codigo;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getCargaHoraria()
    {
        return this.cargaHoraria;
    }
}
