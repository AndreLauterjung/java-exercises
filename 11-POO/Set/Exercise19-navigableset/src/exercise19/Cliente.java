package exercise19;

/**
 *
 * @author andrelauterjung
 */
public class Cliente implements Comparable<Cliente>{

    private String nome;
    private int pontos;
    
    public Cliente(String nome, int pontos){
    
        this.nome = nome;
        this.pontos = pontos;
    }
    
    @Override
    public int compareTo(Cliente objAtual){
        return Integer.compare(this.getPontos(), objAtual.getPontos());
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getPontos(){
        return this.pontos;
    }
    
    
    
    
    
    
}
