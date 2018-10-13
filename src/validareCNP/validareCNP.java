/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package validareCNP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Mirela
 */
public class validareCNP {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        System.out.println("Exercise: Please write your CNP ==> It has 13 digits and first digit could be 1 or 2 and next 8 digits are for \n"
+ "MMDDYYYY, where MM is month on 2 digits, DD day on 2 digits and  YYYY is year on 4 digits.\n");

 System.out.println("Rezolvare:\n===============================================");
    Scanner cnp=new Scanner(System.in);
System.out.println("Introduceti cnp-ul: ");
   //citeste ce am introdus de la tastatura
   String cnpc=cnp.next();
   //validare 13 digiti cu regex 
   boolean result1=cnpc.matches("^(\\d{13}|\\s*)?$");
   if (!result1){System.out.println("Cnp-ul introdus nu contine 13 cifre!");}
   //else {System.out.println("Cnp-ul introdus contine 13 cifre");}
  
   //first digit 
      boolean result2=cnpc.substring(0, 1).matches("[1-2]");
  if (!result2){System.out.println("Cnp-ul introdus nu are prima cifra corecta!");}
 //  else {System.out.println("Cnp-ul este validat partial");}
   //validare luna
 boolean result3=cnpc.substring(1, 3).matches("^(?:1[0-2]|0[1-9])$");
  if (!result3){System.out.println("Cnp-ul introdus nu are luna corecta!");}
//   else {System.out.println("Cnp-ul introdus contine 13 cifre");}
    //validare zi
 boolean result4=cnpc.substring(3, 5).matches("(0?[1-9]|[12][0-9]|3[01])");
  if (!result4){System.out.println("Cnp-ul introdus nu are ziua corecta!");}
 //validare an
 boolean result5=cnpc.substring(5, 7).matches("([0-9][0-9]?[0-9][0-9])$");
  if (!result3){System.out.println("Cnp-ul introdus nu are anul corect!");} 

}
 
}
