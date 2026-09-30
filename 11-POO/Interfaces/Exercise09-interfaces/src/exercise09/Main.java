/* Enunciado do exercício:

Crie as interfaces Desenhavel (void desenhar();) e 
Redimensionavel (void redimensionar(double fator);).

Crie:

- Circulo e Quadrado, que implementam as duas; 

- Texto, que implementa só Desenhavel. 

No main, monte um Desenhavel[] com os três e chame desenhar() em todos. 
Depois, use instanceof Redimensionavel para redimensionar só quem tiver essa 
capacidade.

*/

package exercise09;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Desenhavel[] desenhos = {new Circulo(),
        new Quadrado(),
        new Texto(),
        new Quadrado(),
        new Texto(),
        new Circulo()};
        
        
        
        for(Desenhavel desenho : desenhos)
        {
            desenho.desenhar();
            
            if(desenho instanceof Redimensionavel)
            {
                ((Redimensionavel) desenho).redimensionar(5.0);
            }
            
        }
        System.out.println("===================================");
    }
}
