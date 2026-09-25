package exercise10;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Usuario
{
    private String nome;
    private String email;
    private String senha;
    
    boolean isLogado = false;
    
    Scanner sc = new Scanner(System.in);
    
    public Usuario(String nomeU, String emailU, String senhaU)
    {
        this.nome = nomeU;
        this.email = emailU;
        this.senha = senhaU;
    }
    
    
    
    public void realizarLogin(Scanner sc, Usuario usuario)
    {
        System.out.println("LOGIN:");
        System.out.println("Digite seu e-mail: ");
        String entradaEmail = sc.nextLine();

        System.out.println("Digite sua senha: ");
        String entradaSenha = sc.nextLine();

        if(entradaEmail.equals(usuario.getEmail()) && entradaSenha.equals(usuario.getSenha()))
        {
            isLogado = true;
            System.out.println("VOCÊ LOGOU!");
            System.out.println("Bem-vindo, "+usuario.getNome()+" !");
        }
        else
        {
            System.out.println("\nEMAIL OU SENHA INCORRETOS!");
            System.out.println("TENTE NOVAMENTE!");
        }
    }
    
    public void realizarLogoff()
    {
        if(isLogado == true)
        {
            System.out.println("Fazendo logoff...");
            System.out.println("Você saiu da conta!");
        }
        else
        {
            System.out.println("Você não logou!");
        }
    }
    
    public void alterarDados(Scanner sc, Usuario usuario)
    {
        System.out.println("QUAL DADO VOCÊ DESEJA ALTERAR? ");
        System.out.println("0 - nenhum");
        System.out.println("1 - email");
        System.out.println("2 - nome");
        int opcao = sc.nextInt();
        sc.nextLine();
        
        switch(opcao)
        {
            case 0:
                break;
                
            case 1:
                System.out.println("Digite o novo email: ");
                String novoEmail = sc.nextLine();
                
                usuario.setEmail(novoEmail);
                break;
                
            case 2: 
                System.out.println("Digite o novo nome: ");
                String novoNome = sc.nextLine();
                
                usuario.setNome(novoNome);
                break;
                
            default:
                System.out.println("Opção inválida!");
        }
            
        
    }
    
    public void alterarSenha(Scanner sc, Usuario usuario)
    {
        if(isLogado == true)
        {
            System.out.println("Digite a nova senha: ");
            String novaSenha = sc.nextLine();
            
            usuario.setSenha(novaSenha);
            
            System.out.println("Senha alterada!");
        }
        else
        {
            System.out.println("É preciso estar logado para mudar a senha!");
        }
    
    }
    
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String novoEmail)
    {
        this.email = novoEmail;
    }
        
    public String getSenha()
    {
        return this.senha;
    }
    
    public void setSenha(String novaSenha)
    {
        this.senha = novaSenha;
    }
        
    
    public boolean getIsLogado()
    {
        return this.isLogado;
    }
}
