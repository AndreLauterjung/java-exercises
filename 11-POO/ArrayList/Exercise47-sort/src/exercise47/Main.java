/* Enunciado do exercício:

Lista de convidados (String)

- Crie um ArrayList<String> chamado convidados com Marina, carlos, Beatriz, André e daniela.
- Ordene com Collections.sort(convidados) e imprima.
- Ordene de novo com Collections.sort(convidados, String.CASE_INSENSITIVE_ORDER) e imprima. Esse segundo
parâmetro é uma regra de ordem pronta, que ignora maiúsculas e minúsculas. */

package exercise47;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> listaConvidados = new ArrayList<>();
        
        listaConvidados.add("Marina");
        listaConvidados.add("carlos");
        listaConvidados.add("Beatriz");
        listaConvidados.add("André");
        listaConvidados.add("daniela");
        
        
        Collections.sort(listaConvidados);
        
        
        System.out.println("\nLista de convidados: ");
        for(String convidado: listaConvidados)
        {
            System.out.println(convidado);
        }
        
        Collections.sort(listaConvidados, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nLista de convidados: ");
        for(String convidado: listaConvidados)
        {
            System.out.println(convidado);
        }
        
    }
}
