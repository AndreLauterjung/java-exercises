package exercise48;

/**
 *
 * @author andrelauterjung
 */
public class Exercise48
{

    public static void main(String[] args)
    {
    
        // Média de Pontos: Em um campeonato, vitórias valem 3 pontos e empates 1.
        // Calcule a média de pontos de um time com 10 vitórias e 5 empates em 20 jogos.
    
        int vitoria = 3, empate = 1, pontosTime;
        
        pontosTime = (10 * vitoria)+(5*empate);
        
        System.out.println("Total de pontos do time após 20 jogos: "+pontosTime);
    }
    
}