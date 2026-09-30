/* Enunciado do exercício:

Integrador, meios de pagamento
.
Crie a interface MeioPagamento com boolean pagar(double valor); 
e String getNome();.

Crie:

- Cartao (com limite): paga se o valor for menor ou igual ao limite e, 
nesse caso, diminui o limite; 

- Pix (com saldo): paga se houver saldo suficiente e diminui o saldo; 

- Dinheiro: sempre retorna true. 

Crie a classe Loja com o método finalizarCompra(MeioPagamento meio,
double valor), que chama pagar() e imprime "Compra aprovada via X" ou 
"Compra recusada via X". No main, faça várias compras com meios diferentes 
(inclusive uma que seja recusada).

*/
package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        MeioPagamento[] meioPag = {new Cartao("Cartao", 500), 
        new Pix("Pix", 240), 
        new Dinheiro("Dinheiro")};
        
        Loja loja = new Loja();
        
        for(MeioPagamento meio : meioPag)
        {
            loja.finalizarCompra(meio, 200);
        }
    }
}
