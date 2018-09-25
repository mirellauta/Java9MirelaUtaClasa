package anonymous;

/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author Mirela
 */
      public class SpanishGreeting implements HelloWorld { 
            String name; 
        //     @Override 
            public void greetSomeone(String someone) { 
                name = someone; 
                 System.out.printf("Spanish: Hola %s%n", name);
            } 
      }