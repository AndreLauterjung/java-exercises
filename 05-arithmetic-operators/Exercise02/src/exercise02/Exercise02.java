package exercise02;

/**
 *
 * @author andrelauterjung
 */
public class Exercise02
{

    public static void main(String[] args)
    {
        double pagamento = 50.00, troco;
        double item = 35.00;
        
        troco = pagamento - item;
        
        System.out.println("Pagando compra...");
        System.out.printf("Value of item: R$ %.2f\n", item);
        System.out.printf("Pagamento: R$ %.2f\n", pagamento);
        System.out.printf("Troco: %.2f\n", troco);
        
    }  
}
