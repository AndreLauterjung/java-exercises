package exercise19;

/**
 *
 * @author andrelauterjung
 */
public class Tarefa
{
    private String descricao;
    private boolean concluida;
    
    public Tarefa()
    {
        
    }
    
    public Tarefa(String descricaoTarefa, boolean tarefaConcluida)
    {
        this.descricao = descricaoTarefa;
        this.concluida = tarefaConcluida;
    }
    
    public String mensagemTarefa()
    {
        return "Tarefa: "+getDescricaoTarefa()+" | Concluída? "+getStatusTarefa();
    }
            
    
    public String getDescricaoTarefa()
    {
        return this.descricao;
    }
            
    public void setStatusTarefa(boolean tarefaConcluida)
    {
        this.concluida = tarefaConcluida;
    }
    public boolean getStatusTarefa()
    {
        return this.concluida;
    }
}