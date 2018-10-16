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
    public class Pair {
        public Pair(Object key, Object value) {
            this.key = key;
            this.value = value;

        }
        public Object getKey() { return key; }
        public Object getValue() { return value; }
        public void setKey(Object key)     { this.key = key; }
        public void setValue(Object value) { this.value = value; }
        private Object key;
        private Object value;
    }
//replace K and V with Object type parameter
//remove ; after method getKey() - line 18
//remove ; after method getValue() line 19