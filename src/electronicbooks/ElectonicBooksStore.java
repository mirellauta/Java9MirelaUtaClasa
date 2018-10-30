/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package electronicbooks;

import java.util.HashMap;
/**
 *
 * @author Mirela
 */

public class ElectonicBooksStore {


    public static void main(String[] args) {

//creaza cartile
        ElectronicBook[] books;
        books = new ElectronicBook[3];

  
        EBook eBook = new EBook("110-110-10-110-1", new String[]{"Autor1",
            "Autor2", "Autor3"});
        eBook.setTitle("Titlu1");
        eBook.setPrice(25.10f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DOCX);
        eBook.setRecommendedReader(EBook.eBooksReaders.POCKETBOOK);
        eBook.setPublisher("Editura1");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.An2014);
        eBook.setDownloadLinks(new String[]{
            "http://url1.com"
        });
        eBook.setRemarksAndNotes(new String[]{"Fara recomandare"});
//prima carte
        books[0] = eBook;

       
        eBook = new EBook("110-110-110-2-7", new String[]{"Autor10"});
        eBook.setTitle("Titlu2");
        eBook.setPrice(200.51f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.PDF);
        eBook.setRecommendedReader(EBook.eBooksReaders.SONY);
        eBook.setPublisher("Editura2");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.An2018);
        eBook.setDownloadLinks(new String[]{
            "http://www.url2.com"
        });
        eBook.setRemarksAndNotes(new String[]{""});
   //a doua carte
        books[1] = eBook;

 // creez un ibook
        IBook iBook = new IBook("110-110-110-2-9", new String[]{"Autor3", "Autor20"});
        iBook.setTitle("Titlu3");
        iBook.setPrice(18.16f);
        iBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.EPUB);
        iBook.setRecommendedReader(IBook.iBooksReaders.APPIPAD);
        iBook.setPublisher("Editura3");
        iBook.setYearOfPublication(ElectronicBook.YearOfPublication.An2015);
        iBook.setDownloadLinks(new String[]{
            "https://url3.com"
        });
        iBook.setRemarksAndNotes(new String[]{"O carte de citit in vacanta"});
      // a treia carte
        books[2] = iBook;

       //listeaza cartile
        for (ElectronicBook book : books) {
    
            
            System.out.println("Tilu: " + book.getTitle());
            String[] authorsOfThisBook = book.getAuthors();
            System.out.printf("Autor: ");
            for (String authors : authorsOfThisBook) {
                System.out.printf(" %s, " , authors);
            }

      
           


            System.out.println("\nPret: " + String.format("%.2f", book.getPrice()) + " Lei");

         
            HashMap<ElectronicBook.FormatOfElectronicBook, String> bookFormat = new HashMap<>();

                 bookFormat.put(ElectronicBook.FormatOfElectronicBook.DJVU, ElectronicBook.DJVU);
            bookFormat.put(ElectronicBook.FormatOfElectronicBook.DOC, ElectronicBook.DOC);
            bookFormat.put(ElectronicBook.FormatOfElectronicBook.DOCX, ElectronicBook.DOCX);

            bookFormat.put(ElectronicBook.FormatOfElectronicBook.EPUB, ElectronicBook.EPUB);
               bookFormat.put(ElectronicBook.FormatOfElectronicBook.HTM, ElectronicBook.HTM);
            bookFormat.put(ElectronicBook.FormatOfElectronicBook.HTML, ElectronicBook.HTML);
 
            bookFormat.put(ElectronicBook.FormatOfElectronicBook.PDF, ElectronicBook.PDF);
      
            bookFormat.put(ElectronicBook.FormatOfElectronicBook.RTF, ElectronicBook.RTF);
            bookFormat.put(ElectronicBook.FormatOfElectronicBook.TXT, ElectronicBook.TXT);
            
            System.out.println("Format: " + bookFormat.get(book.getElectronicFormat()));

  
            if (book instanceof EBook) {
                EBook eBookReader = (EBook) book;

                HashMap<EBook.eBooksReaders, String> recomendedEBookReader = new HashMap<>();

                recomendedEBookReader.put(EBook.eBooksReaders.AMAZON, EBook.AMAZON);
                recomendedEBookReader.put(EBook.eBooksReaders.BNNOOK, EBook.BNNOOK);
                recomendedEBookReader.put(EBook.eBooksReaders.FIRE, EBook.FIRE);
                recomendedEBookReader.put(EBook.eBooksReaders.KOBOARC, EBook.KOBOARC);
                recomendedEBookReader.put(EBook.eBooksReaders.KOBOEREADER, EBook.KOBOEREADER);
                recomendedEBookReader.put(EBook.eBooksReaders.NOOK, EBook.NOOK);
                recomendedEBookReader.put(EBook.eBooksReaders.POCKETBOOK, EBook.POCKETBOOK);
                recomendedEBookReader.put(EBook.eBooksReaders.POCKETTOUCH, EBook.POCKETTOUCH);
                recomendedEBookReader.put(EBook.eBooksReaders.SONY, EBook.SONY);

                System.out.println("Reader: " + recomendedEBookReader.get(eBookReader.getRecommendedReader()));

            } else if (book instanceof IBook) {
                IBook iBookReader = (IBook) book;

                HashMap<IBook.iBooksReaders, String> recomendedIBookReader = new HashMap<>();

                recomendedIBookReader.put(IBook.iBooksReaders.APPIPAD, IBook.APPIPAD);
                recomendedIBookReader.put(IBook.iBooksReaders.APPIPHONE, IBook.APPIPHONE);
                recomendedIBookReader.put(IBook.iBooksReaders.APPIPOD, IBook.APPIPOD);

                System.out.println("Reader: " + recomendedIBookReader.get(iBookReader.getRecommendedReader()));
            }

      
            String[] downloadLinksOfThisBook = book.getDownloadLinks();
            for (String links : downloadLinksOfThisBook) {
                System.out.println("Url: " + links);
            }


            System.out.println("Editura: " + book.getPublisher());

      
            HashMap<ElectronicBook.YearOfPublication, Integer> yearMap = new HashMap<>();

          
            yearMap.put(ElectronicBook.YearOfPublication.An2010, ElectronicBook.An2010);
            yearMap.put(ElectronicBook.YearOfPublication.An2011, ElectronicBook.An2011);
            yearMap.put(ElectronicBook.YearOfPublication.An2012, ElectronicBook.An2012);
            yearMap.put(ElectronicBook.YearOfPublication.An2013, ElectronicBook.An2013);
            yearMap.put(ElectronicBook.YearOfPublication.An2014, ElectronicBook.An2014);
            yearMap.put(ElectronicBook.YearOfPublication.An2015, ElectronicBook.An2015);
            yearMap.put(ElectronicBook.YearOfPublication.An2016, ElectronicBook.An2016);
            yearMap.put(ElectronicBook.YearOfPublication.An2017, ElectronicBook.An2017);
            yearMap.put(ElectronicBook.YearOfPublication.An2018, ElectronicBook.An2018);

            System.out.println("Anul aparitiei: " + yearMap.get(book.getYearOfPublication()));
            System.out.println("ISBN: " + book.getISBN());
 
            String[] remarksOfThisBook = book.getRemarksAndNotes();
            for (String remarks : remarksOfThisBook) {
                System.out.println("Recomandare: " + remarks);
            }
            System.out.println("------------------------------------------------------------------");
        }
    }
}