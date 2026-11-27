/* Enunciado exercício:

Acesso a item de lista: Crie um array fixo com 4 nomes de frutas e peça um índice (0 a 3) para mostrar a fruta
escolhida. */
package exercise03;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] frutas = {"Mamão", "Uva", "Limão", "Morango"};
        boolean isFuncionando = true;

        while (isFuncionando) {
            try {
                System.out.println("\nDigite uma posição do array para descobrir a fruta: ");
                int numDigitado = sc.nextInt();

                if (numDigitado < 0) {
                    System.out.println("\nERRO! Não pode digitar um número negativo!");
                } else {
                    System.out.println("\nFruta na posição " + numDigitado + ": " + frutas[numDigitado]);
                    isFuncionando = false;
                }

            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("\nERRO! Índice fora do intervalo (0 a 3).");
                System.out.println(arrayIndexOutOfBoundsException.toString());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("\nVocê não pode digitar uma letra!");
                System.out.println(inputMismatchException.toString());
                sc.next();
            }
        }

        sc.close();

    }
}
