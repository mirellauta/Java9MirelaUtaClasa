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
class Node<T> implements Comparable<T> {
        public int compareTo(T obj) { 
        return 0;
        /* ... */ }

 
public static void main(String[] args){
    Node<String> node = new Node<>();
    Comparable<String> comp = node;
}

 }  