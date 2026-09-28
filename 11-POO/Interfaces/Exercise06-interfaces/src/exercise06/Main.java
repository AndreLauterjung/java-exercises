/* Enunciado do exercício:

Herança + interface juntas.

Crie a classe Animal com o atributo nome e um método exibirNome().

Crie a interface Domestico com void brincar();.

Crie:

- Cachorro extends Animal implements Domestico; 

- Leao extends Animal (não implementa a interface). 

No main, monte um Animal[] com os dois. No loop, chame exibirNome() de todos e 
use instanceof Domestico para chamar brincar() só de quem for doméstico. 

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
        Animal[] animais = {new Cachorro("Lady"), new Cachorro("Bob"), new Cachorro("Kate"),
        new Leao("Alex"), new Cachorro("Snoopy"), new Cachorro("Charlotte"), new Leao("Max")};
        
        
        for(Animal animal : animais)
        {
            animal.exibirNome();
            
            if(animal instanceof Domestico)
            {
                ((Domestico) animal).brincar();
            }
        }
    }
}
