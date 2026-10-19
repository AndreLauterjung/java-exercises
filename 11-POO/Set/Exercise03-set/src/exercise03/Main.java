/* Enunciado do exercício:

Portaria do prédio

Crie um Set<String> com os moradores autorizados: “Marcos”, “Julia”, “Pedro” e “Sofia”.

Simule a portaria:

Verifique se “Julia” está autorizada e imprima “Pode entrar” ou “Acesso negado”.
Faça o mesmo para “Carlos”.
Remova “Pedro” (ele se mudou) e imprima o tamanho do Set.
Tente remover “Carlos” e imprima o resultado do remove. O que ele devolve quando o nome não existe?

 */
package exercise03;

import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Set<String> moradores = new HashSet<>();
        
        moradores.add("Marcos");
        moradores.add("Julia");
        moradores.add("Pedro");
        moradores.add("Sofia");
        
        if(moradores.contains("Julia"))
        {
            System.out.println("Pode entrar");
        }
        else
        {
            System.out.println("Acesso negado!");
        }
        
        if(moradores.contains("Carlos"))
        {
            System.out.println("Pode entrar");
        }
        else
        {
            System.out.println("Acesso negado!");
        }
        
        
        moradores.remove("Pedro");
        
        System.out.println(moradores.size());
        
        // false
        System.out.println(moradores.remove("Carlos"));
    }
}
