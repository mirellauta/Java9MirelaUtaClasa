/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package anonymous;

/**
 *
 * @author Mirela
 */
      public class EnglishGreeting implements HelloWorld { 
            String name ; 
       //  @Override 
            public void greetSomeone(String someone) { 
                name = someone; 
                System.out.printf("English: Hello %s%n", name);
                 
            } 
      }