package exercise20;


import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise20For {

    public static void main(String[] args)
    {
        /* Cálculo de Fatorial: Solicite um número inteiro positivo ao usuário e calcule o seu
        fatorial utilizando a estrutura for. */
        
        
        Scanner sc = new Scanner(System.in);
        
        int numeroUsuario = 0;
        int resultadoFatorial = 1;
        
        System.out.println("=========== CALCULANDO FATORIAL ==============");
        System.out.println("Digite um número inteiro: ");
        numeroUsuario = sc.nextInt();
        sc.close();

        
        for(int i = numeroUsuario; i > 0; i--)
        {
            resultadoFatorial *= i;

        }
        
        System.out.printf("RESULTADO DE %d! = %d", numeroUsuario, resultadoFatorial);
        
        System.out.println("\n==============================================");
        System.out.println("============= PROGRAMA ENCERRADO =============");
        System.out.println("==============================================");
        
    }
    
}
