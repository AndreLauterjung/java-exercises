package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Funcionario {
    
    private String nome;
    private String cargo;
    private double salario;
    
    public Funcionario(String nome, String cargo, double salario) {
        
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCargo() {
        return this.cargo;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    
}
