/* Enunciado do exercício:

Cidade (dois atributos String)

- Crie a classe Cidade com nome e estado (ambos String), construtor e getters. 
- Sobrescreva o equals para que duas cidades sejam iguais só quando o nome e o estado forem iguais (ignorando
maiúsculas nos dois). Junte as comparações com &&. 
- Crie um ArrayList<Cidade> com Santa Rita de PB e Campinas de SP. 

- Teste contains com: santa rita de pb; Santa Rita de MA; Campinas de MG. */

package exercise44;

import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Cidade> cidades = new ArrayList<>();
        
        cidades.add(new Cidade("Santa Rita", "PB"));
        cidades.add(new Cidade("Campinas", "SP"));
        cidades.add(new Cidade("Formosa", "GO"));
        
        boolean isCidadeNaLista = cidades.contains(new Cidade("Campinas", "MG"));
        
        if(isCidadeNaLista)
        {
            System.out.println("Cidade já adicionada na lista!");
        }
        else
        {
            System.out.println("A cidade não está na lista!");
        }
    }
}
