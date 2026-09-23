package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Gato extends Animal
{
    private String racaGato;
    
    public Gato(String nome, int idade, String racaGato)
    {
        super(nome, idade);
        this.racaGato = racaGato;
    }
    
    @Override
    public String emitirSom()
    {
        return "Miau Miau Miau";
    }
    
    
    public String getRacaGato()
    {
        return this.racaGato;
    }
}
