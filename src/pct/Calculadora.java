/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author RdKill
 */
public class Calculadora {
    public static void main(String[] args) {
        //Declaração de variaveis
        int n1, n2, total;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");
        
        //Apresentação de Soma Simples -- Carlos
        System.out.println("Soma Simples\n");
        
        //Entrada de dados
        System.out.print("Informe N1:");
        n1 = entrada.nextInt();
        System.out.print("Informe N2:");
        n2 = entrada.nextInt();
        
        
        //Processamento
        total = n1 + n2;
        
        //Saída
        System.out.printf("\n\t\t%d + %d = %d\n", n1, n2, total);
        
        //Apresentação da Subtração -- Amanda
        System.out.println("Subtração\n");
        
        //Entrada
        System.out.print("Informe N1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe N2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        total = n1 - n2;
        
        //Saída
        System.out.printf("\n\t\t%d - %d = %d\n", n1, n2, total);
        
        //Apresentação da Multiplicação - Camilla
        System.out.println("Multiplicação\n");
        
        //Entrada
        System.out.print("Informe N1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe N2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        total = n1 * n2;
        
        //Saída
        System.out.printf("\n\t\t %d * %d = %d\n", n1, n2, total);
                
       
    
                
   
                
              
     
    }
}
