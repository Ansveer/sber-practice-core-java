package ru.sber.base.syntax.task2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String hello = in.next();
        System.out.println("Hello, " + hello);

    }

}
