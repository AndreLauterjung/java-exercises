/* Enunciado do exercício:

Polimorfismo com formas geométricas

Crie uma classe FormaGeometrica com um método calcularArea() que retorna 0.

Crie as subclasses Retangulo (com base e altura) e Circulo (com raio), cada uma
sobrescrevendo calcularArea() com a fórmula correta.

No main, crie um array (ou ArrayList) do tipo FormaGeometrica, adicione objeto
de  Retangulo e Circulo nele, e percorra o array chamando calcularArea() de 
cada um — repare que o método certo é chamado automaticamente para cada tipo
(isso é o polimorfismo em ação!).*/

package exercise13;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        FormaGeometrica[] formas = {new Retangulo(10.0, 20.0), new Circulo(5.0)};
        
        for(FormaGeometrica forma : formas)
        {
            System.out.println(forma.calcularArea());
        }
            
    }
}
