package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Desenvolvedor extends Funcionario {
    
    private String linguagem;
    
    public Desenvolvedor(String linguagem)
    {
        this.linguagem = linguagem;
    }
        
    
    
    
    public String desenvolverCodigo()
    {
        return "Escrevendo código em: "+this.linguagem;
    }
}
