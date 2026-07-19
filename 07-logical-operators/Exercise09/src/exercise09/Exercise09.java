package exercise09;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise09
{

    public static void main(String[] args)
    {
        /* Escala de Descanso: O software de ponto avalia os dias da semana para aplicar regras
        de plantão. Receba o nome do dia atual e valide se ele corresponde a "Sábado" OU a
        "Domingo". */
        
        
        Scanner sc = new Scanner(System.in);
        
        String plantaoSab = "sabado";
        String plantaoDom = "domingo";
        
        String respDiaUsuario = "";
        
        
        System.out.println("- - - Verificação de plantão - - - ");
        System.out.println("Digite que dia é hoje: ");
        respDiaUsuario = sc.nextLine();
        
        sc.close();
        
        boolean isDiaDePlantao = respDiaUsuario.equalsIgnoreCase(plantaoSab) || respDiaUsuario.equalsIgnoreCase(plantaoDom);
        
        System.out.println("============================================");
        System.out.println("Verificando se o dia conta como plantão...");
        System.out.println("Resposta do programa: "+isDiaDePlantao);
        System.out.println("============================================");
        
        
    }
    
}
