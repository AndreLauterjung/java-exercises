package exercise08;

/**
 *
 * @author andrelauterjung
 */
public class Pocao extends Item
{
    private int cura;
    
    public Pocao(int curaPocao)
    {
        this.cura = curaPocao;
    }
    
    public String beber()
    {
        return "Bebeu poção de cura.";
    }
    
    public int getCuraPocao()
    {
        return this.cura;
    }
}
