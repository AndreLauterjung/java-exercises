/* Enunciado do exercício:

Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser 
comercializados em um cinema. O ingresso deve ter um valor, nome do filme e 
informar se é dublado ou legendado. A partir desse ingresso devem ser criados
os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que 
retorna o seu valor real ( baseado no valor informado na criação do ingresso) 
para os de meia entrada o seu valor deve ser de metade do valor, para os 
ingressos família deve-se retornar o valor multiplicado pelo número de pessoas 
e fornecer um desconto de 5% quando o número de pessoas for maior que 3. */


package exercise09;

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
        
        System.out.println("O filme é dublado ou legendado? ");
        String tituloFilme = sc.nextLine();
        
        System.out.println("Qual o nome do filme? ");
        String nomeFilme = sc.nextLine();
        
        System.out.println("Digite o valor original do ingresso: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Você deseja qual tipo de ingresso::");
        System.out.println("Inteira, meia ou família?");
        String escolha = sc.nextLine();
        
        
        if(escolha.equalsIgnoreCase("inteira"))
        {
            Ingresso ingresso = new Ingresso(valor, nomeFilme, tituloFilme);
            
            System.out.println(ingresso.valorDoIngresso());
        }
        else if(escolha.equalsIgnoreCase("meia"))
        {
            MeiaEntrada meia = new MeiaEntrada(valor, nomeFilme, tituloFilme);
            System.out.println(meia.valorDoIngresso());
            
            
        }
        else if(escolha.equalsIgnoreCase("familia"))
        {
            System.out.println("Quantas pessoas para o ingresso família? ");
            int pessoas = sc.nextInt();
            

            Familia familia = new Familia(valor, nomeFilme, tituloFilme, pessoas);
            System.out.println(familia.valorDoIngresso());
            
        }
               
    }
}
