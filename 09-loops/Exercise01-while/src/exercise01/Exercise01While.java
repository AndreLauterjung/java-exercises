package exercise01;

/**
 *
 * @author andrelauterjung
 */
public class Exercise01While
{

    public static void main(String[] args)
    {
        /* Contagem Regressiva para Lançamento: Faça um programa que imprima uma
        contagem de 10 até 0 usando while e, ao final, exiba a mensagem "Decolar!". */
        
        
        int contagem = 10;
        
        while(contagem >= 0)
        {
            System.out.println("Segundos para a decolagem: "+contagem);
            contagem--;
        }
        System.out.println("DECOLAR!");
        
    }
    
}
