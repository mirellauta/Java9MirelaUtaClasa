/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Mirela
 */
public class strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        1 What is the initial capacity of the following string builder?
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        
        Answer: 42. (initial empty builder capacity,16, + string length,26.
         */
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");

        sb.capacity();

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        /*
        Consider the following string:
        String hannah = "Did Hannah see bees? Hannah did.";
        a.   Question: What is the value displayed by the expression hannah.length()?
        Answer: 32.
        b.   Question: What is the value returned by the method call hannah.charAt(12)?
        Answer: e.
        c.   Question: Write an expression that refers to the letter b in the string referred to by hannah.
        
        Answer: hannah.charAt(15).
         */
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println(hannah.charAt(15));

        /*
        3 How long is the string returned by the following expression? What is the string?
        "Was it a car or a cat I saw?".substring(9, 12)
        
        Answer: "Was it a car or a cat I saw?".substring(9, 12) is "car".
        "car".length() is 3 
         */
        System.out.println("Was it a car or a cat I saw?".substring(9, 12).length());

        /*
        4 Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
        String hi = "Hi, ";
        String mom = "mom.";
        
        Answer: First posibility is by  using operator "+" and in this case we have hi + mom
                Second posibility is by using concat method hi.concat(mom).
         */
        String hi = "Hi, ";
        String mom = "mom.";
        //1
        System.out.println(hi + mom);
        //2
        System.out.println(hi.concat(mom));

        /*
        5. Write a program that computes your initials from your full name and displays them.
         */
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String frstNme = scn.nextLine();

        System.out.println("Enter Last Name:");
        String lstNme = scn.nextLine();

        System.out.println("Your Name Initial Is: " + frstNme.substring(0, 1) + "." + lstNme.substring(0, 1) + ".");

        scn.close();

        /*
        6. Which are the derived classes from Number?
        
        Answer: AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double,
        Float, Integer, Long, Short
         */
    }
    
}
