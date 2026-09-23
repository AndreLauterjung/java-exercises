package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Gerente extends Funcionario {
    
    private String tipoReuniao;
    
    public Gerente(String reuniao)
    {
        this.tipoReuniao = reuniao;
    }
    
    
    public String realizarReuniao()
    {
        return "Realizando reunião de: "+tipoReuniao;
    }
}
