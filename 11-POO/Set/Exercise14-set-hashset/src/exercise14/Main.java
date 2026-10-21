/* Enunciado do exercício:

Hotel e hóspedes (duas classes)

- Crie a classe Hospede com documento e nome (ambos String), construtor e getters. equals e hashCode
comparam só o documento. 

- Crie a classe Hotel com um HashSet<Hospede> como atributo e estes métodos: 
    - registrarEntrada(Hospede h): devolve boolean. 
    - registrarSaida(String documento): remove o hóspede com esse documento e devolve boolean. 
    - quantidade() e listar().

- Dica para o registrarSaida: o .remove() precisa de um objeto. Você só tem o documento, e o equals ignora o
nome. Crie um Hospede de amostra com esse documento e um nome vazio. 

- Na Main, registre 3 hóspedes e tente registrar um com documento repetido. 

- Registre a saída de um documento que existe e de um que não existe, imprimindo Saída registrada! ou Hóspede
não encontrado!. 

- Imprima a quantidade e liste os hóspedes. 

Esperado: o repetido é recusado, a primeira saída dá true, a segunda dá false, e a quantidade final é 2. */

package exercise14;

/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Hotel hotel = new Hotel();
        System.out.println("\n==============================");
        System.out.println("Entrada de hóspedes: ");
        System.out.println(hotel.registrarEntrada(new Hospede("1234123", "João")) ? "\nAdicionado": "\nNão adicionado!");
        System.out.println(hotel.registrarEntrada(new Hospede("82929", "Barbara")) ? "\nAdicionado": "\nNão adicionado!");
        System.out.println(hotel.registrarEntrada(new Hospede("1234", "Maria")) ? "\nAdicionado": "\nNão adicionado!");
        System.out.println(hotel.registrarEntrada(new Hospede("1234123", "João")) ? "\nAdicionado": "\nNão adicionado!");
        
        System.out.println("\n==============================");
        System.out.println("Saída de hóspedes: ");
        
        System.out.println(hotel.registrarSaida("123") ? "\nSaída registrada!" : "\nHóspede não encontrado!" ) ;
        System.out.println(hotel.registrarSaida("1234") ? "\nSaída registrada!" : "\nHóspede não encontrado!");

        hotel.quantidadeHospedes();
        hotel.listarHospedes();
    }
}
