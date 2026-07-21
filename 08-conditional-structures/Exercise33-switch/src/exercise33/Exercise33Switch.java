package exercise33;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise33Switch
{

    public static void main(String[] args)
    {
        /* Conversor de Escala Térmica: Peça ao usuário para informar a temperatura em
        Celsius e escolher o destino de conversão via menu (1: Fahrenheit, 2: Kelvin).
        Apresente o resultado conforme a escolha. */
        
        Scanner sc = new Scanner(System.in);
        
        double temperaturaC = 0.0;
        double temperaturaF = 0.0;
        double temperaturaK = 0.0;
        int opcaoUsuario = -1;
        
        System.out.println("========= CONVERSOR DE TEMPERATURA =========");
        System.out.println("Digite a temperatura atual (em ºC): ");
        temperaturaC = sc.nextDouble();
        
        System.out.println("Digite o número da opção de conversão escolhida: ");
        System.out.println("1: Fahrenheit");
        System.out.println("2: Kelvin");
        opcaoUsuario = sc.nextInt();
        sc.close();
        
        
        switch(opcaoUsuario)
        {
            case 1:
                System.out.println("Convertendo ºC para ºF...");
                
                temperaturaF = temperaturaC * (9.0/5.0) + 32;
                System.out.println("Temperatura em ºC: "+temperaturaC);
                System.out.println("Temperatura em ºF: "+temperaturaF);
                break;
            case 2:
                System.out.println("Convertendo ºC para ºK...");
                
                temperaturaK = temperaturaC + 273.15;
                System.out.println("Temperatura em ºC: "+temperaturaC);
                System.out.println("Temperatura em ºF: "+temperaturaK);
                break;
            default:
                System.out.println("Opção Inválida!");
                System.out.println("TENTE NOVAMENTE!");
        }
        System.out.println("============================================");
    }
    
}
