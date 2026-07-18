package exercise60;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise60
{

    public static void main(String[] args)
    {
        /* Divisor de Conta Físico: Quatro amigos vão rachar uma conta de restaurante, mas eles
        possuem apenas cédulas físicas idênticas para pagar divisões exatas inteiras. Receba o valor
        total da conta e exiba o valor residual em dinheiro que restará por não poder ser dividido
        igualmente entre os quatro.*/
        
        Scanner sc = new Scanner(System.in);
        
        int amigos = 4;
        double conta;
        double pagamento = 100.00;
        double sobraConta;
        
        System.out.println("Digite o valor da conta: ");
        conta = sc.nextDouble();
        
        sc.close();
        
        pagamento = amigos * pagamento;
        sobraConta = conta % pagamento;
        
        System.out.printf("O valor que vai sobrar para pagar a conta: R$ %.2f\n", sobraConta);
        
    }
    
}
