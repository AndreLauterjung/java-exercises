package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class PetShop
{
    private boolean isMaquinaSuja;
    private boolean isPetNaMaquina;
    private boolean isPetLimpo;
    private int agua;
    private int shampoo;
    
    
    public PetShop()
    {
        this.isMaquinaSuja = false;
        this.isPetNaMaquina = false;
        this.isPetLimpo = false;
        this.agua = 0;
        this.shampoo = 0;
    }
    
    public String verificarNivelAgua()
    {
        return "Nível de água: "+this.agua+" Litros.";
    }
    
    public String verificarNivelShampoo()
    {
        return "Nível de shampoo: "+this.shampoo+" Litros.";
    }
    
    public void abastecerAgua()
    {
        /* Motivo de usar o <= 28: 
        
        Se for 29 + 2 = 31 (ultrapassa o limite)
        Se for 27 + 2 = 29
        Se for 28 + 2 = 30 (Chega no limite) 
        
        Então como incremente +2 Litros quando o método é chamado, 
        Acaba não ultrapassando o limite se a quantidade de litros no armazenamento
        estiver com um valor menor ou igual à 28 Litros. */
        if(this.agua <= 28)
        {
            this.agua += 2;
            
            System.out.println("Adicionados 2 Litros de água!");
            System.out.println(verificarNivelAgua());
        }
        else
        {
            System.out.println("Não é possível abastecer água!");
        }
    }
    
    public void abastecerShampoo()
    {
        /* Aqui fui pelo mesmo raciocínio utilizado no abastecimento de água. */
        if(this.shampoo <= 8)
        {
            this.shampoo += 2;
            System.out.println("Adicionados 2 Litros de shampoo!");
            System.out.println(verificarNivelShampoo());
        }
        else
        {
            System.out.println("Não é possível abastecer shampoo!");
        }
        
    }
        
    public void verificarTemPetMaquina()
    {
        if(this.isPetNaMaquina)
        {
            System.out.println("\n=====================");
            System.out.println("Há um pet na máquina!");
            System.out.println("=====================");
        }
        else
        {
            System.out.println("\n========================");
            System.out.println("NÃO há um pet na máquina!");
            System.out.println("=========================");
        }
    }
    
    public void colocarPetMaquina()
    {
        // Se não tem pet na máquina, posso adicionar
        if(this.isPetNaMaquina == false && this.isMaquinaSuja == false)
        {
            this.isPetNaMaquina = true;
            // Se o pet só está na máquina de banho, ele ainda não está limpo.
            this.isPetLimpo = false;
            System.out.println("\n========================");
            System.out.println("Pet colocado na máquina!");
            System.out.println("==========================");
        }
        // se tiver, não posso adicionar pet
        else if(this.isPetNaMaquina == true)
        {
            System.out.println("\n! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
            System.out.println("ERRO: Não foi possível adicionar pet na máquina! ");
            System.out.println("MOTIVO: Já há um pet na máquina!");
            System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
        }
        else
        {
            System.out.println("\n! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
            System.out.println("ERRO: Não foi possível adicionar pet na máquina! ");
            System.out.println("MOTIVO: A máquina está suja!");
            System.out.println("É necessário limpar a máquina.");
            System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
        }
 
    }
    
    public void retirarPetMaquina()
    {
        if(this.isPetNaMaquina && this.isPetLimpo)
        {
            this.isMaquinaSuja = true;
            System.out.println("\n========================");
            System.out.println("Pet retirado da máquina!");
            System.out.println("==========================");
            this.isPetNaMaquina = false;
        }
        
        /*A diferença do primeiro if é que neste o pet está considerado sujo
        Ou seja, foi adicionado à máquina de banho, mas não tomou banho. */
        else if(this.isPetNaMaquina && this.isPetLimpo == false)
        {
            this.isMaquinaSuja = true;
            System.out.println("\n========================");
            System.out.println("Pet retirado da máquina!");
            System.out.println("==========================");
            this.isPetNaMaquina = false;
        }
        else
        {
            System.out.println("\n! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
            System.out.println("ERRO: Não foi possível retirar pet da máquina! ");
            System.out.println("MOTIVO: Não há pet na máquina.");
            System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
        }
    }
            
    public void darBanhoPet()
    {
        if(this.isPetNaMaquina)
        {
            if(this.agua >= 10 && this.shampoo >= 2)
            {
                this.agua -= 10;
                this.shampoo -= 2;
                
                System.out.println("\n====================");
                System.out.println("Pet tomando banho...");
                System.out.println("Banho encerrado!");
                System.out.println("====================");
                
                this.isPetLimpo = true;
                this.isMaquinaSuja = true;
            }
            else
            {
                System.out.println("\n! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
                System.out.println("ERRO: Não foi possível dar banho no pet! ");
                System.out.println("MOTIVO: Falta água e/ou shampoo!");
                System.out.println("É necessário 10 Litros de água e 2 Litros de Shampoo");
                System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!");
            }
           
        }
        else
        {
            System.out.println("\n! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
            System.out.println("ERRO: Não foi possível dar banho no pet! ");
            System.out.println("MOTIVO: Não há pet na máquina!");
            System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
        }
    }
    
    public void limparMaquina()
    {
        // se a máquina estiver suja e sem pet, tem que limpar.
        
        if(this.isMaquinaSuja == true && this.isPetNaMaquina == false)
        {
            if(this.agua >= 3 && this.shampoo >= 1)
            {
                this.agua -= 3;
                this.shampoo -= 1;
                System.out.println("\n=====================");
                System.out.println("Limpando máquina...");
                System.out.println("Máquina limpa!");
                System.out.println("=====================");
                this.isMaquinaSuja = false;
            }
            else
            {
                System.out.println("\n! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
                System.out.println("ERRO: Não foi possível limpar a máquina!");
                System.out.println("MOTIVO: Falta água e/ou shampoo!");
                System.out.println("É necessário 3 Litros de água e 1 Litro de Shampoo");
                System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!");
                
            }     
        }
        else if(this.isMaquinaSuja == true && this.isPetNaMaquina == true)
        {
            System.out.println("\n! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
            System.out.println("ERRO: Não foi possível limpar a máquina!");
            System.out.println("MOTIVO: Há um pet na máquina!");
            System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!");
        }
        else
        {
            System.out.println("\n===================");
            System.out.println("A máquina está limpa!");
            System.out.println("=====================");
        }
    }
        
}
