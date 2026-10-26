package exercise02;

/**
 *
 * @author andrelauterjung
 */
public class Passageiro implements Comparable<Passageiro> {

    private String nome;
    private int idade;
    
    public Passageiro(String nome, int idade) {
        
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public int compareTo(Passageiro outroPassageiro){
        
        return Integer.compare(outroPassageiro.getIdade(), this.getIdade());
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
}
