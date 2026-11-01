/* Enunciado do exercício:

Analisador de Logs de Sistema

- Objetivo: Classificar o nível de severidade de uma linha de log.
- O que fazer: Simule a leitura de uma linha de log de um sistema (ex: "INFO: Sistema inicializado com sucesso" ou
"ERROR: Falha na conexão com o banco de dados"). Utilize o contains() para verificar se o texto possui a palavra
"ERROR" ou "WARNING", e imprima o nível do alerta correspondente.

Exemplo de saída:

Entrada: "ERROR: Falha na conexão"
Saída: "Alerta crítico detectado no sistema! Notificando a equipe técnica." */

package exercise20;

/**
 *
 * @author andrelauterjung
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("\n===============================================");
        
        String log = "WARNING! Não foi possível concluir o download do sistema!";
        
        if(log.contains("ERRO")) {
            System.out.println("Erro no sistema! Notificando a equipe técnica.");
        }
        else if(log.contains("WARNING")) {
            System.out.println("Alerta crítico detectado no sistema!\nNotificando a equipe técnica.");
        }
        
        
        
        System.out.println("\n===============================================");
        System.out.println("Programa encerrado!");
        System.out.println("===============================================");
    }
}
