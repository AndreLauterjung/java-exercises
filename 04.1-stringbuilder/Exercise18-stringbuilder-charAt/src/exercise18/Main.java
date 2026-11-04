/* Enunciado do exercício:

- Crie um StringBuilder com o seu nome. Use length() para mostrar a quantidade de letras e charAt(0) para mostrar
apenas a primeira letra.*/

package exercise18;

/**
 *
 * @author andrelauterjung
 */
public class Main {

    public static void main(String[] args) {
        
        StringBuilder nome = new StringBuilder("AndréLauterjung");
        
        System.out.println("\n===============================================");
        System.out.println("Quantidade de caracteres: "+nome.length());
        System.out.println("Primeira letra: "+nome.charAt(0));

        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
