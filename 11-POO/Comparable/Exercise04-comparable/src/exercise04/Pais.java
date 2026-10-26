package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Pais implements Comparable<Pais>{

    private String nome;
    private int populacao;
    
    public Pais(String nome, int populacao){
        
        this.nome = nome;
        this.populacao = populacao;
    }
    
    @Override
    public int compareTo(Pais paisAtual){
        
        return this.getNome().compareToIgnoreCase(paisAtual.getNome());
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getPopulacao(){
        return this.populacao;
    }
}
