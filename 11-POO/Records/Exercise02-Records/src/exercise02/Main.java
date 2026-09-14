package exercise02;

import exercise02.ContaBancaria;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        /* 
        Conta Bancária (ContaBancaria) Crie um record chamado ContaBancaria que 
        armazene os seguintes dados:
        
        String titular
        double saldo
        
        Requisitos:
        
        Adicione um construtor compacto ou uma validação para garantir que o saldo
        inicial não possa começar negativo (se for menor que zero, lance uma exceção 
        ou ajuste para zero).
        
        Crie um método personalizado dentro do record que simule um saque (retornando um novo objeto 
        ContaBancaria com o saldo atualizado ou imprimindo a operação) e outro que exiba os dados 
        formatados da conta.
        */
        
        ContaBancaria conta = new ContaBancaria("André", 500000);
        
        conta = conta.realizarSaque(100.0);
        
        
        System.out.println(conta.mostrarDados());
        
    }
}
