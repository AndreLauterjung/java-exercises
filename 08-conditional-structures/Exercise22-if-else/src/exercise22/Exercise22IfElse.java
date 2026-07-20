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
        
        int mesLongo1 = 31; // JAN , MAR , MAI, JUL, AGO, OUT, DEZ
        int mesLongo2 = 30; // ABR , JUN, SET, NOV
        
        int mesFevBi = 29;
        int mesFev = 28;
        
 
   
        System.out.println("- - - - - VERIFICADOR DE DATA VÁLIDA - - - - - - -");
        System.out.println("Digite um número referente ao dia: ");
        dia = sc.nextInt();
        
        System.out.println("Digite um número referente ao mês: ");
        mes = sc.nextInt();
        
        System.out.println("Digite um número referente ao ano: ");
        ano = sc.nextInt();
        
        sc.close();
        
        isBissexto = ano % 4 == 0;
        
      
        /* Primeiro ocorre a verificação do ano. 
        Se for maior que 9999, o ano é inválido */
        if(ano <= 9999)
        {
            
            /* Aqui ocorre a verificação para saber se digitou um número maior ou igual
            a 1 (Que representa janeiro) e menor ou igual a 12 (que representa dezembro) */
            if(mes >= 1 && mes <= 12)
            {
                
                if(mes == 2)
                {
                    /* Se o dia for 29 e o ano for bissexto */
                    if((dia == 29 && isBissexto))
                    {
                        System.out.printf("DIA: %d/%d/%d\n", dia, mes, ano);
                    }
                    
                    /* Caso o dia não seja igual a 29 e o ano não seja bissexto 
                    O programa roda este else if */
                    else if(dia >= 1 && dia <= 28)
                    {
                        System.out.printf("DIA: %d/%d/%d\n", dia, mes, ano);
                    }  
                    
                    /* Caso o dia não esteja entre 1 e 28 
                    A data é inválida */
                    else
                    {
                        System.out.println("Data inválida! ");
                    }
                }
                else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                {
                    if(dia>= 1 && dia <= mesLongo1)
                    {
                        System.out.printf("DIA: %d/%d/%d\n", dia, mes, ano);
                    }
                    else
                    {
                        System.out.println("Data inválida! ");
                    }
                }
                else if (mes == 4 || mes == 6 || mes == 9 || mes == 1)
                {
                    if(dia >= 1 && dia <= mesLongo2)
                    {
                        System.out.printf("DIA: %d/%d/%d\n", dia, mes, ano);
                    }
                    else
                    {
                        System.out.println("Data inválida! ");
                    }
                }
                    
            }
            else
            {
                System.out.println("Data inválida! ");
            } // Fechamento estrutua verificação mês
  
            
        }
        else
        {
            System.out.println("Data inválida! ");
        } // Fechamento estrutura verificação ano
 
    }
    
}
