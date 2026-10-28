package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class Equipamento {

    private String nome;
    private double valorUnitario;
    private int quantidade;
    
    public Equipamento(String nome, double valorUnitario, int quantidade) {
        
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getValorUnitario() {
        return this.valorUnitario;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
}
