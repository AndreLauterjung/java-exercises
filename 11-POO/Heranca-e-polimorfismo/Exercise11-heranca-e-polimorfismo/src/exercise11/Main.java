/* Enunciado do exercício:

Escreve uma hierarquia de classes para criação de relógios para diferentes 
lugares do mundo, defina uma classe pai que tenha as propriedades Hora, 
minuto e segundo com seus respectivos getters e setters (atendendo as regras 
do funcionamento de um relógio) e um método que deverá retornar a hora no 
formato HH:MM:SS, a partir dessa classe crie 2 implementações, uma chamada 
relógio Americando e outra chamada relógio Brasileiro, lembrando que para o 
relógio americano não existem as horas de 13 até 24. Defina também na super 
classe um método que ficará por responsabilidade da classe que extende-la 
definir seu funcionamemnto, esse método deve receber um relógio ( independente 
da implementação) e deve-se extrair as informações dele e usa-la no objeto 
que recebeu para setar as novas informações do relógio.

*/

package exercise11;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        RelogioBrasileiro relogioBrasil = new RelogioBrasileiro();
        RelogioAmericano relogioAmericano = new RelogioAmericano();
        
        
        System.out.println("Qual a sua região? (BR ou US");
        String regiao = sc.nextLine();
        
        if(regiao.equalsIgnoreCase("br"))
        {
            System.out.println("Hora no formato brasileiro.");
            System.out.println("Digite as horas: ");
            int hora = sc.nextInt();
            
            if(hora >= 0 && hora <= 23)
            {
                relogioBrasil.setHora(hora);
            }
            else
            {
                System.out.println("Hora inválida!");
            }
            
            System.out.println("Digite os minutos: ");
            int minuto = sc.nextInt();
            
            if(minuto >= 0 && minuto <=59)
            {
                relogioBrasil.setMinuto(minuto);
            }
            else
            {
                System.out.println("Minuto inválido!");
            }
            
            System.out.println("Digite os segundos: ");
            int segundo = sc.nextInt();
            
            if(segundo >= 0 && segundo <= 59)
            {
                relogioBrasil.setSegundo(segundo);
            }
            else
            {
                System.out.println("Segundos inválidos!");
            }
            
            System.out.println(relogioBrasil.mostrarHora(relogioBrasil));
            
            
            
        }
        else if(regiao.equalsIgnoreCase("us"))
        {
            System.out.println("Hora no formato brasileiro.");
            System.out.println("Digite as horas: ");
            int hora = sc.nextInt();
            
            if(hora >= 0 && hora <= 12)
            {
                relogioAmericano.setHora(hora);
            }
            else
            {
                System.out.println("Hora inválida!");
            }
            
            
            
            System.out.println("Digite os minutos: ");
            int minuto = sc.nextInt();
            
            if(minuto >= 0 && minuto <=59)
            {
                relogioAmericano.setMinuto(minuto);
            }
            else
            {
                System.out.println("Minuto inválido!");
            }
            
            
            
            System.out.println("Digite os segundos: ");
            int segundo = sc.nextInt();
            
            if(segundo >= 0 && segundo <= 59)
            {
                relogioAmericano.setSegundo(segundo);
            }
            else
            {
                System.out.println("Segundos inválidos!");
            }
            
            
            System.out.println(relogioAmericano.mostrarHora(relogioAmericano));
            
            
            
        }
    }
}
