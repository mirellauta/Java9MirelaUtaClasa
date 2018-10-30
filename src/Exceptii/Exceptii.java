/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/** 
* ===========Bine de stiut===================
* In Java tratarea exceptiilor este obligatorie.
* O exceptie este un eveniment exceptional care determina oprirea functionarii programului. 
* Pot exista cazuri reale sau pot fi erori de programare.
* Crearea unui obiect de tip exceptie se numeste "aruncarea unei exceptii". 
* Codul este analizat de un analizor de exceptii (exception handler), interceptat si apoi tratat(catch).
* Deci la aparitia unei erori este aruncata o exceptie si este prinsa pentru a o trata. 
* Daca programul nu gaseste un analizor de exceptii functionarea acestuia inceteaza=> IN JAVA TRATATEA ERORILOR ESTE O CONSTRANGERE.
* Tratatarea exceptiilor se face prin intermediul blocurilor de instructiuni:
* try{
* // instructiuni care genereaza erori
* } 
* catch(TipExceptie1 variabila){
* // ce se intampla daca TipExceptie1
* } 
* finally{
* // ce se intampla indiferent daca avem sau nu exceptii
* }
* ==== todo: de vazut cum se arunca exceptiile dintr-o metoda in alta ====
* 
* 
* 
* 
 */

/**
 *
 * @author mirela.uta
 */
public class Exceptii {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) throws IOException {
        if (args.length>0){
        citesteFisier(args[0]); 
  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date=new Date();    
        File testFile = new File(args[0]);
    setContents(testFile, "Ati rulat aceasta aplicatie la data: "+ dateFormat.format(date));
        }
        else {
              System.out.println("Nu ati stabilit numele fisierului"); 
        }


        
    }
    
    
    public static void citesteFisier(String fis) throws IOException{
    FileReader f=null;
  try
  {
  System.out.println("Deschidem fisierul "+ fis);
  f=new FileReader(fis);
  // daca exista fisierul si poate fi citit

String content = new String(Files.readAllBytes(Paths.get(fis)));
      System.out.println(content);
      
  } 
  catch (FileNotFoundException e){
  System.out.println("Fisierul nu exista");
  System.out.println("Exceptie: "+ e.getMessage());
  System.exit(1);
  }
  catch (IOException e){
  System.out.println("Nu pot citi fișierul");
  e.printStackTrace();
  }
  finally {
  // inchide fisierul 
   if (f !=null){
    try {
        f.close();
        System.out.println("Totul este in regula");
    }
        catch (IOException e){
        System.out.println("Nu pot inchide fișierul"); 
        e.printStackTrace();
    }   
   }
  } // end try
     }
    
   public static void setContents(File file, String contents)
                                 throws FileNotFoundException, IOException {
    if (file == null) {
      throw new NullPointerException("File must not be null.");
    }
    if (contents == null) {
      throw new NullPointerException("Contents must not be null.");
    }
    if (!file.exists()) {
      throw new FileNotFoundException ("File does not exist: " + file);
    }
    if (!file.isFile()) {
      throw new IllegalArgumentException("Must not be a directory: " + file);
    }
    if (!file.canWrite()) {
      throw new IllegalArgumentException("File cannot be written: " + file);
    }

    try (Writer output = new FileWriter(file,true)) {
      output.write(contents+"\n");
    }
    
  }
}
