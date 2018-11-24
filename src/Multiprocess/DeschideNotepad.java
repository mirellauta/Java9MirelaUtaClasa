/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package Multiprocess;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Mirela
 */
public class DeschideNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
            
            Process p1 = pb.start();
            System.out.println("Prima instanta a fost creata la data de: " + new Date());
            TimeUnit.SECONDS.sleep(1);

            Process p2 = pb.start();
            System.out.println("A doua instanta a fost dreata la data de: " + new Date());
            TimeUnit.SECONDS.sleep(2);

            Process p3 = pb.start();
            System.out.println("A treia instanta a fost creata la data de: " + new Date());

        } catch (IOException e) {
            System.out.println("Iata ca a fost gasita exceptia " + e);
        } catch (InterruptedException e) {
            System.out.println("Programul nu merge pentru ca a intampinat eroarea " + e);
}
    }
    
}
