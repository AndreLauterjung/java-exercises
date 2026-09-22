package exercise02;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        /* Sobrescrita de Método (@Override)
        
        1. Na classe Animal, crie um método chamado emitirSom() que imprima algo 
        genérico (ex: "O animal faz um som").
        
        2. Na classe Cachorro, sobrescreva (@Override) o método emitirSom() para 
        que ele imprima "Au Au!".
        
        3. (Opcional) Crie outro animal, como um Gato, que também herde de Animal 
        e imprima "Miau!" no método sobrescrito.Sobrescrita de Método (@Override)

        */
        
        Cachorro doguinho = new Cachorro();
        Gato gatinho = new Gato();
        
        System.out.println(doguinho.emitirSom());
        System.out.println(gatinho.emitirSom());
        
        
    }
}
