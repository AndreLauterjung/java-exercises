package exercise21;

/**
 *
 * @author andrelauterjung
 */
public class Estudante implements Comparable<Estudante>{

    private String nome;
    private double nota;
    
    public Estudante(String nome, double nota) {
        
        this.nome = nome;
        this.nota = nota;
    }
    
    @Override
    public int compareTo(Estudante estudanteAtual) {
        
        
        int resultado =  Double.compare(estudanteAtual.getNota(), this.getNota());
     
        
        if(resultado == 0)
        {
            return String.CASE_INSENSITIVE_ORDER.compare(this.nome, estudanteAtual.getNome());
        }
        else
        {
            return resultado;
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getNota() {
        return this.nota;
    }
}
