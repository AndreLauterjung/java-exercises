package exercise22;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Exercise22IfElse
{

    public static void main(String[] args)
    {
        /* Validador de Data Real: Receba três valores inteiros: dia, mês e ano. Verifique se eles
        compõem uma data perfeitamente válida no calendário. Sua lógica deve validar se o mês
        está entre 1 e 12, se o dia respeita o limite de dias de cada mês específico (meses de 30 ou
        31 dias) e tratar o mês de fevereiro, considerando se o ano é bissexto (29 dias) ou comum
        (28 dias). */ 
        
        
        Scanner sc = new Scanner(System.in);
        
        
        int dia = -1;
        int mes = -1;
        int ano = -1;
        
        boolean isBissexto;
        
        
        
        System.out.println("- - - - - VERIFICADOR DE DATA VÁLIDA - - - - - - -");
        System.out.println("Digite um número referente ao dia: ");
        dia = sc.nextInt();
        
        System.out.println("Digite um número referente ao mês: ");
        mes = sc.nextInt();
        
        System.out.println("Digite um número referente ao ano: ");
        ano = sc.nextInt();
        
        sc.close();
        
        isBissexto = ano % 4 == 0;
        
        
        
        if(ano <= 2026) // Início verificação ano
        { 
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            {
                if(dia >= 1 && dia <= 31)
                {
                    System.out.printf("DIA: %d/%d/%d\n", dia, mes, ano);
                }
                else
                {
                    System.out.println("Data inválida!");
                    System.out.println("Dia digitado: "+dia);
                }
            }
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 1)
            {
                if(dia >= 1 && dia <= 30)
                {
                    System.out.printf("DIA: %d/%d/%d", dia, mes, ano);
                }
                else if(dia == 31)
                {
                    System.out.println("Este mês não tem dia 31!");
                    System.out.println("Data inválida!");
                }
            }
            
            else if(mes == 2) 
            {
                if(dia >= 1 && dia <= 28)
                {
                    System.out.printf("DIA: %d/%d/%d\n", dia, mes, ano);
                }
                else if(isBissexto)
                {
                    if(dia == 29)
                    {
                    System.out.printf("DIA: %d/%d/%d\n", dia, mes, ano);
                    }
                }
                else
                {
                    System.out.println("Data inválida!");
                }
            } // Verificação do mês de fevereiro
            
                
        
            else
            {
                System.out.println("Mês inválido!");
                
            } // Fechamento verificação mês
            
        }
        
        else
        {
            System.out.println("Ano inválido!");
            
        } // Fechamento verificação ano 
        
    }
    
}
