package ru.sber.base.syntax.task2;
public class Task3 {

    public static void main(String[] args){

        int count = 0;
        while (count != 6) {
            System.out.println("* ".repeat(10));
            System.out.println(" *".repeat(9));
            count += 2;
        }
    }
}
