package ru.sber.base.syntax.task4.book;

public class Book {
    public String title;
    Author author = new Author();
    public int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
        return "";
    }
}
