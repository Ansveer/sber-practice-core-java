package ru.sber.base.syntax.task4.book;

public class BookMain {
    public static void main(String[] args) {
        Author author = new Author("А.С.Пушкин", "М", "052342@mail.ru");
        Book book = new Book("Капитанская дочка", author, 1836);
        book.toString();
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
}
