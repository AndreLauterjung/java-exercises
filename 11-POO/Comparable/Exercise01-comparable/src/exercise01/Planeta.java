package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Planeta implements Comparable<Planeta> {
    
    private String nome;
    private int diametroKm;
    
    public Planeta(String nome, int diametroKm){
        
        this.nome = nome;
        this.diametroKm = diametroKm;
    }
    
    @Override
    public int compareTo(Planeta planetaAtual) {
        
        return Integer.compare(this.getDiametro(), planetaAtual.getDiametro());
    }
    
    public String getNome() {
        
        return this.nome;
    }
    
    public int getDiametro() {
        
        return this.diametroKm;
    }
    
}
