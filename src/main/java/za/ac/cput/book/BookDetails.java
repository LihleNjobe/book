package za.ac.cput.book;

/**
 * @Author: Lihle Njobe (218193882)
 * Applications Development Practice 3 Assignment 3
 * The application displays the details of a book.
 */
public class BookDetails {


    private String title;
    private String author;
    private String ISBN;
    private int year;


    public BookDetails(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;

    }

    public void getTitle ()  {
        System.out.println("Title: " + title);
    }

    public void getAuthor() {
        System.out.println("Author: " + author);
    }

    public void getISBN() {
        System.out.println("ISBN: " + ISBN);
    }
    public void getYear() {
        System.out.println("Year: " + year);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setYear(int year) {
        this.year = year;
    }
}



