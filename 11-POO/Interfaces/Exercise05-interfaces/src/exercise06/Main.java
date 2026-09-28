/* Enunciado do exercício:

Duas interfaces na mesma classe.

Crie as interfaces Voador (void voar();) e Nadador (void nadar();).

Crie:

- Pato, que implementa as duas; 
- Aviao, que implementa só Voador; 
- Peixe, que implementa só Nadador. 

No main, crie um Voador[] (Pato e Aviao) e um Nadador[] (Pato e Peixe). 
Repare que o mesmo Pato cabe nos dois arrays.

*/
package exercise06;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Voador[] voa = {new Pato(), new Aviao()};
        Nadador[] nada = {new Pato(), new Peixe()};
        
        for(Voador voador : voa)
        {
            voador.voar();
        }
        
        for(Nadador nadador : nada)
        {
            nadador.nadar();
        }
                
    }
}
