/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Principal {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carros carro_N1 = new Carros();
        Carros carro_N2 = new Carros();
        Carros carro_N3 = new Carros();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca:");
        String marca = sc.nextLine();
        System.out.println("Modelo:");
        String nome  = sc.nextLine();
        System.out.println("Ano:");
        int ano      = sc.nextInt();
        System.out.println("Quantidade de portas:");
        int qtdPorta = sc.nextInt();
        carro_N1.cadastro(marca, nome, ano, qtdPorta);
        sc.nextLine();
        
        System.out.println("Marca:");
        String marca2= sc.nextLine();
        System.out.println("Modelo:");
        String nome2  = sc.nextLine();
        System.out.println("Ano:");
        int ano2      = sc.nextInt();
        System.out.println("Quantidade de portas:");
        int qtdPorta2 = sc.nextInt();
        carro_N2.cadastro(marca2, nome2, ano2, qtdPorta2);
        sc.nextLine();
        
        System.out.println("Marca:");
        String marca3 = sc.nextLine();
        System.out.println("Modelo:");
        String nome3  = sc.nextLine();
        System.out.println("Ano:");
        int ano3      = sc.nextInt();
        System.out.println("Quantidade de portas:");
        int qtdPorta3 = sc.nextInt();
        carro_N3.cadastro(marca3, nome3, ano3, qtdPorta3);
        
        System.out.printf(carro_N1.mostrar());
        System.out.printf(carro_N2.mostrar());
        System.out.printf(carro_N3.mostrar());
        
        
    }
    
}
