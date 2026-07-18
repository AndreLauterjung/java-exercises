package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class Exercise08
{

    public static void main(String[] args)
    {
        /*  Comparação de Flags: O sistema possui duas configurações de segurança ativas salvos
        em variáveis. Monte uma instrução que compare se ambos os estados booleanos atuais são
        idênticos entre si. */
        
        boolean sistemaUmAtivo = true;
        boolean sistemaDoisAtivo = true;
        boolean isEstaoAtivos;
        
        isEstaoAtivos = sistemaUmAtivo == sistemaDoisAtivo;
        
        System.out.println("**************************************");
        System.out.println("Os dois sistemas estão ativos? ");
        System.out.println("Resposta do programa: "+isEstaoAtivos);
        System.out.println("***************************************");
        
    }
    
}
