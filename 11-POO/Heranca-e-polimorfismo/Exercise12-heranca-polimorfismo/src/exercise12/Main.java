/* Enunciado do exercício:

Funcionários com salário (herança básica)

Crie uma classe Funcionario com atributos Nome, CPF e Salário Base, além de um 
método calcularSalario() que apenas retorna o salário base.

Crie duas subclasses:

Gerente, que sobrescreve calcularSalario() para retornar o salário base + um 
bônus fixo de 20%;

Estagiario, que sobrescreve calcularSalario() para retornar apenas 60% do 
salário base (bolsa-auxílio).

Teste criando um objeto de cada classe e chamando calcularSalario(). */


package exercise12;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Gerente gerente = new Gerente("André", 1500.0, "12312312332");
        Estagiario estagiario = new Estagiario("João", 1000.0, "12332132133");
        
        
        
        System.out.println(gerente.retornarSalarioBase());
        System.out.println(estagiario.retornarSalarioBase());
    
    }
}
