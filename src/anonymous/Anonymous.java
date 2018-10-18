/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package anonymous;

/**
 *
 * @author Mirela
 */
public class Anonymous {
    
static EnglishGreeting a1; 
static FrenchGreeting a2; 
static SpanishGreeting a3;

public static void main(String[] args) {
a1= new EnglishGreeting(); 
a2= new FrenchGreeting();
a3= new SpanishGreeting();
 
//afisez mesajele
afisezMesaj();
    }
//

    private static void afisezMesaj(){
    a1.greetSomeone("world");
    a2.greetSomeone("tout le monde");
    a3.greetSomeone("mundo");
    }
}
