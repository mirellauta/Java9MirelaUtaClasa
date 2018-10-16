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
    public class Singleton<T> {
        private  T instance = null;
        public  T getInstance() {
            if (instance == null)
            instance = (T) new Singleton<T>();
            return instance;
        }
        
    }
//static context reference non-static type variable 