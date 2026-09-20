package exercise02;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ContaBancaria conta = new ContaBancaria("André");
        
        String mostrarConta = conta.verSaldo();
        System.out.println(mostrarConta);
    }
}
