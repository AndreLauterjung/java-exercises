/* Enunciado do exercício:

Crie a interface Notificador com void enviar(String mensagem);. 

Crie Email, SMS e WhatsApp, cada uma imprimindo a mensagem no seu formato 
(ex.: "[Email] mensagem"). 


Crie uma classe Sistema com um método notificarTodos(Notificador[] canais, 
String mensagem) 

que percorre o array e chama enviar() em cada canal. No main, chame esse método 
passando o array.*/
package exercise07;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Notificador[] avisos = {new Email(), new SMS(), new WhatsApp()};
        
        
        Sistema sistema = new Sistema();

        sistema.notificarTodos(avisos, "Mensagem enviada!");

        
    }
}
