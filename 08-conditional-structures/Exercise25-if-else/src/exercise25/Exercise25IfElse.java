package exercise25;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise25IfElse
{

    public static void main(String[] args)
    {
        /* Distribuição de Cédulas em Caixa Eletrônico: Desenvolva a lógica de um terminal de
        autoatendimento bancário. Receba um valor inteiro solicitado para saque. Utilizando
        divisões inteiras e operadores de módulo consecutivamente, calcule e exiba a menor
        quantidade possível de notas físicas necessárias para compor o valor, trabalhando
        exclusivamente com cédulas de R$ 100, R$ 50, R$ 20 e R$ 10. */
        
        
        Scanner sc = new Scanner(System.in);
        
        int valorUsuario = -1;
        
        System.out.println("- - - - - - SACAR DINHEIRO - - - - - - - ");
        System.out.println("Digite o valor que deseja sacar (número inteiro): ");
        System.out.println("Valor mínimo: R$ 10");
        valorUsuario = sc.nextInt();
        sc.close();
        
        
        int qtdNotasCem = 0;
        int qtdNotasCinquenta = 0;
        int qtdNotasVinte = 0;
        int qtdNotasDez = 0;
        
        int restoUm;
        
        // talvez eu não precise desse tanto de variáveis "resto"
        
        restoUm = valorUsuario % 100;
        qtdNotasCem = valorUsuario / 100;
   
        if(restoUm > 0)
        {
            int restoDois = restoUm % 50; // realiza o calculo e armazena na variável restoDois
            qtdNotasCinquenta = restoUm / 50;
            
            if(restoDois > 0) // se sobrar algum valor depois do restoUm % 50, roda este if
            {
                int restoTres = restoDois % 20;
                qtdNotasVinte = restoDois / 20;
                
                if(restoTres>0)
                {
                    qtdNotasDez = restoTres / 10;
                }
                
            }
        } 
        int somaNotas = qtdNotasCem + qtdNotasCinquenta + qtdNotasVinte + qtdNotasDez;
        System.out.println("Menor quantiade de notas necessárias para compor o valor: "+somaNotas);
        System.out.println("QUANTIDADE NOTAS DE R$ 100: "+qtdNotasCem);
        System.out.println("QUANTIDADE NOTAS DE R$ 50: "+qtdNotasCinquenta);
        System.out.println("QUANTIDADE NOTAS DE R$ 20: "+qtdNotasVinte);
        System.out.println("QUANTIDADE NOTAS DE R$ 10: "+qtdNotasDez);
        
    }
    
    

}
