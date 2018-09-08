/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Mirela
 */
public class ExecutorCalcule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Calculator unCalculator=new Calculator();
        
        System.out.println("Introduceți primul număr:");
       Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
         System.out.println("Introduceți al doilea număr:");
        Scanner sc1 = new Scanner(System.in);
        int j = sc1.nextInt();
        
        int iesireAdunare=unCalculator.aduna(i,j);
      //15  System.out.println("Rezultat adunare="+iesireAdunare);
       System.out.printf("Rezultat adunare: %s%n", iesireAdunare);
        int iesireScadere=unCalculator.scade(j,i); 
       // System.out.println("Rezultat scadere="+iesireScadere);
        System.out.printf("Rezultat scădere: %s%n", iesireScadere);
        int iesireInmultire=unCalculator.inmulteste(j,i); 
    //    System.out.println("Rezultat inmultire="+iesireInmultire);
      System.out.printf("Rezultat înmulțire: %s%n", iesireInmultire);
         int iesireImpartire=unCalculator.imparte(j,i); 
      // System.out.println("Rezultat impartire="+iesireImpartire);
           System.out.printf("Rezultat împărțire: %s%n", iesireImpartire);
 
    }
}
