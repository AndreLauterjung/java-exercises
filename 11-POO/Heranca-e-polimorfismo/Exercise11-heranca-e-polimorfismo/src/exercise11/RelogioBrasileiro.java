package exercise11;

/**
 *
 * @author andrelauterjung
 */
public class RelogioBrasileiro extends Relogio
{
    @Override
    public String mostrarHora(Relogio relogio)
    {
        return "Hora do Brasil -> "+relogio.getHora()+":"+relogio.getMinuto()+":"+relogio.getSegundo();
    }
}
