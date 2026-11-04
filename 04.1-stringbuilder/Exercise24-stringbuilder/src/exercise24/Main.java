/* Enunciado do exercício:

Escondendo as vogais

- Crie a variável String frase = "Aprender Java e divertido";.
- Crie um StringBuilder com a frase e uma String com a mesma frase em minúsculas (toLowerCase()), que serve só
para você conferir cada letra.
- Percorra as posições com um for de 0 até length() - 1. Se o caractere da versão minúscula for uma vogal (a, e, i, o
ou u), use replace(i, i + 1, "*") no StringBuilder e some 1 num contador.
- Imprima o texto final e a quantidade de vogais.

Esperado: *pr*nd*r J*v* * d*v*rt*d* e 10 vogais. */

package exercise24;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        String frase = "Aprender Java e divertido";
        
        StringBuilder fraseSb = new StringBuilder(frase.toLowerCase());
        int contadorVogais = 0;
        
        for(int i = 0; i <= fraseSb.length() - 1; i++) {
            
            if(fraseSb.charAt(i) == 'a') {
                
                fraseSb.replace(i, i+1, "*");
                contadorVogais++;
            }
            else if(fraseSb.charAt(i) == 'e') {
                
                fraseSb.replace(i, i+1, "*");
                contadorVogais++;
            }
            else if(fraseSb.charAt(i) == 'i') {
                
                fraseSb.replace(i, i+1, "*");
                contadorVogais++;
            }
            else if(fraseSb.charAt(i) == 'o') {
                
                fraseSb.replace(i, i+1, "*");
                contadorVogais++;
            }
            else if(fraseSb.charAt(i) == 'u') {
                
                fraseSb.replace(i, i+1, "*");
                contadorVogais++;
            }
        }
        
        System.out.println("\n=========================================");
        System.out.println("Frase: "+fraseSb);
        System.out.println("Há "+contadorVogais+" Vogais na frase.");
        
        
        System.out.println("\n=========================================");
        System.out.println("PROGRAMA ENCERRADO!");
        System.out.println("=========================================");
    }
}
