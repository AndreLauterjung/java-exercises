/* Enunciado do exercício:

Verificando duplicados antes de adicionar.

- Crie um ArrayList<String> chamado nomesCadastrados, e adicione 3 nomes (ex: "André", "Maria", "João"). 

- Peça para o usuário (com Scanner) digitar um nome. 

Antes de adicionar, verifique com .contains() se esse nome já existe na lista. 

    - Se já existir, imprima "Esse nome já está cadastrado!" e não adicione. 
    - Se não existir, adicione o nome na lista com .add(), e imprima "Nome cadastrado com sucesso!". 

- No final (independente do que aconteceu), percorra a lista inteira com for + .size() + .get(i), imprimindo todos os
nomes cadastrados. */

package exercise09;

import java.util.ArrayList;
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
        ArrayList<String> nomesCadastrados = new ArrayList<>();
        
        nomesCadastrados.add("André");
        nomesCadastrados.add("Maria");
        nomesCadastrados.add("João");
        
        System.out.println("Digite um nome: ");
        String nomeEntrada = sc.nextLine();
        sc.close();
        
        if(nomesCadastrados.contains(nomeEntrada))
        {
            System.out.println("Esse nome já está cadastrado!");
        }
        else
        {
            nomesCadastrados.add(nomeEntrada);
            System.out.println("Nome cadastrado com sucesso!");
        }
        
        System.out.println("********* Lista de Nomes ************");
        for(int i = 0; i < nomesCadastrados.size(); i++)
        {
            int posicaoNome = i + 1;
            System.out.println(posicaoNome+" : "+nomesCadastrados.get(i));
        }
    }
}
