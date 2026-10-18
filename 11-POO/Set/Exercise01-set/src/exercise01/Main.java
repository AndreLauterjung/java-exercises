/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author andrelauterjung
 */
public class Main
{
    public static void main(String[] args)
    {
        Set<String> nomes = new HashSet<>();
        
        nomes.add("André");
        nomes.add("João");
        
        for(String nome : nomes)
        {
            System.out.println(nome);
        }
    }
}
