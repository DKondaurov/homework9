package pro.sky.java.course1;

import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.nameBook = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {

        return nameBook;
    }

    public Author getAuthor() {

        return author;
    }

    public int getYearOfPublication() {

        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

    public void printBook() {
        System.out.println(author.getName() + " " + author.getSurname() + ":" + nameBook + ":" + yearOfPublication);
    }

    public String toString() {
        return  author + ":" + nameBook + ":" + yearOfPublication;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && nameBook.equals(book.nameBook) && author.equals(book.author);
    }


    public int hashCode() {
        return Objects.hash(nameBook, author, yearOfPublication);
    }
}
