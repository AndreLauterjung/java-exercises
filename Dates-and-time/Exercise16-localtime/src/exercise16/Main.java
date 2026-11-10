/* Enunciado do exercício:

Hora digitada

- Crie DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");. 
- Peça Digite uma hora (HH:mm): com Scanner, lendo com nextLine(). 
- Transforme em LocalTime com LocalTime.parse(texto, formato). 
- Imprima a hora formatada com hora.format(formato). 
- Crie LocalTime depois = hora.plusMinutes(90); e imprima Daqui a 90 minutos: ..., formatada. 
- Imprima também a hora com segundos, usando um segundo formatador "HH:mm:ss". 

Esperado, para 09:05: 09:05, Daqui a 90 minutos: 10:35 e 09:05:00. */

package exercise16;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formatoSegundos = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        
        System.out.println("Digite a hora (HH:mm): ");
        String horaUsuario = sc.nextLine();
        sc.close();
        
        LocalTime hora = LocalTime.parse(horaUsuario, formato);
        LocalTime depois = hora.plusMinutes(90);
        
        System.out.println("Hora: "+hora.format(formato));
        System.out.println("Daqui 90 minutos: "+depois.format(formatoSegundos));
    }
}
