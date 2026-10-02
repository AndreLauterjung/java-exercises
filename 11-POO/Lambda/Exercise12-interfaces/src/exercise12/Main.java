/* Enunciado do exercício:

Escreva um código para enviar mensagens de marketing, para isso você deve ter a 
possibilidade de enviar a mesma mensagem para serviços diferentes, esses 
serviços devem ter um método para receber a mensagem como parâmetro, os serviços
que devem estar disponíveis são:

- SMS;
- E-mail;
- Redes Sociais;
- WhatsApp; */

package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Marketing[] notificacao = {new Email(), new SMS(), new WhatsApp(), new RedesSociais()};
        
        
        String mensagem = "Novo produdo disponível!";
        
        
        Sistema sistema = new Sistema();
        
        sistema.enviarMensagensMarket(notificacao, mensagem);
    }
}
