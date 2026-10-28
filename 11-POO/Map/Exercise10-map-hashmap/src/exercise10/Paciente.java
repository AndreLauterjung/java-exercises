package exercise10;

/**
 *
 * @author andrelauterjung
 */
public class Paciente {
    
    private String nome;
    private int idade;
    
    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
}
