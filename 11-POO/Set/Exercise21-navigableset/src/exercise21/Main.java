/* Enunciado do exercício:

Ranking com desempate (e o TreeSet)

- Crie a classe Estudante com nome (String) e nota (double), construtor e getters. 
- Implemente Comparable<Estudante>, ordenando por nota decrescente. Se as notas forem iguais, desempate pelo
nome em ordem alfabética. Dica: guarde o resultado da primeira comparação numa variável int. Se ela não for 0,
devolva-a. Se for 0, devolva a comparação dos nomes. 

- Crie um ArrayList<Estudante> com Ana 8.5, Bruno 9.0, Carla 8.5, Diego 9.0 e Eva 7.0. 
-  Ordene com Collections.sort e imprima. 
- Crie um TreeSet<Estudante>, adicione os mesmos cinco e imprima o tamanho. 
- Para ver o efeito do desempate, tire-o do compareTo (compare só a nota), rode de novo e imprima o tamanho e
os nomes que ficaram. 

Esperado:

- Ordenados: Bruno, Diego, Ana, Carla e Eva. 
- Com desempate, o TreeSet tem tamanho 5. 
- Sem desempate, o tamanho cai para 3 e ficam Bruno, Ana e Eva. Carla e Diego foram recusados, porque o
compareTo deu 0 com quem já estava lá. */

package exercise21;

import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Estudante> estudantes = new ArrayList<>();
        NavigableSet<Estudante> estudantesSet = new TreeSet<>();
        
        estudantes.add(new Estudante("Ana", 8.5));
        estudantes.add(new Estudante("Bruno", 9.0));
        estudantes.add(new Estudante("Carla", 8.5));
        estudantes.add(new Estudante("Diego", 9.0));
        estudantes.add(new Estudante("Eva", 7.0));
        
        Collections.sort(estudantes);
        
        System.out.println("Lista de estudantes: ");
        for(Estudante estudante: estudantes) {
            System.out.println(estudante.getNome()+" \t| "+estudante.getNota());
        }
        
        estudantesSet.add(new Estudante("Ana", 8.5));
        estudantesSet.add(new Estudante("Bruno", 9.0));
        estudantesSet.add(new Estudante("Carla", 8.5));
        estudantesSet.add(new Estudante("Diego", 9.0));
        estudantesSet.add(new Estudante("Eva", 7.0));
        
        System.out.println("\nTamanho do conjunto: "+estudantesSet.size());
        
        System.out.println("\nLista de estudantes TREE SET: ");
        for(Estudante estudanteSet: estudantesSet) {
            System.out.println(estudanteSet.getNome()+" \t| "+estudanteSet.getNota());
        }
    }
}
