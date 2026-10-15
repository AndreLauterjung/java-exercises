/* Enunciado do exercício:

Carro (ignorando maiúsculas)

- Crie a classe Carro com placa e modelo (ambos String), construtor e getters. 
- Sobrescreva o equals para comparar só a placa, ignorando maiúsculas e minúsculas. 
- Crie um ArrayList<Carro> com 3 carros, um deles com a placa ABC1D23. 
- Peça uma placa ao usuário com Scanner, crie um Carro com ela e use .contains(). Se já existir, imprima Carro já
cadastrado!. Se não, adicione e imprima Carro adicionado!.  */

package exercise43;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> garagem = new ArrayList<>();
        
        garagem.add(new Carro("Fusca", "ABC1D23"));
        garagem.add(new Carro("Palio", "ASD4U30"));
        garagem.add(new Carro("BMW", "JDA2R32"));
        
        System.out.println("Digite o modelo do carro: ");
        String novoModelo = sc.nextLine();
        
        System.out.println("Digite a placa do carro: ");
        String novaPlaca = sc.nextLine();
        sc.close();
        
        boolean isNaGaragem = garagem.contains(new Carro(novoModelo, novaPlaca));
        
        if(isNaGaragem)
        {
            System.out.println("Carro já cadastrado!");
        }
        else
        {
            garagem.add(new Carro(novoModelo, novaPlaca));
            System.out.println("Carro adicionado!");
        }
        
    }
}
