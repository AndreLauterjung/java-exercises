package exercise06;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise06
{

    public static void main(String[] args)
    {
        /* Desconto Cultural: Um cinema concede meia-entrada por perfil ou idade. Receba o tipo
        de cliente e a idade do comprador, aplicando o benefício se o tipo for "estudante" OU se a
        idade for menor que 18 anos. */
        
        Scanner sc = new Scanner(System.in);
        
        String clienteEstudante = "sim";
        int idadeClienteSist = 18;
        
        String respUsuarioTipoCliente = "";
        int respIdadeCliente = -1;
        
        System.out.println("- - - - Verificação de desconto - - - - ");
        System.out.println("Digite a sua idade: ");
        respIdadeCliente = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Você é estudante? (Digite \"sim\" ou \"não\")");
        respUsuarioTipoCliente = sc.nextLine();
        
        sc.close();
        
        boolean isDescontoAprovado = respUsuarioTipoCliente.equalsIgnoreCase(clienteEstudante)|| respIdadeCliente < idadeClienteSist;
        
        System.out.println("==============================");
        System.out.println("Desconto Aprovado? ");
        System.out.println("Resposta do programa: "+isDescontoAprovado);
        System.out.println("==============================");
        
    }
    
}
