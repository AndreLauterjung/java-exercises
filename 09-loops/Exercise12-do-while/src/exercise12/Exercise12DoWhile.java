package exercise12;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise12DoWhile
{

    public static void main(String[] args)
    {
        /* Sensor de Leitura contínua: Simule a leitura de dados de um sensor térmico
        solicitando temperaturas do usuário. O loop só deve encerrar quando for digitado o
        valor de parada técnica -999. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isRunning = true;
        double temperatura = 0.0;
        
        
        do
        {
            System.out.println("====== SENSOR DE TEMPERATURAS =======");
            System.out.println("Digite a temperatura (em ºC): ");
            temperatura = sc.nextDouble();
            
            System.out.println("=====================================");
            
            if(temperatura == -999.0)
            {
                System.out.println("\nPROGRAMA ENCERRADO!");
                System.out.println("=====================================");
                isRunning = false;
            }
     
        }
        while(isRunning);
        
    }
    
}
