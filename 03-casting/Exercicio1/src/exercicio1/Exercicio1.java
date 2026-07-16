package exercicio1;

/**
 *
 * @author andrelauterjung
 */
public class Exercicio1
{
    public static void main(String[] args)
    {
        /* O programa faz o casting automático quando um valor menor
        precisa ir para um tipo maior. 
        
        Como neste exemplo abaixo, um valor do tipo byte pode ser convertido
        automáticamente para um valor do tipo short sem nenhum problema. 
        
        [byte] -> [short] -> [int] -> [long] -> [float] -> [double] 
        
        
        Porém, se um valor do tipo short for convertido para byte, pode haver
        perda de dados. Então por isso que o desenvolvedor precisa fazer 
        manualmente a conversão */
           
        byte age1 = 23;
        float ageF = 29.99f;
        double ageD = 24.12;
        int newAge;
        
        newAge = age1;
        System.out.println("Age int: " + newAge);
        
        newAge = (int) ageD;
        System.out.println("Age double: " + newAge);
        
        newAge = (int) ageF;
        System.out.println("Age float: " + newAge);
        
    }
}
