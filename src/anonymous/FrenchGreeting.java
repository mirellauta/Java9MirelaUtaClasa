/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package anonymous;

/**
 *
 * @author Mirela
 */
   public class FrenchGreeting implements HelloWorld { 
            String name; 

       //     @Override 
            public void greetSomeone(String someone) { 
                name = someone; 
              System.out.printf("French:  Salut %s%n", name);
            } 
      }
