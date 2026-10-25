/* Enunciado do exercício:

Vizinhos, com amostra

Os métodos de navegação recebem um objeto do tipo do conjunto. Para perguntar sobre “100 pontos”, você cria
um Cliente de mentira com 100 pontos, só para servir de régua.

- Crie a classe Cliente com nome (String) e pontos (int), construtor e getters.
- Faça-a implementar Comparable<Cliente>, com o compareTo comparando os pontos..
- Na Main, crie NavigableSet<Cliente> ranking = new TreeSet<>();.
- Adicione Ana 120, Bruno 80 e Carla 200.

- Crie Cliente amostra100 = new Cliente("amostra", 100);. 
- Imprima o nome do ranking.ceiling(amostra100) (o primeiro com 100 pontos ou mais). 
- Crie uma amostra de 90 pontos e imprima o nome do floor dela (o último com 90 pontos ou menos). 
- Para os vizinhos da Ana, use lower e higher passando a própria Ana, e imprima os nomes. 
- Crie uma amostra de 50 pontos e use o floor. Como não há ninguém com 50 ou menos, o resultado é null:
imprima Sem vizinho! com o ternário.. 

Esperado: ceiling(100) dá Ana, floor(90) dá Bruno, abaixo da Ana é Bruno, acima é Carla,
e o floor de 50 dá Sem vizinho!. */

package exercise19;

import java.util.NavigableSet;
import java.util.TreeSet;
/**
 *
 * @author andrelauterjung
 */
public class Main{
    
    public static void main(String[] args){
        
        NavigableSet<Cliente> ranking = new TreeSet<>();
        
        Cliente ana = new Cliente("Ana", 120);
        Cliente bruno  = new Cliente("Bruno", 80); 
        Cliente carla = new Cliente("Carla", 200); 
        
        ranking.add(ana);
        ranking.add(bruno);
        ranking.add(carla);
        
        Cliente amostra100 = new Cliente("amostra", 100);
        Cliente amostra90 = new Cliente("amostra", 90);
        Cliente amostra50 = new Cliente("amostra", 50);
        
        System.out.println(ranking.ceiling(amostra100).getNome());
        System.out.println(ranking.floor(amostra90).getNome());
        
        System.out.println("Acima da Ana no ranking: "+ranking.higher(ana).getNome());
        System.out.println("Abaixo da Ana no ranking: "+ranking.lower(ana).getNome());
        
        System.out.println("floor(50): "+ (ranking.floor(amostra50) != null ? ranking.floor(amostra50): "Sem vizinho"));
        
    }
}
