package exercise04;

/**
 *
 * @author andrelauterjung
 */
public record AtendimentoPet(String nomePet, String tipoServico, double peso)
{
    public double calcularPreco()
    {
        double valorFinal = 0.0;
        // banho, tosa, banho e tosa
        
        if(this.tipoServico.equalsIgnoreCase("banho"))
        {
            valorFinal = 100.0;
            
            if(this.peso > 15.0)
                valorFinal += 20.0;
            
                
        }
        else if(this.tipoServico.equalsIgnoreCase("tosa"))
        {
            valorFinal = 150.0;
            
            if(this.peso > 15.0)
                valorFinal += 20.0;
            
        }
        else if(this.tipoServico.equalsIgnoreCase("ambos"))
        {
            valorFinal = 250.0;
            
            if(this.peso > 15.0)
                valorFinal += 20.0;
            
        }
        else
        {
            System.out.println("Valor inválido!");
        }

        return valorFinal;
    }
    
       
    
    
    public String retornoAtendimento()
    {
        return "RETORNO DO ATENDIMENTO: \n\nNOME DO PET: "+nomePet+
                "\nTIPO SERVIÇO: "+tipoServico+"\nPESO PET: "+peso+
                "\nVALOR FINAL DO SERVIÇO: R$"+calcularPreco();
    }
}
