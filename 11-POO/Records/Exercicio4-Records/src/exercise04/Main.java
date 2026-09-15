package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
        Crie um record chamado AtendimentoPet que armazene:
        String nomePet
     
        String tipoServico (ex: "Banho", "Tosa", "Banho e Tosa")
        double peso
        
        Requisitos:

        Crie um método de lógica personalizada dentro do record para calcular o 
        preço do serviço com base no peso do animal e no tipo de serviço escolhido 
        (por exemplo: pets com mais de 15kg pagam uma taxa extra de R$ 20,00).
        Crie outro método que retorne um resumo amigável do atendimento formatado.
        */
        
        AtendimentoPet cachorrinho = new AtendimentoPet("Lady", "Banho", 8.0);
        
      
        
        System.out.println(cachorrinho.retornoAtendimento());
         
    }
}
