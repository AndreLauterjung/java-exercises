package exercise33;

/**
 *
 * @author andrelauterjung
 */
public class Exercise33
{
    public static void main(String[] args)
    {
        // Calcule o valor de uma multa de 20% sobre uma conta atrasada.
        
        double valorMulta = 20, valorConta = 200.00, valorFinalConta;
        
        System.out.println("Você atrasou uma conta!");
        System.out.println("Houve um acreścimo de 20% no valor da conta!");
        
        valorFinalConta = valorConta + ((valorMulta/100) * valorConta);
        
        System.out.println("Valor anterior da conta: R$ "+valorConta);
        System.out.println("Novo valor da conta com multa de 20%: R$ "+valorFinalConta);
        
    }
    
}
