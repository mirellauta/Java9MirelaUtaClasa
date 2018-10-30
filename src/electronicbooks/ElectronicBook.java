/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package electronicbooks;

/**
 *
 * @author Mirela
 */
public class ElectronicBook {


    public static final int An2010 = 2010;
    public static final int An2011 = 2011;
    public static final int An2012 = 2012;
    public static final int An2013 = 2013;
    public static final int An2014 = 2014;
    public static final int An2015 = 2015;
    public static final int An2016 = 2016;
    public static final int An2017 = 2017;
    public static final int An2018 = 2018;


    public enum YearOfPublication {
        An2010, An2011,An2012, An2013, An2014,An2015, An2016, An2017, An2018;


    }

    //formate ebook
    public static final String PDF = "PDF";
    public static final String TXT = "TXT";
    public static final String EPUB = "EPUB";
    public static final String HTML = "HTML";
    public static final String HTM = "HTM";
    public static final String DJVU = "DJVU";
    public static final String RTF = "RTF";
    public static final String DOCX = "DOCX";
    public static final String DOC = "DOC";
    public static final String CHM = "CHM";


    public enum FormatOfElectronicBook {
     PDF, TXT, EPUB, HTML, HTM, DJVU, RTF, DOCX, DOC, CHM
    }

    
    //descriu obiectul
    private String ISBN;
    private String title;
    private String[] authors;
    private YearOfPublication yearOfPublication;
    private float price;
    private String[] downloadLinks;
    private String[] remarksAndNotes;
    private FormatOfElectronicBook electronicFormat;
    private String publisher;

    //constructori
    public ElectronicBook(String ISBN, String[] authors) {
        this.ISBN = ISBN;
        this.authors = authors;
    }

    public ElectronicBook(String ISBN, String title, String[] authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.authors = authors;
    }

    public ElectronicBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication) {
        this.ISBN = ISBN;
        this.title = title;
        this.authors = authors;
        this.yearOfPublication = yearOfPublication;
    }

    public ElectronicBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, String[] downloadLinks,
            String[] remarksAndNotes, String publisher) {
        this.ISBN = ISBN;
        this.title = title;
        this.authors = authors;
        this.yearOfPublication = yearOfPublication;
        this.downloadLinks = downloadLinks;
        this.remarksAndNotes = remarksAndNotes;
        this.publisher = publisher;
    }

    public ElectronicBook(String ISBN, String title, String[] authors,
            YearOfPublication yearOfPublication, float price,
            String[] downloadLinks, String[] remarksAndNotes,
            String publisher) {
        this.ISBN = ISBN;
        this.title = title;
        this.authors = authors;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
        this.downloadLinks = downloadLinks;
        this.remarksAndNotes = remarksAndNotes;
        this.publisher = publisher;
    }

    // get-set
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public YearOfPublication getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(YearOfPublication yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String[] getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(String[] downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public String[] getRemarksAndNotes() {
        return remarksAndNotes;
    }

    public void setRemarksAndNotes(String[] remarksAndNotes) {
        this.remarksAndNotes = remarksAndNotes;
    }

    public FormatOfElectronicBook getElectronicFormat() {
        return electronicFormat;
    }

    public void setElectronicFormat(FormatOfElectronicBook electronicFormat) {
        this.electronicFormat = electronicFormat;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}