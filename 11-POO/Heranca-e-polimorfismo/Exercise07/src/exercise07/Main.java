package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        
        Funcionario[] funcionarios = {new Gerente("Finanças"), 
            new Funcionario(), 
            new Desenvolvedor("Java"), 
            new Funcionario(), 
            new Desenvolvedor("C"),
            new Gerente("Organização"),
            new Desenvolvedor("Python"),
            new Gerente("Stakeholders")};
        
        
        for(int i = 0; i < funcionarios.length; i++)
        {
            if(funcionarios[i] instanceof Desenvolvedor)
            {
                System.out.println(((Desenvolvedor)funcionarios[i]).desenvolverCodigo());
                
            }
            else if(funcionarios[i] instanceof Gerente)
            {
                System.out.println(((Gerente) funcionarios[i]).realizarReuniao());
            }
        }
        
    }
}