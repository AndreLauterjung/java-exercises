package exercise06.objects;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Carro
{
    private boolean isCarroLigado = false;
    private int velocidade;
    private int marcha;
    
    public Carro()
    {
        this.marcha = 0;
        this.velocidade = 0;
    }
    
    
    public void ligarCarro()
    {
        if(isCarroLigado == false)
        {
            System.out.println("=======================");
            System.out.println("Ligando carro...");
            this.isCarroLigado = true;
            System.out.println("CARRO LIGADO!");
            System.out.println("=======================");
            
            this.marcha = 0;
            this.velocidade = 0;
        }
        else
        {
            System.out.println("=======================");
            System.out.println("O CARRO JÁ ESTÁ LIGADO!");
            System.out.println("=======================");
        }
    }
    
    public void desligarCarro()
    {
        // O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
        
        if(this.isCarroLigado && this.marcha == 0 && this.velocidade == 0)
        {
            System.out.println("=======================");
            System.out.println("Desligando carro...");
            this.isCarroLigado = false;
            System.out.println("CARRO DESLIGADO!");
            System.out.println("=======================");
        }
        else
        {
            System.out.println("=====================================");
            System.out.println("NÃO É POSSÍVEL DESLIGAR O CARRO!");
            
            if(this.isCarroLigado == false)
            {
                System.out.println("MOTIVO: O CARRO JÁ ESTÁ DESLIGADO!");
            }
            else
            {
                System.out.println("A velocidade do carro está acima de 0kmh");
            }
            System.out.println("============================================");
        }
    }
        
    public void acelerarCarro()
    {
        if(this.isCarroLigado == false)
        {
            System.out.println("=========================================================");
            System.out.println("Não é possível realizar ação pois o carro está desligado!");
            System.out.println("=========================================================");
        }
        
        else if(this.marcha == 0)
        {
            System.out.println("=======================================");
            System.out.println("Você precisa colocar a primeira marcha!");
            System.out.println("=======================================");
        }
        
        
        else if(this.marcha == 1 && (this.velocidade >= 0 && this.velocidade <= 20))
        {
            System.out.println("=======================================");
            this.velocidade += 1;
            System.out.println(verificarVelocidade());    
            System.out.println("=======================================");
            
            if(this.velocidade == 21 && this.marcha == 1)
            {
                System.out.println("=================================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA ACELERAR MAIS!");
                System.out.println("=================================================");
            }
        }
        
        else if(this.marcha == 2 && (this.velocidade >= 21 && this.velocidade <= 40))
        {
            System.out.println("=======================================");
            this.velocidade += 1;
            System.out.println(verificarVelocidade());
            System.out.println("=======================================");
            
            if(this.velocidade == 41 && this.marcha == 2)
            {
                System.out.println("=================================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA ACELERAR MAIS!");
                System.out.println("=================================================");
            }
        }
        
        else if(this.marcha == 3 && (this.velocidade >= 41 && this.velocidade <= 60))
        {
            System.out.println("=======================================");
            this.velocidade += 1;
            System.out.println(verificarVelocidade());
            System.out.println("=======================================");
            
            if(this.velocidade == 61 && this.marcha == 3)
            {
                System.out.println("=================================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA ACELERAR MAIS!");
                System.out.println("=================================================");
            }
        }
        
        else if(this.marcha == 4 && (this.velocidade >= 61 && this.velocidade <= 80))
        {
            System.out.println("=======================================");
            this.velocidade += 1;
            System.out.println(verificarVelocidade());
            System.out.println("=======================================");
            
            if(this.velocidade == 81 && this.marcha == 4)
            {
                System.out.println("=================================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA ACELERAR MAIS!");
                System.out.println("=================================================");
            }
        }
        
        else if(this.marcha == 5 && (this.velocidade >= 81 && this.velocidade <= 100))
        {
            System.out.println("=======================================");
            this.velocidade += 1;
            System.out.println(verificarVelocidade());
            System.out.println("=======================================");
            
            if(this.velocidade == 101 && this.marcha == 5)
            {
                System.out.println("=================================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA ACELERAR MAIS!");
                System.out.println("=================================================");
            }
        }

        else if(this.marcha == 6 && (this.velocidade >= 101 && this.velocidade <= 120))
        {
            System.out.println("=======================================");
            this.velocidade += 1;
            
            if(this.velocidade > 120)
            {
                this.velocidade = 120;
                System.out.println("=============================");
                System.out.println("Velocidade máxima!");
                System.out.println("Não é possível acelerar mais!");
                System.out.println("=============================");  
            }
            System.out.println(verificarVelocidade());
            System.out.println("=======================================");
        }  
               
    }
    
    public void desacelerarCarro()
    {
        // Funcionou
        if(this.isCarroLigado == false)
        {
            System.out.println("Não é possível realizar ação pois o carro está desligado!");
            
        }
        
        // Funcionou
        if(this.isCarroLigado == true && this.velocidade == 0 && (this.marcha == 0 || this.marcha == 1))
        {
            System.out.println("Não é possível diminuir mais a velocidade!");
            System.out.println("É POSSÍVEL DESLIGAR O CARRO!");
            this.marcha = 0;
        }
           
        
        if(this.marcha == 1 && this.velocidade >= 0.0 && this.velocidade< 20)
        {
            System.out.println("============================================");
            this.velocidade -= 1;
            System.out.println(verificarVelocidade());
            System.out.println("============================================");
    
        }
        
        if(this.marcha == 2 && this.velocidade == 20)
        {
            this.marcha = 1;
            this.velocidade = 19;

            System.out.println("============================================");
            System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA DESACELERAR MAIS!");
            System.out.println("============================================");
        }

        
        else if(this.marcha == 2 && (this.velocidade >= 21 && this.velocidade <= 40))
        {
            System.out.println("============================================");
            this.velocidade -= 1;
            System.out.println(verificarVelocidade());
            System.out.println("============================================");
            
            if(this.velocidade <= 40 && this.marcha == 3)
            {
                System.out.println("============================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA DESACELERAR MAIS!");
                System.out.println("============================================");
            }
        }
        
        else if(this.marcha == 3 && (this.velocidade >= 41 && this.velocidade <= 60))
        {
            System.out.println("============================================");
            this.velocidade -= 1;
            System.out.println(verificarVelocidade());
            System.out.println("============================================");
            
            if(this.velocidade <= 60 && this.marcha == 4)
            {
                System.out.println("============================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA DESACELERAR MAIS!");
                System.out.println("============================================");
            }
        }
        
        else if(this.marcha == 4 && (this.velocidade >= 61 && this.velocidade <= 80))
        {
            System.out.println("============================================");
            this.velocidade -= 1;
            System.out.println(verificarVelocidade());
            System.out.println("============================================");
            
            if(this.velocidade <= 80 && this.marcha == 5)
            {
                System.out.println("============================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA DESACELERAR MAIS!");
                System.out.println("============================================");
            }
        }
        
        else if(this.marcha == 5 && (this.velocidade >= 81 && this.velocidade <= 100))
        {
            System.out.println("============================================");
            this.velocidade -= 1;
            System.out.println(verificarVelocidade());
            System.out.println("============================================");
            
            if(this.velocidade <= 100 && this.marcha == 6)
            {
                System.out.println("============================================");
                System.out.println("VOCÊ PRECISA TROCAR DE MARCHA PARA DESACELERAR MAIS!");
                System.out.println("============================================");
            }
        }

        else if(this.marcha == 6 && (this.velocidade >= 101 && this.velocidade <= 120))
        {
            System.out.println("============================================");
            this.velocidade -= 1;
            System.out.println(verificarVelocidade());
            System.out.println("============================================");
        }  
           
    }
        
    
    
    public void virarCarroEsqDir(Scanner sc)
    {
        String pergunta;
        
        if(this.isCarroLigado == false)
        {
            System.out.println("Não é possível realizar ação pois o carro está desligado!");
        }
        else
        {
            System.out.println("Para qual lado deseja virar o carro? 'd' ou 'e'");
            pergunta = sc.nextLine();
            
            if(pergunta.equalsIgnoreCase("e") && (this.velocidade >= 1 && this.velocidade <= 40))
            {
                System.out.println("O carro virou para a esquerda!");
            }
            else if(pergunta.equalsIgnoreCase("d")  && (this.velocidade >= 1 && this.velocidade <= 40))
            {
                System.out.println("O carro virou para a direita!");
            }
            else
            {
                System.out.println("Não foi possível virar o carro!");
                System.out.println("TENTE NOVAMENTE!");
            }      
        }
            
    }
    
    
    
    public String verificarVelocidade()
    {
    return "A velocidade do carro é de "+this.velocidade+" KMH! "+
        "MARCHA: "+this.marcha;
        
    }
    
    public void trocarMarcha()
    {
        if(this.isCarroLigado == false)
        {
            System.out.println("Não é possível realizar ação pois o carro está desligado!");
        }
        else
        {
            if(this.marcha == 0 && this.velocidade == 0)
            {
                this.marcha = 1;
                System.out.println("================================");
                System.out.println("MARCHA TROCADA! MARCHA ATUAL: "+this.marcha);
                System.out.println("================================");
            }
            /*else if(this.velocidade >= 0 && this.velocidade <= 20)
            { 
                this.marcha = 1;
            }*/
            
            else if(this.velocidade >= 21 && this.velocidade <= 40)
            {
                this.marcha = 2;
                System.out.println("================================");
                System.out.println("MARCHA TROCADA! MARCHA ATUAL: "+this.marcha);
                System.out.println("================================");
            }
            else if(this.velocidade >= 41 && this.velocidade <= 60)
            {
                this.marcha = 3;
                System.out.println("================================");
                System.out.println("MARCHA TROCADA! MARCHA ATUAL: "+this.marcha);
                System.out.println("================================");
            }
            else if(this.velocidade >= 61 && this.velocidade <= 80)
            {
                this.marcha = 4;
                System.out.println("================================");
                System.out.println("MARCHA TROCADA! MARCHA ATUAL: "+this.marcha);
                System.out.println("================================");
            }
            else if(this.velocidade >= 81 && this.velocidade <= 100)
            {
                this.marcha = 5;
                System.out.println("================================");
                System.out.println("MARCHA TROCADA! MARCHA ATUAL: "+this.marcha);
                System.out.println("================================");
            }
            else if(this.velocidade >= 101 && this.velocidade <= 120)
            {
                this.marcha = 6;
                System.out.println("================================");
                System.out.println("MARCHA TROCADA! MARCHA ATUAL: "+this.marcha);
                System.out.println("================================");
            }
        }  
    }
        
    public boolean getCarroLigado()
    {
        return this.isCarroLigado;
    }
}
