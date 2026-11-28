/* Enunciado do exercício:

Conversão de preço: Peça um valor em texto (ex.: "49.90" ou "gratuito") e converta para double para aplicar 10%
de desconto. */
package exercise04;

import java.util.Scanner;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor = 0.0;
        double desconto = 0.10;
        boolean isFuncionando = true;

        while (isFuncionando) {

            try {
                System.out.println("\nDigite um valor (Exemplo: 90.99): ");
                String valorTexto = sc.nextLine();

                valor = Double.parseDouble(valorTexto);

                if (valor < 0.0) {
                    System.out.println("\nNão pode digitar um valor negativo!");
                } else {
                    System.out.println("\nValor com desconto: R$ " + (valor - (valor * desconto)));
                    isFuncionando = false;
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("\nErro! Você precisa digitar um valor, não um texto!");
                System.out.println(numberFormatException.toString());
            }

        }

        sc.close();
    }
}
