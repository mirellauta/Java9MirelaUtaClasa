/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.List;

/**
 *
 * @author mirela.uta
 */
public class PrintClass {
      public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();

    }
}
//import java.util.List package; 