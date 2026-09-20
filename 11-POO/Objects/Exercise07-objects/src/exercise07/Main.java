package exercise07;

import java.util.Scanner;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        PetShop pet = new PetShop();
        
        boolean isProgramaRodando = true;
        

        while(isProgramaRodando)
        {
            System.out.println("\n**************** PET SHOP ******************");
            System.out.println("Menu de opções: ");
            System.out.println("0 - Parar programa");
            System.out.println("1 - Verificar Nível de Água");
            System.out.println("2 - Verificar Nível de Shampoo");
            System.out.println("3 - Abastecer água");
            System.out.println("4 - Abastecer shampoo");
            System.out.println("5 - Verificar se há pet na máquina");
            System.out.println("6 - Colocar pet na máquina");
            System.out.println("7 - Retirar pet da máquina");
            System.out.println("8 - Dar banho no pet");
            System.out.println("9 - Limpar máquina");
            System.out.println("*******************************************");
            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao)
            {
                case 0:
                    isProgramaRodando = false;
                    System.out.println("\n======================");
                    System.out.println("PROGRAMA ENCERRADO!");
                    System.out.println("======================");
                    break;
                
                case 1:
                    System.out.println("\n======================");
                    System.out.println(pet.verificarNivelAgua());
                    System.out.println("======================");
                    break;

                case 2:
                    System.out.println("\n======================");
                    System.out.println(pet.verificarNivelShampoo());
                    System.out.println("======================");
                    break;

                case 3:
                    pet.abastecerAgua();
                    break;

                case 4:
                    pet.abastecerShampoo();
                    break;
                    
                case 5: 
                    pet.verificarTemPetMaquina();
                    break;
                    
                case 6:
                    pet.colocarPetMaquina();
                    break;
                    
                case 7:
                    pet.retirarPetMaquina();
                    break;
                    
                case 8:
                    pet.darBanhoPet();
                    break;
                    
                case 9:
                    pet.limparMaquina();
                    break;

                default:
                    System.out.println("! ! ! ! ! ! ! ! !");
                    System.out.println("OPÇÃO INVÁLIDA!");
                    System.out.println("TENTE NOVAMENTE!");
                    System.out.println("! ! ! ! ! ! ! ! !");

            } // Fechamento Switch-case.
            
        } // Fechamento loop while.
        
    }
}
