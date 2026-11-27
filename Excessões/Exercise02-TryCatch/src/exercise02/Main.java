/* Enunciado do exercício:

Idade para votação: Peça a idade do usuário (número inteiro) e exiba se ele já pode votar ou quantos anos faltam. */
package exercise02;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isFuncionando = true;

        while (isFuncionando) {

            try {
                System.out.println("\nDigite uma idade: ");
                int idade = sc.nextInt();

                if (idade >= 18) {
                    System.out.println("\nVocê já pode votar!");
                    isFuncionando = false;
                } else if (idade <= 0) {
                    System.out.println("\nIdade inválida!");
                } else {
                    System.out.println("\nVocê ainda não pode votar!");
                    System.out.println("Faltam " + (18 - idade) + " anos!");

                    isFuncionando = false;
                }

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("\nERRO! Você não pode digitar uma letra!");
                System.out.println(inputMismatchException.toString());
                sc.next();
            }
        }
        sc.close();
    }
}
