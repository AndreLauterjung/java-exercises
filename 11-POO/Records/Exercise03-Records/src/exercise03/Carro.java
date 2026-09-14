package exercise03;

/**
 *
 * @author andrelauterjung
 */
public record Carro(String modelo, int velocidadeAtual, int velocidadeMaxima) 
{
    public Carro
    {
        if(velocidadeAtual > velocidadeMaxima)
        {
            System.out.println("ERRO DE VELOCIDADE!");
            velocidadeAtual = velocidadeMaxima;
        }
    }
    
    public Carro acelerarCarro(int velocidadeAcelera)
    {
        int novaVelocidade;
        
        if((velocidadeAcelera + this.velocidadeAtual) > velocidadeMaxima)
        {
            novaVelocidade = this.velocidadeMaxima;
            return new Carro(modelo, novaVelocidade, velocidadeMaxima);
        }
        else
        {
            novaVelocidade = velocidadeAcelera + this.velocidadeAtual;
            return new Carro(modelo, novaVelocidade, velocidadeMaxima);
        }
        
    }
        
    public String altaVelocidade()
    {
        if(velocidadeAtual > ((70.0 / 100.0) * velocidadeMaxima))
        {
            return "o carro está em alta velocidade";
        }
        else
        {
            return "o carro está em baixa velocidade";
        }
        
    }
    
    public String mostrarInfo()
    {
        return "Modelo do Carro: "+this.modelo+"\nVelocidade Atual: "+this.velocidadeAtual+"\nVelocidade Máxima: "+this.velocidadeMaxima;
    }
        
}
