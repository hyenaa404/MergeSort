
package model;

/**
 *
 * @author nhs
 */
public class Book  implements Comparable<Book> {
    private String isbn;
    private String title;
    private String author;
    private int yearPublic;
    private String publisher;
    private String imaS;
    private String imaM;
    private String imaL;

    public Book(){
    }

    public Book(String isbn, String title, String author, int yearPublic, String publisher, String imaS, String imaM, String imaL) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
        this.publisher = publisher;
        this.imaS = imaS;
        this.imaM = imaM;
        this.imaL = imaL;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImaS() {
        return imaS;
    }

    public void setImaS(String imaS) {
        this.imaS = imaS;
    }

    public String getImaM() {
        return imaM;
    }

    public void setImaM(String imaM) {
        this.imaM = imaM;
    }

    public String getImaL() {
        return imaL;
    }

    public void setImaL(String imaL) {
        this.imaL = imaL;
    }

    @Override
    public String toString() {
        return isbn + "," + title + "," + author + "," + yearPublic + "," + publisher + "," + imaS + "," + imaM + "," + imaL ;
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn.compareToIgnoreCase(o.isbn);
    }
    
    
}
