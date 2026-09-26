package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class RelogioAmericano extends Relogio
{
    @Override
    public String mostrarHora(Relogio relogio)
    {
        return "Hora dos USA -> "+relogio.getHora()+":"+relogio.getMinuto()+":"+relogio.getSegundo();
    }

    
}
