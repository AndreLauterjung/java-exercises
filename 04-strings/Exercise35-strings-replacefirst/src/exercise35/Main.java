/* Enunciado do exercício:

- Crie uma frase contendo a mesma palavra repetida (ex: "gato cinza, gato branco") e use o replaceFirst("gato",
"cão") para substituir apenas a primeira ocorrência da palavra. */

package exercise35;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String frase = "gato caramelo, gato listrado";
        
        System.out.println("\n===============================================");
        System.out.println("Frase (antes): "+frase);
        
        frase = frase.replaceFirst("gato", "cao");
        
        System.out.println("Frase (depois): "+frase);
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
