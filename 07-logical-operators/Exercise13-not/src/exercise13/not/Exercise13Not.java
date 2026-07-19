package exercise13.not;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise13Not
{

    public static void main(String[] args)
    {
        /* Alarme Residencial: Um sistema de segurança residencial deve ser acionado sob
        condições específicas de horário. Receba o sinal do sensor de presença e o status do horário
        comercial, disparando o alarme se houver presença E NÃO estarmos em horário comercial. */
        
        Scanner sc = new Scanner(System.in);
        
        int horarioAbertura = 9;
        int horarioFechamento = 17;
        
        String haPresenca = "";
        int horaUsuario = -1;
        
        System.out.println("- - - Verificação de invasores - - -");
        System.out.println("Há alguma presença no estabelecimento? ");
        haPresenca = sc.nextLine();
        
        System.out.println("Digite a hora atual (Exemplos: 9, 10, 11, ...): ");
        horaUsuario = sc.nextInt();
        
        sc.close();
        
        boolean isAlarmeLigado = haPresenca.equalsIgnoreCase("sim") && !(horaUsuario >= horarioAbertura && horaUsuario <= horarioFechamento);
        
        System.out.println("===========================");
        System.out.println("O alarme está ligado? ");
        System.out.println("Resposta do programa: "+isAlarmeLigado);
        System.out.println("===========================");
        
    }
    
}
