package exercise04;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise04
{

    public static void main(String[] args)
    {
        /* Alarme de Data Center: O sistema de refrigeração monitora o ambiente das máquinas.
        Receba a temperatura atual e valide se ela está dentro do intervalo seguro: simultaneamente
        acima de 20°C e abaixo de 30°C. */
        
        Scanner sc = new Scanner(System.in);
        
        double tempMaxSistema = 30.0;
        double tempMinSistema = 20.0;
        double tempInfoUsuario = 0.0;
        
        System.out.println("- - Verificação de Temperatura Ambiente das Máquinas - -");
        System.out.println("Digite a temperatura do ambiente: ");
        tempInfoUsuario = sc.nextDouble();
        
        sc.close();
        
        boolean isTemperaturaAdequada = tempInfoUsuario > tempMinSistema && tempInfoUsuario < tempMaxSistema;
        
        System.out.println("======================================");
        System.out.println("A temperatura está ideal no ambiente: ");
        System.out.println("Resposta do programa: "+isTemperaturaAdequada);
        System.out.println("======================================");
        
    }
    
}
