package ru.sber.base.syntax.task13;

public class Store {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        System.out.println(shelf.toString());
        shelf.put();
        shelf.put();
        System.out.println(shelf.getCnt());
    }
}
