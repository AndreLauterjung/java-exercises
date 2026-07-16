package exercise20;

/**
 *
 * @author andrelauterjung
 */
public class Exercise20 {

    public static void main(String[] args) {
        
        // Subtraia 200 de um saldo inicial de 1000 para encontrar o saldo atual.
        
        double saldoInicial = 1000.00, valSaque = 200.00, saldoAtual;
        
        System.out.printf("Saldo da conta: R$ %.2f \n", saldoInicial);
        System.out.printf("Sacando R$ %.2f...\n", valSaque);
        
        saldoAtual = saldoInicial - valSaque;
        
        
        System.out.printf("Saldo atual da conta: R$ %.2f\n", saldoAtual);
        
    }
    
}
