/* Enunciado do exercício:

Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:
        ◦ Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador, esse último deve ser sempre verdadeiro;
        ◦ Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, esse útimo deve ser sempre falso;
        ◦ Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.
Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes devem ter os seguintes métodos
    • A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
    • A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
    • A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;
*/

package exercise10;

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
        boolean isRodando = true;
        
        Gerente gerente = new Gerente("Gerente", "gerente123@gmail.com", "gerente123");
        Vendedor vendedor = new Vendedor("Vendedor", "vendedor123@gmail.com", "vendedor123");
        Atendente atendente = new Atendente("Atendente", "atendente@gmail.com", "atendente123");
        
        
        while(isRodando)
        {
            System.out.println("\n************ LOGIN NO SISTEMA **************");
            System.out.println("Digite o número da opação: ");
            System.out.println("0 - Fechar programa");
            System.out.println("1 - Fazer login como gerente");
            System.out.println("2 - Fazer login como vendedor");
            System.out.println("3 - Fazer login como atendente");
            int opcao = sc.nextInt();
            
            switch(opcao)
            {
                case 0:
                    isRodando = false;
                    break;
                    
                case 1:
                    
                    if(gerente instanceof Gerente)
                    {
                        gerente.menuOpcoesGerente(sc, gerente, vendedor, atendente);
                    }
                    
                    break;
                    
                case 2:
                    
                    if(vendedor instanceof Vendedor)
                    {
                        vendedor.menuOpcoesVendedor(sc, atendente, vendedor);
                    }
                    
                    break;
                    
                case 3:
                    
                    if(atendente instanceof Atendente)
                    {
                        atendente.menuOpcoesAtendente(sc, atendente);
                    }
                    
                    break;
                    
                default:
                    System.out.println("Número inválido!");
                    System.out.println("Tente novamente!");
                    
            }
        }
        
        sc.close();
        
    } 
    
}
