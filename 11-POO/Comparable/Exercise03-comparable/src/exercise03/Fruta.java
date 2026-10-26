package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Fruta implements Comparable<Fruta>{

    private String nome;
    private double preco;
    
    public Fruta(String nome, double preco){
        
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public int compareTo(Fruta outraFruta){
        return Double.compare(this.getPreco(), outraFruta.getPreco());
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
}
