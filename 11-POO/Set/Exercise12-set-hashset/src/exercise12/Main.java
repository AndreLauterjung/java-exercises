/* Enunciado do exercício: 

Ingressos (três atributos)

- Crie a classe Ingresso com evento (String), setor (String) e assento (int), construtor e getters. 
- Sobrescreva equals e hashCode comparando os três atributos, ligados com && no equals. 
- Adicione: Show / Pista / 10, Show / Pista / 11, Show / Camarote / 10, Teatro / Pista / 10 e Show / Pista / 10 de novo. 
- Imprima Vendido! ou Assento ocupado! para cada tentativa, e o tamanho no fim. 

Esperado: só a última tentativa é recusada, e o tamanho é 4. O mesmo número de assento em outro setor ou outro
evento é um ingresso diferente. */

package exercise12;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Set<Ingresso> eventos = new HashSet<>();
        
        System.out.println(eventos.add(new Ingresso("Show", "Pista", 10)) ? "Ingresso vendido": "Assento ocupado");
        System.out.println(eventos.add(new Ingresso("Show", "Pista", 11)) ? "Ingresso vendido": "Assento ocupado");
        System.out.println(eventos.add(new Ingresso("Show", "Camarote", 10)) ? "Ingresso vendido": "Assento ocupado");
        System.out.println(eventos.add(new Ingresso("Teatro", "Pista", 10)) ? "Ingresso vendido": "Assento ocupado");
        System.out.println(eventos.add(new Ingresso("Show", "Pista", 10)) ? "Ingresso vendido": "Assento ocupado");

        
        System.out.println("Quantidade de eventos: "+eventos.size());
        
        
    }
}
