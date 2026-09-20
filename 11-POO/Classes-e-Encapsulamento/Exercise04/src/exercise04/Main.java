package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args){
    
        Aluno alunoA = new Aluno("Cristiano Ronaldo", 10.0);
    
        boolean resultadoNotaAlunoA = alunoA.verificarAprovacao();
    
        System.out.println("O aluno está aprovado? ");
        System.out.println("RESPOSTA DO SISTEMA: "+resultadoNotaAlunoA);
    }
}
