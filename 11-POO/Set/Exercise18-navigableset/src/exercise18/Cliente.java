package exercise18;

/**
 *
 * @author andrelauterjung
 */
public class Cliente implements Comparable<Cliente>
{
    private String nome;
    private int pontos;
    
    public Cliente(String nome, int pontos){
        this.nome = nome;
        this.pontos = pontos;
    }
    
    @Override
    public int compareTo(Cliente objAtual)
    {
        return Integer.compare(this.pontos, objAtual.pontos);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getPontos(){
        return this.pontos;
    }
}
