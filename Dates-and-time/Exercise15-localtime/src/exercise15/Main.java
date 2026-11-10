/* Enunciado do exercício:

Duração de um filme

Método novo: ChronoUnit.MINUTES.between(inicio, fim) devolve quantos minutos existem entre duas horas,
como um long. É o mesmo between que você usou com os dias.

- Crie inicio = LocalTime.of(20, 15) e fim = LocalTime.of(22, 45). 
- Calcule long minutos = ChronoUnit.MINUTES.between(inicio, fim); e imprima. 
- Converta em horas e minutos: as horas são minutos / 60 e os minutos que sobram são minutos % 60. Imprima
Duração: 2h30min. 

- Troque a ordem (between(fim, inicio)). 

Esperado: 150 minutos, depois Duração: 2h30min, e com a ordem trocada o resultado fica negativo (-150). */

package exercise15;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        LocalTime inicio = LocalTime.of(20, 15);
        LocalTime fim = LocalTime.of(22, 45);
        
        long minutos = ChronoUnit.MINUTES.between(inicio, fim);
        
        int horas = (int) minutos / 60;
        int minutosFilme = (int) minutos % 60;
        
        System.out.println("\n=========================================");
        System.out.println("Minutos: "+minutos);
        System.out.println("Duração: "+horas+"h "+minutosFilme+"min");
        
        System.out.println("\n=========================================");
        System.out.println("Programa encerrado!");
        System.out.println("=========================================");
    }
}
