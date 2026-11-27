package exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author andrelauterjung
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;

        try {
            System.out.println("Digite um número inteiro: ");
            num1 = sc.nextInt();

            System.out.println("Digite um número inteiro: ");
            num2 = sc.nextInt();

            resultado = num1 / num2;

            System.out.println("Resultado da conta: " + resultado);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Erro: não é possível dividir por zero.");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Erro: digite apenas números inteiros.");
        } finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }
}