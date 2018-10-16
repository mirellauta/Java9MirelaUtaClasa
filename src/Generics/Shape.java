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
    class Shape { /* ... */ }
    class Circle extends Shape { /* ... */ }
    class Rectangle extends Shape { /* ... */ }
    class Node<T> { /* ... */ }
    Node<Circle> nc = new Node<>();
 //   Node<Shape>  ns = nc;
//node circle nu poate extinde alt tip

