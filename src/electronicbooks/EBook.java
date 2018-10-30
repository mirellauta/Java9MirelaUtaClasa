/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package electronicbooks;

/**
 *
 * @author Mirela
 */
public class EBook extends ElectronicBook {

  
    public static final String AMAZON = "Amazon Kindle";
    public static final String FIRE = "Fire";
    public static final String BNNOOK = "Barnes & Noble Nook";
    public static final String NOOK = "Nook Tablet";
    public static final String SONY = "Sony Reader";
    public static final String KOBOEREADER = "Kobo eReader";
    public static final String KOBOARC = "Kobo Arc";
    public static final String POCKETBOOK = "PocketBook Reader";
    public static final String POCKETTOUCH = "PoketBook Touch";


    public enum eBooksReaders {
        AMAZON, FIRE, BNNOOK, NOOK, SONY, KOBOEREADER,
        KOBOARC, POCKETBOOK, POCKETTOUCH
    }

    /**
     * recommended reader
     */
    private eBooksReaders recommendedReader;

    
    public EBook(String ISBN, String[] authors) {
        super(ISBN, authors);
    }

    public EBook(String ISBN, String title, String[] authors) {
        super(ISBN, title, authors);
    }

    public EBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication) {
        super(ISBN, title, authors, yearOfPublication);
    }

    public EBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, String[] downloadLinks,
            String[] remarksAndNotes, String publisher) {
        super(ISBN, title, authors, yearOfPublication, downloadLinks,
                remarksAndNotes, publisher);
    }

    public EBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, float price,
            String[] downloadLinks, String[] remarksAndNotes, String publisher) {
        super(ISBN, title, authors, yearOfPublication, price,
                downloadLinks, remarksAndNotes, publisher);
    }

    public EBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, float price, String[] downloadLinks,
            String[] remarksAndNotes, String publisher, eBooksReaders recommendedReader) {
        super(ISBN, title, authors, yearOfPublication, price, downloadLinks,
                remarksAndNotes, publisher);
        this.recommendedReader = recommendedReader;
    }


    public eBooksReaders getRecommendedReader() {
        return recommendedReader;
    }

  
    public void setRecommendedReader(eBooksReaders recommendedReader) {
        this.recommendedReader = recommendedReader;
    }

}