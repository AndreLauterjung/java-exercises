package exercise03;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        /* Enunciado do exercício:
        
        Polimorfismo na Prática

        1. Na sua classe Main (com o método main), crie objetos usando a regra 
        do polimorfismo, ou seja, declarando o tipo da mãe e instanciando o filho:

        2. Chame o método emitirSom() de cada um deles e veja o Java executar a 
        versão específica de cada classe filha automaticamente! */
        
        Animal gatinho = new Gato("Leopoldo", 7, "Persa");
        Animal doguinho = new Cachorro("Max", 12, "Pinscher");
        
        System.out.println("\nNome do animal: "+gatinho.getNomeAnimal());
        System.out.println("Idade do animal: "+gatinho.getIdadeAnimal());
        System.out.println("Raça do animal: "+((Gato)gatinho).getRacaGato());
        System.out.println("Som emitido: "+gatinho.emitirSom());
        
        System.out.println("\nNome do animal: "+doguinho.getNomeAnimal());
        System.out.println("Idade do animal: "+doguinho.getIdadeAnimal());
        System.out.println("Raça do animal: "+((Cachorro)doguinho).getRacaCachorro());
        System.out.println("Som emitido: "+doguinho.emitirSom());
        
    }
}
