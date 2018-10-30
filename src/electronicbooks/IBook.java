/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package electronicbooks;

/**
 *
 * @author Mirela
 */
public class IBook extends ElectronicBook {

  
    public static final String APPIPAD = "Apple iPad";
    public static final String APPIPOD = "Apple iPod";
    public static final String APPIPHONE = "Apple iPhone";

  
    public enum iBooksReaders {
        APPIPAD, APPIPOD, APPIPHONE
    }


    private iBooksReaders recommendedReader;

   
    public IBook(String ISBN, String[] authors) {
        super(ISBN, authors);
    }

    public IBook(String ISBN, String title, String[] authors) {
        super(ISBN, title, authors);
    }

    public IBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication) {
        super(ISBN, title, authors, yearOfPublication);
    }

    public IBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, String[] downloadLinks,
            String[] remarksAndNotes, String publisher) {
        super(ISBN, title, authors, yearOfPublication, downloadLinks,
                remarksAndNotes, publisher);
    }

    public IBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, float price,
            String[] downloadLinks, String[] remarksAndNotes,
            String publisher) {
        super(ISBN, title, authors, yearOfPublication, price,
                downloadLinks, remarksAndNotes, publisher);
    }

    public IBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, float price,
            String[] downloadLinks, String[] remarksAndNotes,
            String publisher, iBooksReaders recommendedReader) {
        super(ISBN, title, authors, yearOfPublication, price,
                downloadLinks, remarksAndNotes, publisher);
        this.recommendedReader = recommendedReader;
    }


    public iBooksReaders getRecommendedReader() {
        return recommendedReader;
    }


    public void setRecommendedReader(iBooksReaders recommendedReader) {
        this.recommendedReader = recommendedReader;
    }

}
