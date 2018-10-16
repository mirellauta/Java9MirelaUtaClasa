/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author mirela.uta
 */
public final class Algorithm {
   public static <T> T max(T x, T y) {
            return x > y ? x : y;
        }
//operatorii relationali functioneaza numai cu tipuri primitive
}
