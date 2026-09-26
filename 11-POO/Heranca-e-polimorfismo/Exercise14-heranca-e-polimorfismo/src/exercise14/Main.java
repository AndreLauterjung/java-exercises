/* Enunciado do exercício:

Uso de super() e super.metodo()

Crie uma classe Veiculo com atributos Marca e Modelo, um construtor que recebe 
esses dois valores, e um método exibirInfo() que imprime "Marca: X, Modelo: Y".

Crie uma subclasse Carro que adiciona o atributo Quantidade de Portas.

No construtor de Carro, use super(marca, modelo) para inicializar os atributos 
herdados. Sobrescreva exibirInfo() para chamar super.exibirInfo() primeiro e 
depois imprimir também a quantidade de portas.
*/

package exercise14;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Carro carro = new Carro("BMW", "WXYZ", 2);
        
        carro.exibirInfo();
    }
}
