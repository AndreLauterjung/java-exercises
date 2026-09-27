/* Enunciado do exercício:

Contas bancárias com polimorfismo

Crie uma classe Conta com atributo Saldo e um método sacar(double valor) que 
apenas subtrai o valor do saldo (sem nenhuma taxa).

Crie duas subclasses:

ContaCorrente, que sobrescreve sacar() para cobrar uma taxa fixa de R$2,00 a 
mais a cada saque; 

ContaPoupanca, que não sobrescreve sacar() (herda o comportamento padrão).

No main, crie uma lista de Conta misturando os dois tipos, faça um saque de 
cada uma dentro de um loop, e observe como o comportamento muda dependendo do 
tipo real do objeto.

*/

package exercise15;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Conta[] contas = {new ContaCorrente(100.0),
            new ContaCorrente(50.0), 
            new ContaPoupanca(120.0), 
            new ContaCorrente(25.0),
            new ContaPoupanca(199.0), 
            new ContaPoupanca(200.0)};
        
        
        for(Conta conta : contas)
        {
            conta.sacarValor(10.0);
        }
    }
}
