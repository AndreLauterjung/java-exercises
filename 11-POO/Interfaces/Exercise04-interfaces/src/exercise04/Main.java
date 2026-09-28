/* Enunciado do exercício:

Pagamentos diferentes.

Crie a interface Pagavel com double calcularPagamento();. Crie três classes com 
atributos e construtores próprios:

- Funcionario (salário mensal): paga o salário. 
- Fornecedor (valor da nota): paga o valor da nota. 
- Freelancer (horas trabalhadas e valor por hora): paga horas × valor por hora. 

*/

package exercise04;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        double totalPagamento = 0.0;
        
        Pagavel[] pagamentos = {new Funcionario(1621.0, "André"),
        new Freelancer("André", 10, 8.0),
        new Fornecedor("LojaASDF", 5000.0)};
        
        for(Pagavel colaborador : pagamentos)
        {
            if(colaborador instanceof Funcionario)
            {
                System.out.println("\nValor a pagar para o Funcionário: ");
                System.out.printf("R$ %.2f\n", colaborador.calcularPagamento());
            
                totalPagamento += colaborador.calcularPagamento();
            }
            else if(colaborador instanceof Fornecedor)
            {
                System.out.println("\nValor a pagar para o Fornecedor: ");
                System.out.printf("R$ %.2f\n", colaborador.calcularPagamento());
            
                totalPagamento += colaborador.calcularPagamento();
            }
            else if(colaborador instanceof Freelancer)
            {
                System.out.println("\nValor a pagar para o Freelancer: ");
                System.out.printf("R$ %.2f\n", colaborador.calcularPagamento());
            
                totalPagamento += colaborador.calcularPagamento();
            }
            
        }
        
        System.out.println("\n================================");
        System.out.printf("TOTAL A SER PAGO: R$ %.2f \n", totalPagamento);
        System.out.println("================================");
    }
}
