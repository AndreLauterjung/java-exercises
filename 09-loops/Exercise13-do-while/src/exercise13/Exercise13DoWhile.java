package exercise13;

/**
 *
 * @author andrelauterjung
 */
public class Exercise13DoWhile
{

    public static void main(String[] args)
    {
        /* Lançamento de Dados de Rolo: Crie um programa que simule a rolagem de um
        dado de 6 faces. Exiba o resultado sorteado a cada rodada e continue rolando
        obrigatoriamente até que o valor tirado seja o número 6. */
        
        boolean isRunning = true;
        int ladoDado = 1;
        
        
        do
        {
            System.out.println("====================");
            System.out.println("Rolando dado...");
            System.out.println("Valor da rodada: "+ladoDado);
            System.out.println("====================");
            ladoDado++;
                    
            if(ladoDado > 6)
            {
                System.out.println("PROGRAMA ENCERRADO!");
                System.out.println("====================");
                isRunning = false;  
            }
        }
        while(isRunning);
  
    }
    
}
